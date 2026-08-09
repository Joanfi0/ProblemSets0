package aed.ucu;

import java.util.EnumMap;
import java.util.Map;

public class AnalizadorCaracteres {

    public static TipoCaracter clasificar(char c) {
        if (Character.isDigit(c)) {
            return TipoCaracter.DIGITO;
        }
        if (!Character.isLetter(c)) {
            return TipoCaracter.OTRO;
        }
        char lower = Character.toLowerCase(c);
        if ("aeiou".indexOf(lower) >= 0) {
            return TipoCaracter.VOCAL;
        }
        return TipoCaracter.CONSONANTE;
    }

    public static Map<TipoCaracter, Integer> contar(String texto) {
        Map<TipoCaracter, Integer> resultado = new EnumMap<TipoCaracter, Integer>(TipoCaracter.class);
        for (TipoCaracter tipo : TipoCaracter.values()) {
            resultado.put(tipo, 0);
        }
        if (texto != null) {
            for (int i = 0; i < texto.length(); i++) {
                TipoCaracter tipo = clasificar(texto.charAt(i));
                resultado.put(tipo, resultado.get(tipo) + 1);
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        for (TipoCaracter tipo : TipoCaracter.values()) {
            System.out.println(tipo);
        }
        System.out.println(contar("Java 2026!"));
    }
}
