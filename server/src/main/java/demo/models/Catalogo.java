package demo.models;

import javax.persistence.*;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import lombok.Data;

@Entity
@Table(name="catalogos",schema="catalogo",uniqueConstraints={
    @UniqueConstraint(columnNames={"codigo"}),
    @UniqueConstraint(columnNames={"valor"})
})
@SQLDelete(sql="UPDATE catalogo.catalogos SET eliminado=true WHERE _id=?")
@Where(clause = "eliminado=false")
@Data
public class Catalogo{
    @Id()
    @Column(name="_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="codigo",columnDefinition = "character varying",length = 140,nullable = false)
    private String codigo;
    @Column(name="valor",columnDefinition = "character varying",length = 40,nullable = false)
    private String valor;
    @Column(name="tipo",columnDefinition="character varying", length= 70,nullable=false)
    private String tipo;
    @Column(name="eliminado",columnDefinition="boolean default false")
    private boolean eliminado;
    
}