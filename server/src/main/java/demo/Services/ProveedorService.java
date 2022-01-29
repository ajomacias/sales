package demo.Services;

import org.springframework.stereotype.Service;

import demo.Repository.ProveedorRepository;
import demo.models.Proveedor;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class ProveedorService {
    @Autowired
    ProveedorRepository proveedorRepository;

    public List<Proveedor> getProveedorList() 
    {
        return proveedorRepository.findAll();
    }

    public Proveedor getProveedorById(Integer id) 
    {
        return proveedorRepository.findById(id).get();
    }

    public Boolean deleteProveedorById(Integer id) 
    {

        if (proveedorRepository.existsById(id)) {
            proveedorRepository.deleteById(id);
            return true;
        }

        return false;

    }

}
