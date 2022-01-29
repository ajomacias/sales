package demo.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import demo.models.Proveedor;

@Repository
public interface ProveedorRepository extends CrudRepository<Proveedor, Integer> {
    List<Proveedor> findAll();
}