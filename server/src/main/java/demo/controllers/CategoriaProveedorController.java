package demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import demo.Services.CategoriaProveedorService;
import demo.models.CategoriaProveedor;

import javax.servlet.http.HttpServletResponse;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("api/categoriaProveedor")
public class CategoriaProveedorController {

    @Autowired()
    CategoriaProveedorService categoriaProveedorService;

    @GetMapping("/getAll")
    public List<CategoriaProveedor> getListCategorySuppliersController()
    {

        return categoriaProveedorService.getCategoryList();

    }

    @PostMapping("/setProveedor")
    public CategoriaProveedor setCategorySupplierController(@RequestBody CategoriaProveedor categoria)
    {
        return categoriaProveedorService.saveCategoryAndUpdate(categoria);
    }
    
}
