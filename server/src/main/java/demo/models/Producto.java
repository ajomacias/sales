package demo.models;

import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
@Table("productos")
public class Producto {
    
    @Id
    @Column("id_producto")
    private Integer Id;

    @Column("id_proveedor")
    private Integer proveedorId;

    @Column("nombre_producto")
    private String nombre;

    @Column("detalle_producto")
    private String detalle;

    @Column("precio_producto")
    private Double precio;

    @Column("stock_producto")
    private Integer stock;
   
}
