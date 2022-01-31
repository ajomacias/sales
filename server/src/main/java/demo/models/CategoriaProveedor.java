package demo.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;

import lombok.Data;

@Entity 
@Data
@Table(name = "categoriaproveedor", uniqueConstraints={
    @UniqueConstraint(columnNames = {
        "nombre_categoriaproveedor"
    }),
    @UniqueConstraint(columnNames = {
        "detalle_categoriaproveedor"
    })
})
public class CategoriaProveedor {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY )
    @Column(name = "id_proveedor" , nullable = false)
    private Long id;

    @Column(name="nombre_categoriaproveedor", nullable = false)
    private String nombre;

    @Column(name ="detalle_categoriaproveedor", nullable=false)
    private String detalle;
}
