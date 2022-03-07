package demo.Services;

import demo.Dto.CatalogoDTO;
import demo.Dto.CatalogoRespuesta;
import demo.Repository.CatalogoRepository;
import demo.models.Catalogo;
import demo.exception.*;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

@Service
public class CatalogoServiceImp implements CatalogoService {

    @Autowired CatalogoRepository catalogoRepository;
    
    @Override
    public CatalogoDTO crearCatalogo(CatalogoDTO catalogoDTO)
    {
        boolean exist = catalogoRepository.existsById(catalogoDTO.getCodigo());

        if(exist)
           throw new ResourceRepeatIdException("catalogo", "codigo", catalogoDTO.getCodigo());

        Catalogo catalogo = mapearEntidad(catalogoDTO);
        catalogo = catalogoRepository.save(catalogo);

        return mapearDto(catalogo);
    }

    @Override
    public CatalogoRespuesta obtenerCatalogos(int numeroPagina, int tamañoPagina,String sortBy,String sortDir) 
    {
        Sort sort = sortDir.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortBy).ascending() : Sort.by(sortBy).descending();
        Pageable pageable = PageRequest.of(numeroPagina,tamañoPagina,sort);
        Page<Catalogo> catalogos = catalogoRepository.findAll(pageable);
        List<Catalogo> catalogosList = catalogos.getContent();
        List<CatalogoDTO> catalogosDtoList = catalogosList.stream().map(catalogo->mapearDto(catalogo)).collect(Collectors.toList());
        CatalogoRespuesta catalogoRespuesta = new CatalogoRespuesta();
        catalogoRespuesta.setContenido(catalogosDtoList);
        catalogoRespuesta.setNumeroPagina(catalogos.getNumber());
        catalogoRespuesta.setTamañoPagina(catalogos.getSize());
        catalogoRespuesta.setTotalElementos(catalogos.getTotalElements());
        catalogoRespuesta.setTotalPaginas(catalogos.getTotalPages());
        catalogoRespuesta.setUltimo(catalogos.isLast());

        return catalogoRespuesta;
    }

    @Override
    public CatalogoDTO obtenerCatalogoPorId(String id) 
    {
        Catalogo catalogo = catalogoRepository.findById(id)
        .orElseThrow(()->new ResourceNotFoundException("Catalogo", "id", id));
        return mapearDto(catalogo);
    }

    @Override
    public CatalogoDTO editarCatalogo(String id, CatalogoDTO catalogoDTO) 
    {
        if(catalogoDTO.getCodigo()!= null)
        throw new ResourceBadRequestException("Body no cumple con los requisitos asegurece de no enviar el codigo");

        Catalogo catalogo = catalogoRepository.findById(id)
        .orElseThrow(()-> new ResourceNotFoundException("catalogo","codigo", id));

        Catalogo catalogEdit = mapearEntidad(catalogoDTO);
        catalogEdit.setCodigo(id);
        catalogo = catalogoRepository.save(catalogEdit);

        return mapearDto(catalogo);
    }

    @Override
    public void eliminarCatalogoPorId(String id) 
    {
        catalogoRepository.findById(id)
        .orElseThrow(()-> new ResourceNotFoundException("catalogo", "id", id));
        catalogoRepository.deleteById(id);
    }

    @Override 
    
    public List<CatalogoDTO> obtenerCatalogosPorTipos(String tipo)
    {
        List<Catalogo> catalogos = catalogoRepository.findByType(tipo);
        return catalogos.stream().map(catalogo->mapearDto(catalogo)).collect(Collectors.toList());
    }

    private CatalogoDTO mapearDto(Catalogo catalogo)
    {
        CatalogoDTO catalogoDTO = new CatalogoDTO();
        catalogoDTO.setCodigo(catalogo.getCodigo());
        catalogoDTO.setTipo(catalogo.getTipo());
        catalogoDTO.setValor(catalogo.getValor());

        return catalogoDTO;
        
    } 
    private Catalogo mapearEntidad(CatalogoDTO catalogoDTO)
    {
        Catalogo catalogo = new Catalogo();
        catalogo.setCodigo(catalogoDTO.getCodigo());
        catalogo.setTipo(catalogoDTO.getTipo());
        catalogo.setValor(catalogoDTO.getValor());

        return catalogo;
    }
}