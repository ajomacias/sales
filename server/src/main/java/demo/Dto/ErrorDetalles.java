package demo.Dto;
import java.util.Date;
import lombok.Data;
@Data
public class ErrorDetalles {
    private Date marcaDeTiempo;
    private String mensaje;
    private String detalle;
    
    public ErrorDetalles(Date marcaDeTiempo, String mensaje, String detalle) {
        this.marcaDeTiempo = marcaDeTiempo;
        this.mensaje = mensaje;
        this.detalle = detalle;
    }
}
