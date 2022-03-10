package demo.Services;

import java.util.List;
import demo.Dto.ProveedorDTO;
import demo.Dto.ProveedorRespuesta;

public interface ProveedorService {

    public ProveedorRespuesta obtenerProveedores(int nuPag, int sizePag, String sortBy, String sortDir);

    public ProveedorDTO obtenerProveedorPorId(Long id);

    public ProveedorDTO crearProveedor(ProveedorDTO proveedorDTO, String codigoCatalogo);

    public List<ProveedorDTO> obtenerProveedoresPorCategoria(String codigoCatalogo);

    public void eliminarProveedorPorId(Long id);

    public ProveedorDTO editarProveedor(ProveedorDTO proveedorDTO);
    
}
