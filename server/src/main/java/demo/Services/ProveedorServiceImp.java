package demo.Services;

import java.util.List;
import java.util.stream.Collectors;

import demo.Dto.ProveedorDTO;
import demo.Repository.CatalogoRepository;
import demo.Repository.ProveedorRepository;
import demo.exception.ResourceNotFoundException;
import demo.exception.SalesException;
import demo.models.Catalogo;
import demo.models.Proveedor;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ProveedorServiceImp implements ProveedorService {

    @Autowired
    private ProveedorRepository proveedorRepository;
    @Autowired
    CatalogoRepository catalogoRepository;

    @Override
    public ProveedorDTO crearProveedor(ProveedorDTO proveedorDTO, String codigoCatalogo) {

        verifyDto(proveedorDTO,1);

        Catalogo catalogo = verificarCatalogo(codigoCatalogo);

        Proveedor proveedor = mapearEntidad(proveedorDTO, catalogo);
        proveedor = proveedorRepository.save(proveedor);

        return mapearDto(proveedor);
    }

    @Override
    public List<ProveedorDTO> obtenerProveedores() {
        List<Proveedor> listaProveedores = proveedorRepository.findAll();

        return listaProveedores.stream().map(proveedor -> mapearDto(proveedor)).collect(Collectors.toList());
    }

    @Override
    public Proveedor obtenerProveedorPorId(Long id) {
        Proveedor proveedor = proveedorRepository.findById(id)
        .orElseThrow(() -> new ResourceNotFoundException("proveedor", "id", id));
        return proveedor;
    }

    @Override
    public List<ProveedorDTO> obtenerProveedoresPorCategoria(String codigoCatalogo) 
    {
        catalogoRepository.findById(codigoCatalogo)
        .orElseThrow(() -> new ResourceNotFoundException("catalogo", "codigo", codigoCatalogo));

        List<Proveedor> listaProveedores = proveedorRepository.findProveedorByCatalogoId(codigoCatalogo);

        return listaProveedores.stream().map(proveedor -> mapearDto(proveedor)).collect(Collectors.toList());
    }

    @Override
    public void eliminarProveedorPorId(Long id) {

        Proveedor proveedor = proveedorRepository.findById(id)
        .orElseThrow((() -> new ResourceNotFoundException("proveedor", "id", id)));
        proveedorRepository.delete(proveedor);

    }

    @Override
    public ProveedorDTO editarProveedor(ProveedorDTO proveedorDTO) {

        verifyDto(proveedorDTO, 2);

        Catalogo categoria = verificarCatalogo(proveedorDTO.getCategoria());

        Proveedor proveedor = mapearEntidad(proveedorDTO, categoria);

        return mapearDto(proveedor);
    }

    private ProveedorDTO mapearDto(Proveedor proveedor) {
        ProveedorDTO proveedorDTO = new ProveedorDTO();
        proveedorDTO.setCategoria(proveedor.getCategoria().getValor());
        proveedorDTO.setCorreo(proveedor.getCorreo());
        proveedorDTO.setDireccion(proveedor.getDireccion());
        proveedorDTO.setRuc(proveedor.getRuc());
        proveedorDTO.setTelefono(proveedor.getTelefono());
        proveedorDTO.setNombre(proveedor.getNombre());
        proveedorDTO.setId(proveedor.getId());

        return proveedorDTO;

    }

    private Proveedor mapearEntidad(ProveedorDTO proveedorDTO, Catalogo categoria) {
        Proveedor proveedor = new Proveedor();
        proveedor.setCategoria(categoria);
        proveedor.setCorreo(proveedorDTO.getCorreo());
        proveedor.setDireccion(proveedorDTO.getDireccion());
        proveedor.setRuc(proveedorDTO.getRuc());
        proveedor.setTelefono(proveedorDTO.getTelefono());
        proveedor.setNombre(proveedorDTO.getNombre());
        proveedor.setId(proveedorDTO.getId());

        return proveedor;

    }

    private void verifyDto(ProveedorDTO proveedorDTO, int type) {
        switch (type) {
            case 1:
                boolean verify = (proveedorDTO.getNombre() == null) || (proveedorDTO.getId() != null)
                        ? false: true;
                if (!verify) throw new SalesException("el body no coincide");

                break;
            case 2:
                boolean verify2 = (proveedorDTO.getCategoria() == null) || (proveedorDTO.getId() == null)
                        ? false: true;
                if (verify2) throw new SalesException("el body es una mrd");
                break;

            default:
                throw new SalesException("huvo un error opcion no detectada proveedorServiceImp");
        }

    }

    private Catalogo verificarCatalogo(String codigoCatalogo){

        Catalogo catalogo = catalogoRepository.findById(codigoCatalogo)
        .orElseThrow(() -> new ResourceNotFoundException("catalogo", "codigo", codigoCatalogo));

        if (!catalogo.getTipo().equalsIgnoreCase("tipo_proveedor"))
           throw new SalesException(String.format("la categoria asignada no es correcta, valor que quiere asignar: %s",catalogo.getValor()));

        return catalogo;

    }

}