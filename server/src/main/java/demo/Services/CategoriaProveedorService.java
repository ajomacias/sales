package demo.Services;

import demo.Repository.CategoriaProveedorRepository;
import demo.models.CategoriaProveedor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaProveedorService {

    @Autowired
    CategoriaProveedorRepository categoriaProveedorRepository;

    public List<CategoriaProveedor> getCategoryList() {
        return categoriaProveedorRepository.findAll();
    }

    public CategoriaProveedor getCategoryById(Integer id) {
        return categoriaProveedorRepository.findById(id).get();
    }

    public Boolean deleteCategoryById(Integer id) {

        if (categoriaProveedorRepository.existsById(id)) {
            categoriaProveedorRepository.deleteById(id);
            return true;
        }

        return false;

    }

    public boolean verifyCategorySupplierId(Integer id){
        return categoriaProveedorRepository.existsById(id);

    }

    public CategoriaProveedor saveCategoryAndUpdate(CategoriaProveedor categoria) {
        return categoriaProveedorRepository.save(categoria);
    }

}
