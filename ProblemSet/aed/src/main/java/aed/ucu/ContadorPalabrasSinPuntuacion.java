package aed.ucu;

public class ContadorPalabrasSinPuntuacion extends ContadorPalabras {

    @Override
    public int contarPalabras(String texto) {
        if (texto == null) {
            return 0;
        }
        return super.contarPalabras(texto.replaceAll("[^A-Za-z0-9 ]", " "));
    }
}
