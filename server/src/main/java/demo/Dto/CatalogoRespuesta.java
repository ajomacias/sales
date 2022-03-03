package demo.Dto;

import java.util.List;
import demo.Dto.CatalogoDTO;
import lombok.Data;

@Data
public class CatalogoRespuesta {
    private List<CatalogoDTO> contenido;
    private int numeroPagina;
    private int tamañoPagina;
    private Long totalElementos;
    private boolean ultimo;
}