package aed.ucu;

import java.util.Arrays;

public class Multsuma {

    public static int multsuma(int a, int b, int c) {
        return a * b + c;
    }

    public static double multsuma(double a, double b, double c) {
        return a * b + c;
    }

    public static int productoPunto(int[] a, int[] b) {
        validarVectores(a, b);
        int resultado = 0;
        for (int i = 0; i < a.length; i++) {
            resultado += a[i] * b[i];
        }
        return resultado;
    }

    private static void validarVectores(int[] a, int[] b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Los arreglos no pueden ser null.");
        }
        if (a.length != b.length) {
            throw new IllegalArgumentException("Los arreglos deben tener igual largo.");
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};

        System.out.println("multsuma int: " + multsuma(2, 3, 4));
        System.out.println("multsuma double: " + multsuma(2.5, 3.0, 1.5));
        System.out.println(Arrays.toString(a) + " . " + Arrays.toString(b) + " = " + productoPunto(a, b));
    }
}
