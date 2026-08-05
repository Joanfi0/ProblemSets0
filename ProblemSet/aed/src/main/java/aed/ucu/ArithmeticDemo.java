package aed.ucu;

public class ArithmeticDemo {

    public static void main(String[] args) {
        int result = 1 + 2; // result vale 3

        // Asignaciones compuestas
        result -= 1; // Equivale a: result = result - 1
        result *= 2; // Equivale a: result = result * 2
        result /= 2; // Equivale a: result = result / 2
        result += 8; // Equivale a: result = result + 8
        result %= 7; // Equivale a: result = result % 7

        System.out.println("Resultado: " + result);

        /*
         * Primero se incrementa i.
         * Después se suma su nuevo valor a a.
         */
        int a = 5;
        int i = 3;
        a += ++i;

        System.out.println("a: " + a); // 9
        System.out.println("i: " + i); // 4

        // Se verifica que se recibieron exactamente dos argumentos.
        if (args.length != 2) {
            System.out.println("Uso: java aed.ucu.ArithmeticDemo <numero1> <numero2>");
            return;
        }

        try {
            // Conversión de String a double.
            double numero1 = Double.parseDouble(args[0]);
            double numero2 = Double.parseDouble(args[1]);

            System.out.println("Suma: " + (numero1 + numero2));
            System.out.println("Resta: " + (numero1 - numero2));
            System.out.println("Multiplicación: " + (numero1 * numero2));

            if (numero2 != 0) {
                System.out.println("División: " + (numero1 / numero2));
                System.out.println("Resto: " + (numero1 % numero2));
            } else {
                System.out.println("No se puede dividir entre cero.");
            }
        } catch (NumberFormatException error) {
            System.out.println("Error: los dos argumentos deben ser números.");
        }
    }
}