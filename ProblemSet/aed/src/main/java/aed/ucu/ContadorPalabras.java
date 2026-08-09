package aed.ucu;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ContadorPalabras implements ProcesadorTexto {

    @Override
    public int contarPalabras(String texto) {
        if (texto == null || texto.trim().isEmpty()) {
            return 0;
        }
        return texto.trim().split("\\s+").length;
    }

    public int contarPalabras(String[] lineas) {
        if (lineas == null) {
            return 0;
        }
        int total = 0;
        for (String linea : lineas) {
            total += contarPalabras(linea);
        }
        return total;
    }

    public ResultadoAnalisis analizar(String[] lineas) {
        int caracteres = 0;
        if (lineas != null) {
            for (String linea : lineas) {
                if (linea != null) {
                    caracteres += linea.length();
                }
            }
        }
        int cantidadLineas = lineas == null ? 0 : lineas.length;
        return new ResultadoAnalisis(contarPalabras(lineas), caracteres, cantidadLineas);
    }

    public String[] obtenerLineas(String archivo) {
        try {
            List<String> lineas = Files.readAllLines(Paths.get(archivo));
            return lineas.toArray(new String[0]);
        } catch (IOException error) {
            System.out.println("No se pudo leer el archivo: " + error.getMessage());
            return new String[0];
        }
    }

    public String[] palabrasComunes(String[] a, String[] b) {
        List<String> comunes = new ArrayList<String>();
        if (a == null || b == null) {
            return new String[0];
        }
        for (String palabraA : a) {
            for (String palabraB : b) {
                if (palabraA.equals(palabraB) && !comunes.contains(palabraA)) {
                    comunes.add(palabraA);
                }
            }
        }
        return comunes.toArray(new String[0]);
    }

    public Set<String> palabrasComunesConColeccion(String[] a, String[] b) {
        Set<String> conjuntoA = new LinkedHashSet<String>();
        Set<String> comunes = new LinkedHashSet<String>();
        if (a == null || b == null) {
            return comunes;
        }
        for (String palabra : a) {
            conjuntoA.add(palabra);
        }
        for (String palabra : b) {
            if (conjuntoA.contains(palabra)) {
                comunes.add(palabra);
            }
        }
        return comunes;
    }

    public static void main(String[] args) {
        ContadorPalabras contador = new ContadorPalabras();
        String[] lineas = {"uno dos", "tres cuatro cinco"};
        System.out.println(contador.analizar(lineas));
        System.out.println(contador.palabrasComunesConColeccion(
                new String[]{"java", "texto"}, new String[]{"texto", "maven"}));
    }
}
