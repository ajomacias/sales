package demo.Services;

import java.util.List;
import demo.Dto.ProveedorDTO;
import demo.models.Proveedor;

public interface ProveedorService {

    public List<ProveedorDTO> obtenerProveedores();

    public Proveedor obtenerProveedorPorId(Long id);

    public ProveedorDTO crearProveedor(ProveedorDTO proveedorDTO, String codigoCatalogo);

    public List<ProveedorDTO> obtenerProveedoresPorCategoria(String codigoCatalogo);

    public void eliminarProveedorPorId(Long id);

    public ProveedorDTO editarProveedor(ProveedorDTO proveedorDTO);
    
}
