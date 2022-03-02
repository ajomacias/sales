package demo.exception;

import java.lang.RuntimeException;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(value=HttpStatus.CONFLICT)
public class ResourceRepeatIdException extends RuntimeException {

    private String nombreDelRecurso;
    private String nombreDelCampo;
    private Long valorDelCampLong;
    private String valorDelCampString;

    public ResourceRepeatIdException(String nombreDelRecurso, String nombreDelCampo,String valorDelCampString) {
        super(String.format("%s con %s %s ya existe",nombreDelRecurso,nombreDelCampo,valorDelCampString));
        this.nombreDelRecurso = nombreDelRecurso;
        this.nombreDelCampo = nombreDelCampo;
        this.valorDelCampString = valorDelCampString;
    }
    public ResourceRepeatIdException(String nombreDelRecurso, String nombreDelCampo,Long valorDelCampLong) {
        super(String.format("%s con %s %s ya existe",nombreDelRecurso,nombreDelCampo,valorDelCampLong));
        this.nombreDelRecurso = nombreDelRecurso;
        this.nombreDelCampo = nombreDelCampo;
        this.valorDelCampLong = valorDelCampLong;
    }
    public String getNombreDelRecurso() {
        return nombreDelRecurso;
    }
    public String getNombreDelCampo() {
        return nombreDelCampo;
    }
    public Long getValorDelCampLong() {
        return valorDelCampLong;
    }

    public String getValorDelCampString() {
        return valorDelCampString;
    }

}
