package aed.ucu;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TransformadorT9 {

    public static String convertir(String texto) {
        if (texto == null) {
            throw new IllegalArgumentException("El texto no puede ser null.");
        }
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < texto.length(); i++) {
            resultado.append(convertirCaracter(texto.charAt(i)));
        }
        return resultado.toString();
    }

    public static String convertirInvertido(String texto) {
        if (texto == null) {
            throw new IllegalArgumentException("El texto no puede ser null.");
        }
        return convertir(new StringBuilder(texto).reverse().toString());
    }

    public static void transformarArchivo(String entrada, String salida, boolean invertir) throws IOException {
        String texto = new String(Files.readAllBytes(Paths.get(entrada)), StandardCharsets.UTF_8);
        String transformado = invertir ? convertirInvertido(texto) : convertir(texto);
        Files.write(Paths.get(salida), transformado.getBytes(StandardCharsets.UTF_8));
    }

    private static char convertirCaracter(char c) {
        char lower = Character.toLowerCase(c);
        if ("abc".indexOf(lower) >= 0) {
            return '2';
        }
        if ("def".indexOf(lower) >= 0) {
            return '3';
        }
        if ("ghi".indexOf(lower) >= 0) {
            return '4';
        }
        if ("jkl".indexOf(lower) >= 0) {
            return '5';
        }
        if ("mno".indexOf(lower) >= 0) {
            return '6';
        }
        if ("pqrs".indexOf(lower) >= 0) {
            return '7';
        }
        if ("tuv".indexOf(lower) >= 0) {
            return '8';
        }
        if ("wxyz".indexOf(lower) >= 0) {
            return '9';
        }
        if (Character.isWhitespace(c)) {
            return '0';
        }
        return c;
    }

    public static void main(String[] args) throws IOException {
        if (args.length < 2) {
            System.out.println("Uso: TransformadorT9 <entrada> <salida> [invertir]");
            return;
        }
        boolean invertir = args.length > 2 && Boolean.parseBoolean(args[2]);
        transformarArchivo(args[0], args[1], invertir);
    }
}
