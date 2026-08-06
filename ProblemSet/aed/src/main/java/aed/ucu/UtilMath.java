package aed.ucu;

import java.util.Scanner;

public class UtilMath {

    /*
     * 0! y 1! valen 1.
     * Devuelve -1 para negativos y para valores mayores que 12,
     * porque 13! ya no cabe en un int.
     */
    public static int factorial(int num) {
        if (num < 0 || num > 12) {
            return -1;
        }

        int resultado = 1;
        for (int i = 2; i <= num; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static boolean isPrime(long n) {
        if (n < 2) {
            return false;
        }

        long divisor = 2;
        while (divisor <= n / divisor) {
            if (n % divisor == 0) {
                return false;
            }
            divisor++;
        }
        return true;
    }

    public static long conditionalSum(long n) {
        boolean primo = isPrime(n);
        long suma = 0;
        long numero = primo ? 0 : 1;

        while (numero <= n) {
            suma += numero;
            numero += 2;
        }
        return suma;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero entero no negativo: ");
        long numero = scanner.nextLong();

        if (numero < 0) {
            System.out.println("El numero debe ser no negativo.");
        } else if (isPrime(numero)) {
            System.out.println("Es primo.");
            System.out.println("Suma de pares: " + conditionalSum(numero));
        } else {
            System.out.println("No es primo.");
            System.out.println("Suma de impares: " + conditionalSum(numero));
        }

        scanner.close();
    }
}

    /*
 * 1. El factorial devuelve int. Como 13! no cabe en ese tipo, se devuelve
 *    -1 para entradas negativas o mayores que 12. Este valor no puede
 *    confundirse con un factorial válido.
 *
 * 2. Para decidir si un número es primo solo se buscan divisores hasta su raíz
 *    cuadrada. Las sumas comienzan en 0 si el número es primo y en 1 si no lo
 *    es, avanzando de dos en dos para recorrer solamente pares o impares.
 */
