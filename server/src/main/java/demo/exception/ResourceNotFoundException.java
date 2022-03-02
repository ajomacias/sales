package demo.exception;

import java.lang.RuntimeException;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{

    private String nombreDelRecurso;
    private String nombreDelCampo;
    private Long valorDelCampLong;
    private String valorDelCampString;

    public ResourceNotFoundException(String nombreDelRecurso,String nombreDelCampo,Long id){
        super(String.format("%s no encontrad@ con : %s : %s",nombreDelRecurso,nombreDelCampo,id));
        this.nombreDelRecurso = nombreDelRecurso;
        this.nombreDelCampo = nombreDelCampo;
        this.valorDelCampLong = id;
        
    }
    public ResourceNotFoundException(String nombreDelRecurso,String nombreDelCampo,String id){
        super(String.format("%s no encontrad@ con : %s : %s",nombreDelRecurso,nombreDelCampo,id));
        this.nombreDelRecurso = nombreDelRecurso;
        this.nombreDelCampo = nombreDelCampo;
        this.valorDelCampString = id;
        
    }

    public String getNombreDelRecurso() {
        return this.nombreDelRecurso;
    }

    public void setNombreDelRecurso(String nombreDelRecurso) {
        this.nombreDelRecurso = nombreDelRecurso;
    }

    public String getNombreDelCampo() {
        return this.nombreDelCampo;
    }

    public void setNombreDelCampo(String nombreDelCampo) {
        this.nombreDelCampo = nombreDelCampo;
    }

    public Long getValorDelCampoLong() {
        return this.valorDelCampLong;
    }

    public void setValorDelCampo(Long valorDelCampo) {
        this.valorDelCampLong = valorDelCampo;
    }

    public String getValorDelCampoString() {
        return this.valorDelCampString;
    }
}