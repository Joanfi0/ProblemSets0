package aed.ucu;

public class ResultadoAnalisis {
    private final int palabras;
    private final int caracteres;
    private final int lineas;

    public ResultadoAnalisis(int palabras, int caracteres, int lineas) {
        this.palabras = palabras;
        this.caracteres = caracteres;
        this.lineas = lineas;
    }

    public int getPalabras() {
        return palabras;
    }

    public int getCaracteres() {
        return caracteres;
    }

    public int getLineas() {
        return lineas;
    }

    @Override
    public String toString() {
        return "ResultadoAnalisis{palabras=" + palabras
                + ", caracteres=" + caracteres
                + ", lineas=" + lineas + "}";
    }
}
