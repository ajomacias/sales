
package demo.models;

import javax.persistence.*;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import lombok.Data;

@Entity
@Table(name = "proveedor",schema="persona")
@SQLDelete(sql="UPDATE persona.proveedor SET eliminado=true WHERE _id=?")
@Where(clause="eliminado=false")
@Data
public class Proveedor { 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "_id")
    private Long id;
    @Column(columnDefinition="character varying(120)", nullable = false, unique = true)
    private String nombre;
    @Column(columnDefinition="character varying(30)", nullable = true,unique = true)
    private String ruc;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "catalogo_id",nullable = true)
    private Catalogo categoria;
    @Column(columnDefinition="character varying(230)", nullable = true,unique = true)
    private String correo;
    @Column(columnDefinition="character varying(20)", nullable = true, unique = true)
    private String telefono;
    @Column(columnDefinition="character varying(220)", nullable = true, unique = true)
    private String direccion;
    @Column(name = "eliminado" ,nullable = false)
    private boolean eliminado; 
}