package demo.Services;

import demo.Dto.CatalogoDTO;
import demo.Repository.CatalogoRepository;
import demo.models.Catalogo;
import demo.exception.*;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

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
    public List<CatalogoDTO> obtenerCatalogos() 
    {
        List<Catalogo> catalogoa = catalogoRepository.findAll();

        return catalogoa.stream().map(catalogo->mapearDto(catalogo)).collect(Collectors.toList());
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
        List<Catalogo> catalogos = catalogoRepository.getByType(tipo);
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
