package aed.ucu;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

import java.time.Duration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TransformadorT9Test {
    private String textoBase;

    @BeforeEach
    public void setUp() {
        textoBase = "hello";
    }

    @Test
    public void convierteTextoBasico() {
        assertEquals("43556", TransformadorT9.convertir(textoBase));
    }

    @ParameterizedTest
    @CsvSource({"abc,222", "def,333", "xyz,999"})
    public void convierteGruposDeLetras(String entrada, String esperado) {
        assertEquals(esperado, TransformadorT9.convertir(entrada));
    }

    @Test
    public void textoNullLanzaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> TransformadorT9.convertir(null));
    }

    @Test
    public void conversionTieneTimeout() {
        assertTimeoutPreemptively(Duration.ofMillis(100), () -> TransformadorT9.convertir("texto largo"));
    }

    @Test
    public void convierteTextoInvertido() {
        assertEquals("65534", TransformadorT9.convertirInvertido(textoBase));
    }
}
