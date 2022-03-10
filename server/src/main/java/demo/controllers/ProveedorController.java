package demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import static demo.utils.AppConstantes.*;

import demo.Dto.ProveedorDTO;
import demo.Dto.ProveedorRespuesta;
import demo.Services.ProveedorService;
import demo.exception.Succes;

@RestController
@RequestMapping("/api/proveedores")

public class ProveedorController {
    @Autowired
    private ProveedorService proveedorService;

    @GetMapping
    public ResponseEntity<ProveedorRespuesta> obtenerProveedores(
        @RequestParam(value = "nuPag", defaultValue = NUM_PAG_DF, required = false) int nupag,
        @RequestParam(value = "sizePag",defaultValue = NUM_ITEMS_DF, required = false) int sizePag,
        @RequestParam(value = "sortBy", defaultValue = CAMP_ORDER_DF, required = false) String sortBy,
        @RequestParam(value = "sortDir", defaultValue = ORDER_ITEMS_DF, required = false) String sortDir
    )
    {

        return new ResponseEntity<>(proveedorService.obtenerProveedores(nupag,sizePag,sortBy,sortDir), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<ProveedorDTO> obtenerProveedorPorId(@PathVariable(value = "id") Long id)
    {
        return new ResponseEntity<>(proveedorService.obtenerProveedorPorId(id), HttpStatus.OK);
    }
    @GetMapping("/code/{idCatalogo}")
    public List<ProveedorDTO> obtenerProveedorPorCategoria(@PathVariable(name = "idCatalogo") String idCatalogo)
    {

        return proveedorService.obtenerProveedoresPorCategoria(idCatalogo);
    }
    @PutMapping
    public ResponseEntity<ProveedorDTO> editarProveedor(@RequestBody ProveedorDTO proveedorDTO)
    {
        return new ResponseEntity<>(proveedorService.editarProveedor(proveedorDTO),HttpStatus.OK);

    }

    @PostMapping("/{idCatalogo}")
    public ResponseEntity<ProveedorDTO> obtenerProveedores(@RequestBody ProveedorDTO proveedorDTO,
            @PathVariable(name = "idCatalogo") String codigo) 
    {
        return new ResponseEntity<>(proveedorService.crearProveedor(proveedorDTO, codigo),HttpStatus.CREATED);

    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminarProveedor(@PathVariable(value = "id") Long id)
    {
        proveedorService.eliminarProveedorPorId(id);
        return new ResponseEntity<>(new Succes(String.format("Se elimino el proveedor con id : %s", id))
        .toString(),HttpStatus.OK);
    }


}