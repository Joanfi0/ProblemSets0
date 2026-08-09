package aed.ucu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    public static void leerEntradaArchivo(String rutaArchivo) {
        try (Scanner scanner = new Scanner(new File(rutaArchivo))) {
            int entero = scanner.nextInt();
            double real = scanner.nextDouble();
            String cadena = scanner.next();
            int divisor = scanner.nextInt();

            System.out.println("Entero: " + entero);
            System.out.println("Real: " + real);
            System.out.println("Cadena: " + cadena);
            System.out.println("Suma: " + (entero + real));
            System.out.println("Division entera: " + (entero / divisor));
            System.out.println("Resto: " + (entero % divisor));
        } catch (FileNotFoundException error) {
            System.out.println("Archivo no encontrado.");
        } catch (InputMismatchException error) {
            System.out.println("Formato de archivo invalido.");
        } catch (ArithmeticException error) {
            System.out.println("No se puede dividir entre cero.");
        }
    }

    public static void leerEntradaStdin() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Radio: ");
            double radio = scanner.nextDouble();
            System.out.println("Area: " + (Math.PI * radio * radio));
            System.out.println("Perimetro: " + (2 * Math.PI * radio));
        } catch (InputMismatchException error) {
            System.out.println("Radio invalido.");
        }
    }

    public static void main(String[] args) {
        if (args.length > 0) {
            leerEntradaArchivo(args[0]);
        } else {
            leerEntradaStdin();
        }
    }
}
