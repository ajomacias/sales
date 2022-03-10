package demo.utils;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;


public class Funciones{

    public static Pageable obtenerPageable(int numeroPagina, int tamañoPagina,String sortBy,String sortDir)
    {
        Sort sort = sortDir.equalsIgnoreCase(Sort.Direction.ASC.name())
        ? Sort.by(sortBy).ascending() : Sort.by(sortBy).descending();

        Pageable pageable = PageRequest.of(numeroPagina, tamañoPagina, sort);
        return pageable;

    }

}