package Functions;
import java.text.DecimalFormat;

public interface Operaciones {

    static Double obtenerPromedio(Double... notas ){

        DecimalFormat formato = new DecimalFormat("##.##");

        var notaTotal = 0d;
        int o = 0;

        while(o < notas.length){
            notaTotal += notas[o];
            o++;
        }

        return Double.valueOf(formato.format(notaTotal/notas.length).replace(",", "."));
        
    }
}