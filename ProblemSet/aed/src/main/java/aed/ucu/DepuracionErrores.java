package aed.ucu;

public class DepuracionErrores {

    // Como no hay repartido original me invente algo para tirar errores

    public static int divisionSegura(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("El divisor no puede ser cero.");
        }
        return a / b;
    }

    public static int largoSeguro(String texto) {
        if (texto == null) {
            return 0;
        }
        return texto.length();
    }

    public static int obtenerSeguro(int[] valores, int indice) {
        if (valores == null || indice < 0 || indice >= valores.length) {
            throw new IllegalArgumentException("Indice invalido.");
        }
        return valores[indice];
    }

    public static void main(String[] args) {
        System.out.println("division: " + divisionSegura(10, 2));
        System.out.println("largo null: " + largoSeguro(null));
        System.out.println("arreglo: " + obtenerSeguro(new int[]{1, 2, 3}, 1));
    }
}
