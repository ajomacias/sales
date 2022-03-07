package demo.controllers;

import org.springframework.web.bind.annotation.*;

import demo.Dto.CatalogoDTO;
import demo.Dto.CatalogoRespuesta;
import demo.Services.CatalogoServiceImp;
import demo.exception.Succes;
import demo.utils.AppConstantes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/api/catalogos") 
public class CatalogoController {

    @Autowired CatalogoServiceImp catalogoServiceImp;

    @GetMapping
    public ResponseEntity<CatalogoRespuesta> obtenerCatalogos(
        @RequestParam(value = "nuPag" , defaultValue=AppConstantes.NUM_PAG_DF,required=false) int numeroPa,
        @RequestParam(value = "pagSize", defaultValue = AppConstantes.NUM_ITEMS_DF, required = false) int numeroSize,
        @RequestParam(value = "sortBy", defaultValue =  AppConstantes.CAMP_ORDER_DF,required = false ) String sortBy,
        @RequestParam(value= "sortDir", defaultValue = AppConstantes.ORDER_ITEMS_DF, required = false) String sortDir
    )
    {
        return new ResponseEntity<>(catalogoServiceImp.obtenerCatalogos(numeroPa, numeroSize,sortBy,sortDir),HttpStatus.OK);
       
    }

    @GetMapping("/get/{cod}")
    public ResponseEntity<CatalogoDTO> obtenerCatalogos(@PathVariable(name = "cod") String id)
    {
        return new ResponseEntity<>(catalogoServiceImp.obtenerCatalogoPorId(id),HttpStatus.OK);
    }
    @GetMapping("/c/{c}")
    public List<CatalogoDTO> obtenerCatalogoPorTipo(@PathVariable(name="c") String tipo)
    {
        return catalogoServiceImp.obtenerCatalogosPorTipos(tipo);
    }

    @PostMapping("/create")
    public ResponseEntity<CatalogoDTO> crearCatalogo(@RequestBody CatalogoDTO catalogoDTO)
    {
        return new ResponseEntity<>(catalogoServiceImp.crearCatalogo(catalogoDTO),HttpStatus.OK);

    }
    
    @PutMapping("/edit/{co}")
    public ResponseEntity<CatalogoDTO> editarCatalogo(@PathVariable(name = "co") String id, @RequestBody CatalogoDTO  catalogoDTO)
    {
        return new ResponseEntity<>(catalogoServiceImp.editarCatalogo(id, catalogoDTO),HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> borrarCategoriaPorId(@PathVariable(name ="id") String id)
    {
        catalogoServiceImp.eliminarCatalogoPorId(id);
        return new ResponseEntity<>(new Succes(String
        .format("Se elimino la categoria con id: %s", id)).toString(),HttpStatus.OK);

    }
}
