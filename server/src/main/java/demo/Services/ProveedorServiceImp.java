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
import demo.Dto.ProveedorRespuesta;
import static demo.utils.Funciones.obtenerPageable;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.data.domain.Page;

@Service
public class ProveedorServiceImp implements ProveedorService {

    @Autowired
    private ProveedorRepository proveedorRepository;
    @Autowired
    private CatalogoRepository catalogoRepository;

    @Override
    public ProveedorDTO crearProveedor(ProveedorDTO proveedorDTO, String codigoCatalogo) {

        verifyDto(proveedorDTO,1);

        Catalogo catalogo = verificarCatalogo(codigoCatalogo);

        Proveedor proveedor = mapearEntidad(proveedorDTO, catalogo);
        proveedor = proveedorRepository.save(proveedor);

        return mapearDto(proveedor);
    }

    @Override
    public ProveedorRespuesta obtenerProveedores(int nuPag, int sizePag, String sortBy, String sortDir) {

       Pageable pageable = obtenerPageable(nuPag,sizePag,sortBy,sortDir);

       Page<Proveedor> pageProveedor = proveedorRepository.findAll(pageable);


       List<ProveedorDTO>  listProveedor = pageProveedor.getContent().stream()
       .map(proveedor->mapearDto(proveedor)).collect(Collectors.toList());

       ProveedorRespuesta proveedorRespuesta = new ProveedorRespuesta();
       proveedorRespuesta.setContenido(listProveedor);
       proveedorRespuesta.setNumeroPagina(pageProveedor.getNumber());
       proveedorRespuesta.setTamañoPagina(pageProveedor.getSize());
       proveedorRespuesta.setTotalElemntos(pageProveedor.getTotalElements());
       proveedorRespuesta.setTotalPaginas(pageProveedor.getTotalPages());

        return proveedorRespuesta;
    }

    @Override
    public ProveedorDTO obtenerProveedorPorId(Long id) {
        Proveedor proveedor = proveedorRepository.findById(id)
        .orElseThrow(() -> new ResourceNotFoundException("proveedor", "id", id));
        return mapearDto(proveedor);
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
        System.err.println(id);
        System.err.println(proveedor.getId());
        proveedorRepository.deleteById(id);

    }

    @Override
    public ProveedorDTO editarProveedor(ProveedorDTO proveedorDTO) {

        verifyDto(proveedorDTO, 2);

        Catalogo categoria = verificarCatalogo(proveedorDTO.getCategoria());
        
        proveedorRepository.findById(proveedorDTO.getId())
        .orElseThrow(()->new ResourceNotFoundException("Proveedor", "id", proveedorDTO.getId()));
        Proveedor proveedor = mapearEntidad(proveedorDTO, categoria);
        proveedor = proveedorRepository.save(proveedor);

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
                        ? false : true;
                if (!verify) throw new SalesException("el body no coincide",HttpStatus.BAD_REQUEST);

                break;
            case 2:
                boolean verify2 = (proveedorDTO.getCategoria() == null) || (proveedorDTO.getId() == null)
                        ? true: false;
                if (verify2) throw new SalesException("el body es una mrd",HttpStatus.BAD_REQUEST);
                break;

            default:
                throw new SalesException("huvo un error opcion no detectada proveedorServiceImp",HttpStatus.BAD_REQUEST);
        }

    }

    private Catalogo verificarCatalogo(String codigoCatalogo){

        Catalogo catalogo = catalogoRepository.findById(codigoCatalogo)
        .orElseThrow(() -> new ResourceNotFoundException("catalogo", "codigo", codigoCatalogo));
        boolean d= (catalogo.getTipo().equalsIgnoreCase("tipo_proveedor")) 
        || (catalogo.getTipo().toLowerCase().equalsIgnoreCase("noval"))? true : false;
        if(!d) throw new SalesException("ERROR CATEGORIA NO VALIDA",HttpStatus.BAD_REQUEST);

        return catalogo;

    }

}