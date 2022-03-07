package demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import demo.models.Proveedor;
import org.springframework.stereotype.Repository;

@Repository
public interface ProveedorRepository extends JpaRepository<Proveedor, Long>{

    public final static String SELECT_PV_BY_CAT = "SELECT pr.* FROM persona.proveedor as pr JOIN catalogo.catalogos as ca ON ca.codigo=catalogo_fk WHERE ca.codigo=:codigo;";

    @Query(value= SELECT_PV_BY_CAT,nativeQuery=true)
    public List<Proveedor> findProveedorByCatalogoId(@Param(value = "codigo") String codigoCatalogo);
    
}