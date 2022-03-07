package demo.Dto;

import java.util.List;
import lombok.Data;

@Data
public class CatalogoRespuesta {
    private List<CatalogoDTO> contenido;
    private int numeroPagina;
    private int tamañoPagina;
    private int totalPaginas;
    private Long totalElementos;
    private boolean ultimo;
}