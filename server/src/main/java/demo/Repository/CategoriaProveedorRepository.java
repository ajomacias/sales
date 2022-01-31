package demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import demo.models.CategoriaProveedor;

@Service
public interface CategoriaProveedorRepository extends JpaRepository<CategoriaProveedor, Long> {

}
