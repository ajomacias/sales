package demo.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;


@ResponseStatus(code = HttpStatus.CONFLICT)
public class SalesException extends RuntimeException {
    private String mensaje;

    public SalesException(String mensaje)
    {
        super(mensaje);
        this.mensaje = mensaje;
    }

    public void setMensaje(String mensaje){
        this.mensaje = mensaje;
    }
    public String setMensaje(){
        return this.mensaje;
    }
    
}
