package aed.ucu;

public class Marcapasos extends DispositivoMedico {
    private short latidosPorMinuto;
    private byte nivelBateria;

    public Marcapasos(int idDispositivo, String codigoFabricante,
                      short latidosPorMinuto, byte nivelBateria) {
        super(idDispositivo, codigoFabricante);
        this.latidosPorMinuto = latidosPorMinuto;
        this.nivelBateria = nivelBateria;
    }

    public short getLatidosPorMinuto() {
        return latidosPorMinuto;
    }

    public void setLatidosPorMinuto(short latidosPorMinuto) {
        this.latidosPorMinuto = latidosPorMinuto;
    }

    public byte getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(byte nivelBateria) {
        this.nivelBateria = nivelBateria;
    }

    @Override
    public String toString() {
        return "Marcapasos{id=" + getIdDispositivo()
                + ", fabricante='" + getCodigoFabricante() + '\''
                + ", lpm=" + latidosPorMinuto
                + ", bateria=" + nivelBateria + "%}";
    }
}
