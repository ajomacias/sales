package demo.models;

import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
@Table("categoriaproveedor")
public class CategoriaProveedor {

    @Id
    @Column("id_categoriaproveedor")
    private Integer id;

    @Column("nombre_categoriaproveedor")
    private String nombre;

    @Column("detalle_categoriaproveedor")
    private String categoria;
}
