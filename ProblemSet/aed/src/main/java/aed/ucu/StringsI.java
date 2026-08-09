package aed.ucu;

public class StringsI {

    public static boolean esPalindromo(String texto) {
        String limpio = texto.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        return limpio.equals(new StringBuilder(limpio).reverse().toString());
    }

    public static void main(String[] args) {
        String hannah = "Did Hannah see bees? Hannah did.";
        String frase = "Anita lava la tina";

        System.out.println("Palindromo: " + frase + " -> " + esPalindromo(frase));
        System.out.println("trim: [" + "  texto  ".trim() + "]");
        System.out.println("toLowerCase: " + hannah.toLowerCase());
        System.out.println("toUpperCase: " + hannah.toUpperCase());
        System.out.println("substring: " + hannah.substring(4, 10));
        System.out.println("subSequence: " + hannah.subSequence(0, 3));
        System.out.println("split: " + hannah.split(" ").length);
        System.out.println("indexOf Hannah: " + hannah.indexOf("Hannah"));
        System.out.println("lastIndexOf Hannah: " + hannah.lastIndexOf("Hannah"));
        System.out.println("contains bees: " + hannah.contains("bees"));
        System.out.println("replace: " + hannah.replace("Hannah", "Ana"));
        System.out.println("replaceAll: " + hannah.replaceAll("[aeiouAEIOU]", "*"));
        System.out.println("replaceFirst: " + hannah.replaceFirst("Hannah", "Ana"));
        System.out.println("longitud hannah: " + hannah.length());
        System.out.println("caracter indice 4: " + hannah.charAt(4));
        System.out.println("subcadena 4..10: " + hannah.substring(4, 10));
    }
}
