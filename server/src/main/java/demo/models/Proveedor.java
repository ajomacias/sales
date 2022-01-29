package demo.models;

import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
@Table("proveedores")
public class Proveedor {

    @Id
    @Column("id_proveedor")
    private Integer id;

    @Column("id_categoria_proveedor")
    private Integer categoriaId;

    @Column("cedula_proveedor")
    private String cedula;

    @Column("direccion_proveedor")
    private String direccion;

    @Column("telefono_proveedor")
    private String telefono;

    @Column("email_proveedor")
    private String email;

    @Column("banco_proveedor")
    private String banco;

    @Column("cuenta_proveedor")
    private String cuenta;

    @Column("detalle_proveedor")
    private String detalle;

    @Column("estado_proveedor")
    private String estado;
    
}
