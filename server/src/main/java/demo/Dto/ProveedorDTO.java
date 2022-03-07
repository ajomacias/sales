package demo.Dto;

import lombok.Data;

@Data
public class ProveedorDTO {
    private Long id;
    private String nombre;
    private String ruc;
    private String categoria;
    private String correo;
    private String direccion;
    private String telefono;
    
}
