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
@SQLDelete(sql="UPDATE catalogo.catalogos SET eliminado=true WHERE codigo=?")
@Where(clause = "eliminado=false")
@Data
public class Catalogo{
    @Id()
    @Column(name="codigo",columnDefinition = "character varying(140)",nullable = false)
    private String codigo;
    @Column(name="valor",columnDefinition = "character varying(40)",nullable = false)
    private String valor;
    @Column(name="tipo",columnDefinition="character varying(70)",nullable=false)
    private String tipo;
    @Column(name="eliminado",columnDefinition="boolean default false")
    private boolean eliminado;
    
}