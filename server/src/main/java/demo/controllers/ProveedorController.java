package demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

import java.util.List;

import demo.Dto.ProveedorDTO;
import demo.Services.ProveedorService;

@RestController
@RequestMapping("/api/proveedores")
public class ProveedorController {
    @Autowired
    private ProveedorService proveedorService;

    @GetMapping
    public List<ProveedorDTO> obtenerProveedores()
    {
        return proveedorService.obtenerProveedores();
    }

    @PostMapping("/{idCatalogo}")
    public ResponseEntity<ProveedorDTO> obtenerProveedores(@RequestBody ProveedorDTO proveedorDTO,
            @PathVariable(name = "idCatalogo") String codigo) 
    {
        return new ResponseEntity<>(proveedorService.crearProveedor(proveedorDTO, codigo),HttpStatus.CREATED);

    }

}
