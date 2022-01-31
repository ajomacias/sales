package demo.models;

import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.UniqueConstraint;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
@Table(name="productos", uniqueConstraints={
    @UniqueConstraint(columnNames = {"nombre_producto",}),
    @UniqueConstraint(columnNames = {"detalle_producto"})
})
public class Producto {
    
    @Id()
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_producto")
    private Long Id;

    @Column(name="id_proveedor", nullable = false)
    private Integer proveedorId;

    @Column(name="nombre_producto", nullable = false)
    private String nombre;

    @Column(name="detalle_producto", nullable = false)
    private String detalle;

    @Column(name="precio_producto", nullable = false)
    private Double precio;

    @Column(name="stock_producto", nullable = true)
    private Integer stock;
   
}
