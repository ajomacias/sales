package demo.models;

import javax.persistence.*;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import lombok.Data;

@Entity
@Table(name = "proveedor",schema="persona",uniqueConstraints={
    @UniqueConstraint(columnNames={"nombre"}),
    @UniqueConstraint(columnNames = {""})

})
@SQLDelete(sql="UPDATE SET persona.personas eliminado=true WHERE id=?")
@Where(clause="eliminado=false")
@Data
public class Proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition="character varying", length=120, nullable = false)
    private String nombre;
    @Column(columnDefinition="character varying", length=30, nullable = true)
    private String ruc;
    @ManyToOne
    @JoinColumn(name = "codigo")
    @Column(columnDefinition="character varying", length=30, nullable = true)
    private String categoria;
    @Column(columnDefinition="character varying", length=230, nullable = true)
    private String correo;
    @Column(columnDefinition="character varying", length=20, nullable = true)
    private String telefono;

    
}
