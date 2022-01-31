package demo.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("api/categoriaProveedor")
public class CategoriaProveedorController {

    @Autowired
    CategoriaProveedorService categoriaProveedorService;

    @GetMapping("/getAll")
    public List<CategoriaProveedor> getListCategorySuppliersController() {
        return categoriaProveedorService.getCategoryList();
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<?> getCategorySupplierByIdController(@PathVariable Integer id) {
        CategoriaProveedor categoriaProveedor = categoriaProveedorService.getCategoryById(id);
        return new ResponseEntity<>(categoriaProveedor,HttpStatus.OK);
    }

    @PostMapping("/setCategoria")
    public ResponseEntity<?> setCategorySupplierController(@RequestBody CategoriaProveedor categoria) {

            return new ResponseEntity<>(categoriaProveedorService.saveCategoryAndUpdate(categoria),HttpStatus.OK);
    }

    @PutMapping("/updateCategoria")
    public ResponseEntity<?> updateCategorySupplierController(@RequestBody CategoriaProveedor categoria, HttpServletResponse response) {

        CategoriaProveedor categoriaProveedor = categoriaProveedorService.saveCategoryAndUpdate(categoria);
        return new ResponseEntity<>(categoriaProveedor,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteCategorySupplierController(@PathVariable Integer id)
    {
        boolean lol = categoriaProveedorService.deleteCategoryById(id);

        if(!lol){
            throw new RuntimeException("no se encontro el id de el usuario");
        }
        return new ResponseEntity<>("Se elimino la categoria",HttpStatus.OK);
    }

}
