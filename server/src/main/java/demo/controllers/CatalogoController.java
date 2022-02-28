package demo.controllers;

import org.springframework.web.bind.annotation.*;

import demo.Dto.CatalogoDTO;
import demo.Services.CatalogoServiceImp;
import demo.exception.Succes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/api/catalogos") 
public class CatalogoController {

    @Autowired CatalogoServiceImp catalogoServiceImp;

    @GetMapping({"","/"})
    public List<CatalogoDTO> obtenerCatalogos()
    {
        return catalogoServiceImp.obtenerCatalogos();
    }
    @PostMapping("/create")
    public ResponseEntity<CatalogoDTO> crearCatalogo(@RequestBody CatalogoDTO catalogoDTO)
    {
        return new ResponseEntity<>(catalogoServiceImp.crearCatalogo(catalogoDTO),HttpStatus.OK);

    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> borrarCategoriaPorId(@PathVariable(name ="id") Long id)
    {
        catalogoServiceImp.eliminarCatalogoPorId(id);
        return new ResponseEntity<>(new Succes(String
        .format("Se elimino la categoria con id: %s", id)).toString(),HttpStatus.OK);

    }
    
}
