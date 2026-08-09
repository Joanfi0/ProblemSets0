package aed.ucu;

import java.util.Objects;

public abstract class DispositivoMedico {
    private static int cantidadDispositivos;

    private final int idDispositivo;
    private final String codigoFabricante;

    protected DispositivoMedico(int idDispositivo, String codigoFabricante) {
        this.idDispositivo = idDispositivo;
        this.codigoFabricante = codigoFabricante;
        cantidadDispositivos++;
    }

    public int getIdDispositivo() {
        return idDispositivo;
    }

    public String getCodigoFabricante() {
        return codigoFabricante;
    }

    public static int getCantidadDispositivos() {
        return cantidadDispositivos;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DispositivoMedico)) {
            return false;
        }
        DispositivoMedico other = (DispositivoMedico) obj;
        return idDispositivo == other.idDispositivo
                && Objects.equals(codigoFabricante, other.codigoFabricante);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDispositivo, codigoFabricante);
    }
}
