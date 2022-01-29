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
import org.springframework.data.relational.core.conversion.DbActionExecutionException;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("api/categoriaProveedor")
public class CategoriaProveedorController {

    @Autowired()
    CategoriaProveedorService categoriaProveedorService;

    @GetMapping("/getAll")
    public List<CategoriaProveedor> getListCategorySuppliersController() {
        return categoriaProveedorService.getCategoryList();
    }

    @GetMapping("/getById/{id}")
    public CategoriaProveedor getCategorySupplierByIdController(@PathVariable Integer id) {
        return categoriaProveedorService.getCategoryById(id);
    }

    @PostMapping("/setProveedor")
    public CategoriaProveedor setCategorySupplierController(@RequestBody CategoriaProveedor categoria) {
        return categoriaProveedorService.saveCategoryAndUpdate(categoria);
    }

    @PutMapping("/updateProveedor")
    public CategoriaProveedor updateCategorySupplierController(@RequestBody CategoriaProveedor categoria, HttpServletResponse response) {
        CategoriaProveedor categoriaProveedor = new CategoriaProveedor(); 
        try{
            categoriaProveedor = categoriaProveedorService.saveCategoryAndUpdate(categoria);
        }catch(DbActionExecutionException err){
            response.setStatus(500);
            errorController(err);
        }

        return categoriaProveedor;
    }

    @DeleteMapping("/delete/{id}")
    public String[] deleteCategorySupplierController(@PathVariable Integer id) 
    {
        String[] lol = {String.valueOf(categoriaProveedorService.deleteCategoryById(id))};
        return lol;
    }

    private Exception errorController(Exception err){
        return err;
    }

}
