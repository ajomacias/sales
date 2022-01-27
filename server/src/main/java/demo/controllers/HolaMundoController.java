package demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;

import demo.models.*;

@RestController
@RequestMapping("")
public class HolaMundoController {

    @GetMapping("")
    public Producto holaMundoController(HttpServletResponse response){
        Producto producto = new Producto();
        producto.setId(1);
        producto.setNombre("Anuel");
        producto.setDetalle("prrrrrrr");
        producto.setPrecio(1.2);
        producto.setStock(12);
        producto.setProveedorId(12);

        response.setStatus(200);

        return producto;
    }

}
