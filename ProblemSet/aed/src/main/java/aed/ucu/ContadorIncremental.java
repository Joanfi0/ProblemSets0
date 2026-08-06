package aed.ucu;
import java.util.Scanner;

public class ContadorIncremental {
    private int contador;
    private int incremento;
    private final int MAX_COUNT;

    public ContadorIncremental (int incremento, int MAX_COUNT ) {
        this.contador = 0;
        this.incremento = incremento;
        this.MAX_COUNT = MAX_COUNT;
    }

    public void contarConWhile() {
        while (contador <= MAX_COUNT) {
            System.out.println(contador);
            contador += incremento;
        }
    }

    public void contarConFor() {
        for (contador = 0; contador <= MAX_COUNT; contador += incremento) {
            System.out.println(contador);
        }
    }

    public void contarConDoWhile() {
        int contador = 0;
        do {
            System.out.println(contador);
            contador += incremento;
        } while (contador <= MAX_COUNT);

    }    

    public static void main(String[] args) {
        ContadorIncremental contador1 = new ContadorIncremental (2, 100);
        ContadorIncremental contador2 = new ContadorIncremental (2, 100);
        ContadorIncremental contador3 = new ContadorIncremental (2, 100);

        System.out.println("----Menu----");
        System.out.println("Seleccione una opcion");
        System.out.println("1 - Contador con While");
        System.out.println("2 - Contador con For");
        System.out.println("3 - Contador con do while");
        System.out.println("4 - Salir");

        Scanner scan = new Scanner(System.in);
        String opcion = scan.nextLine();
        switch (opcion) {
            case "1":
                contador1.contarConWhile();
                break;
            case "2":
                contador2.contarConFor();
                break;
            case "3":
                contador3.contarConDoWhile();
                break;
            case "4":
                System.out.println("Fin");
                break;
            default:
                System.out.println("Opción inválida.");
                break;
                    
            }
    }
    
}

/*
Atributo static: 
- Es un atributo que pertenece a la clase y existe solo 
una copia compartida entre todos los objetos

Atributo de instancia: 
- Es un atributo que pertenece a cada objeto, cada instancia
tiene su propio valor

Cuando usar:

- While: cuando nose cuantas veces se va a repetir

- Do While: Cuando necesite que se ejecute el loop al menos una vez, porque
la condicion se comprueba al final

- For: cuando conozco el inicio, la condicion y la actualizacion

*/