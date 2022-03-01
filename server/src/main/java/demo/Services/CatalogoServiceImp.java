package demo.Services;

import demo.Dto.CatalogoDTO;
import demo.Repository.CatalogoRepository;
import demo.models.Catalogo;
import demo.exception.ResourceNotFoundException;

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
        Catalogo catalogo = mapearEntidad(catalogoDTO);
        Catalogo nuevoCatalogo = catalogoRepository.save(catalogo);

        return mapearDto(nuevoCatalogo);
    }

    @Override
    public List<CatalogoDTO> obtenerCatalogos() 
    {
        List<Catalogo> catalogoa = catalogoRepository.findAll();

        return catalogoa.stream().map(catalogo->mapearDto(catalogo)).collect(Collectors.toList());
    }

    @Override
    public CatalogoDTO obtenerCatalogoPorId(Long id) 
    {
        Catalogo catalogo = catalogoRepository.findById(id)
        .orElseThrow(()->new ResourceNotFoundException("Catalogo", "id", id));
        return mapearDto(catalogo);
    }

    @Override
    public CatalogoDTO editarCatalogo(Long id, CatalogoDTO catalogoDTO) 
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void eliminarCatalogoPorId(Long id) 
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
        catalogoDTO.setId(catalogo.getId());
        catalogoDTO.setCodigo(catalogo.getCodigo());
        catalogoDTO.setTipo(catalogo.getTipo());
        catalogoDTO.setValor(catalogo.getValor());

        return catalogoDTO;
        
    } 
    private Catalogo mapearEntidad(CatalogoDTO catalogoDTO)
    {
        Catalogo catalogo = new Catalogo();
        catalogo.setId(catalogoDTO.getId());
        catalogo.setCodigo(catalogoDTO.getCodigo());
        catalogo.setTipo(catalogoDTO.getTipo());
        catalogo.setValor(catalogoDTO.getValor());

        return catalogo;
    }

    
}
