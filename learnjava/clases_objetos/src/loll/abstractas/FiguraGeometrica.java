package loll.abstractas;

public abstract class FiguraGeometrica {

    protected String tipoFigura;

    protected FiguraGeometrica(String figura){
        this.tipoFigura = figura;
    }

    public abstract void dibujar();

    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }
    
    @Override
    public String toString(){
        StringBuilder str = new StringBuilder("FiguraGeometrica{");
        str.append("tipoFigura='").append(this.tipoFigura+'\'');
        str.append('}');
        return str.toString();
    }
    
}
