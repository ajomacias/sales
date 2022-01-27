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

    public void deleteCategoryById(Integer id) {
        categoriaProveedorRepository.deleteById(id);
    }

    public CategoriaProveedor saveCategoryAndUpdate(CategoriaProveedor categoria) {
        return categoriaProveedorRepository.save(categoria);
    }

}
