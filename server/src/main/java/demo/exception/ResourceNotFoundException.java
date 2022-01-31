package demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{
    private final static long serialVersionUID = 1L;
    private String nombreDelRecurso;
    private String nombreDelCampo;
    private Long valorDelCampo;

    public ResourceNotFoundException(String _nombreDelRecurso,String _nombreDelCampo, Long _valorDelCampo ){
        super();
        this.nombreDelCampo = _nombreDelCampo;
        this.valorDelCampo = _valorDelCampo;
        this.nombreDelRecurso = _nombreDelRecurso;
    }

    public String getNombreDelRecurso() {
        return nombreDelRecurso;
    }

    public Long getValorDelCampo(){
        return valorDelCampo;
    }

    public String getNombreDelCampo() {
        return nombreDelCampo;
    }

    
}
