package Functions;

public interface Operaciones {

    static Double obtenerPromedio(Double... notas ){

        var notaTotal = 0d;
        int o = 0;

        while(o < notas.length){
            notaTotal += notas[o];
            o++;
        }

        return (notaTotal/notas.length);

    }

}
