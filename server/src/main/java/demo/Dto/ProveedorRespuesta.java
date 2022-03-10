package demo.Dto;

import java.util.List;
import lombok.Data;

@Data
public class ProveedorRespuesta {

    private List<ProveedorDTO> contenido;
    private int numeroPagina;
    private int tamañoPagina;
    private int totalPaginas;
    private Long totalElemntos;
    
}
