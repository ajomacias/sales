package demo.Repository;

import demo.models.Catalogo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface CatalogoRepository extends JpaRepository<Catalogo,Long> 
{
    public static final String SELECT_BY_CATEGORY = "SELECT * FROM catalogo.catalogos WHERE tipo=:tipo and eliminado=false";
    
    @Query(value =SELECT_BY_CATEGORY ,nativeQuery = true)
    public List<Catalogo> getByType(@Param("tipo") String tipo);
}
