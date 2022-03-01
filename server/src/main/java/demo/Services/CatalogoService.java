package demo.Services;

import demo.Dto.CatalogoDTO; 
import java.util.List;

public interface CatalogoService {

    public CatalogoDTO crearCatalogo(CatalogoDTO catalogoDTO);

    public List<CatalogoDTO> obtenerCatalogos();

    public CatalogoDTO obtenerCatalogoPorId(Long id);
    
    public CatalogoDTO editarCatalogo(Long id, CatalogoDTO catalogoDTO);

    public void eliminarCatalogoPorId(Long id);

    public List<CatalogoDTO> obtenerCatalogosPorTipos(String tipo);

}
