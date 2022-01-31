package demo.controllers;

import demo.Services.ProveedorService;

import demo.models.Proveedor;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
@RestController
@RequestMapping("api/proveedor")
public class ProveedorController {

    @Autowired
    ProveedorService proveedorService;

    @GetMapping("/getAll")
    public String getSupplierListController (){
        return  String.valueOf(proveedorService.getProveedorList());
    }

    @GetMapping("/getById/{id}")
    public String getSupplierByIdController (@PathVariable Integer id){
        return  String.valueOf(proveedorService.getProveedorById(id));
    }

    @DeleteMapping("/deleteProveedor/{id}")
    public String[] deleteProveedorById(@PathVariable Integer id){
        String[] lol = {String.valueOf(proveedorService.deleteProveedorById(id))};
        return lol;
    }

    @PostMapping("/createProveedor")
        public String createSupplierController(@RequestBody Proveedor proveedor){
        return  String.valueOf(proveedorService.setProveedor(proveedor));
    }

    @PutMapping("/updateProveedor")
    public Proveedor updateSupplierController(@RequestBody Proveedor proveedor){
        return proveedorService.setProveedor(proveedor);

    }

}
