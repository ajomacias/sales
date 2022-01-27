package demo.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import demo.models.CategoriaProveedor;

@Service
public interface CategoriaProveedorRepository extends CrudRepository<CategoriaProveedor, Integer> {

    List<CategoriaProveedor> findAll();

}
