package aed.ucu;

public class DemoDispositivos {

    public static void main(String[] args) {
        Marcapasos marcapasos = new Marcapasos(1, "FAB-001", (short) 70, (byte) 95);
        Desfibrilador desfibrilador = new Desfibrilador(2, "FAB-002", (short) 30, 0);

        System.out.println(marcapasos);
        System.out.println(desfibrilador);
        System.out.println("Dispositivos creados: " + DispositivoMedico.getCantidadDispositivos());
    }
}
