package demo.Services;

import demo.Dto.CatalogoDTO; 
import java.util.List;

public interface CatalogoService {

    public CatalogoDTO crearCatalogo(CatalogoDTO catalogoDTO);

    public List<CatalogoDTO> obtenerCatalogos();

    public CatalogoDTO obtenerCatalogoPorId(String id);
    
    public CatalogoDTO editarCatalogo(String id, CatalogoDTO catalogoDTO);

    public void eliminarCatalogoPorId(String id);

    public List<CatalogoDTO> obtenerCatalogosPorTipos(String tipo);

}
