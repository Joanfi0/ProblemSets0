package aed.ucu;

public class PruebaAtributos {
    int numero;
    boolean activo;
    double precio;
    char letra;
    String texto;

    public static void main(String[] args) {
        PruebaAtributos prueba = new PruebaAtributos();

        System.out.println("int " + prueba.numero);
        System.out.println("boolean: " + prueba.activo);
        System.out.println("double: " + prueba.precio);
        System.out.println("char: [" + prueba.letra + "]");
        System.out.println("String: " + prueba.texto);

        int edad = 20;
        int cantidadTotal = 5;
        int _contador = 1;
        int numero2 = 2;

        System.out.println("Edad: " + edad);
        System.out.println("Cantidad total: " + cantidadTotal);
        System.out.println("Contador: " + _contador);
        System.out.println("Número 2: " + numero2);


        int variableLocal;

        variableLocal = 10;
        System.out.println("Variable local: " + variableLocal);
    }
}


/*
➜  aed git:(ejercicios) ✗ javac -d out src/main/java/aed/ucu/PruebaAtributos.java
➜  aed git:(ejercicios) ✗ java -cp out aed.ucu.PruebaAtributos  
*/
