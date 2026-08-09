package aed.ucu;

public class Desfibrilador extends DispositivoMedico {
    private short nivelDescarga;
    private int descargasAplicadas;

    public Desfibrilador(int idDispositivo, String codigoFabricante,
                         short nivelDescarga, int descargasAplicadas) {
        super(idDispositivo, codigoFabricante);
        this.nivelDescarga = nivelDescarga;
        this.descargasAplicadas = descargasAplicadas;
    }

    public short getNivelDescarga() {
        return nivelDescarga;
    }

    public void setNivelDescarga(short nivelDescarga) {
        this.nivelDescarga = nivelDescarga;
    }

    public int getDescargasAplicadas() {
        return descargasAplicadas;
    }

    public void setDescargasAplicadas(int descargasAplicadas) {
        this.descargasAplicadas = descargasAplicadas;
    }

    @Override
    public String toString() {
        return "Desfibrilador{id=" + getIdDispositivo()
                + ", fabricante='" + getCodigoFabricante() + '\''
                + ", descarga=" + nivelDescarga
                + ", descargasAplicadas=" + descargasAplicadas + "}";
    }
}
