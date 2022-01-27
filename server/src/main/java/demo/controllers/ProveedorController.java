package demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import demo.Services.CategoriaProveedorService;
import demo.models.CategoriaProveedor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;







@RestController
@RequestMapping("api")
public class ProveedorController {

    @Autowired
    CategoriaProveedorService categoriaProveedorService;
    
}
