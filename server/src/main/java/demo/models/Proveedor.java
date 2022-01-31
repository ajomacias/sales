package demo.models;

import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.UniqueConstraint;
import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
@Table(name = "proveedores", uniqueConstraints={
    @UniqueConstraint(columnNames = { "nombre_proveedor" }),
    @UniqueConstraint(columnNames = { "cedula_proveedor" }),
    @UniqueConstraint(columnNames = { "telefono_proveedor" }),
    @UniqueConstraint(columnNames = { "email_proveedor" }),
    @UniqueConstraint(columnNames = { "cuenta_proveedor" })

})
public class Proveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_proveedor")
    private Long id;

    @Column(name="id_categoriaproveedor", nullable=false)
    private Integer categoriaId;

    @Column(name="nombre_proveedor", nullable = false)
    private String nombre;

    @Column(name = "cedula_proveedor",nullable = false)
    private String cedula;

    @Column(name="direccion_proveedor", nullable = false)
    private String direccion;

    @Column(name="telefono_proveedor", nullable = false)
    private String telefono;

    @Column(name="email_proveedor", nullable = false)
    private String email;

    @Column(name="banco_proveedor", nullable = false)
    private String banco;

    @Column(name="cuenta_proveedor", nullable = false)
    private String cuenta;

    @Column(name="detalle_proveedor", nullable = false)
    private String detalle;

    @Column(name="estado_proveedor", nullable = false)
    private String estado;
}
