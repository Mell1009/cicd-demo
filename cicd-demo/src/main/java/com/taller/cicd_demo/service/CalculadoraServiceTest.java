package com.taller.cicd_demo.service;



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.taller.cicd_demo.service.CalculadoraService;


class CalculadoraServiceTest {

    private final CalculadoraService service = new CalculadoraService();

    @Test
    void sumar_debeRetornarSumaCorrecta() {
        assertEquals(10, service.sumar(4, 6));
    }

    @Test
    void restar_debeRetornarDiferenciaCorrecta() {
        assertEquals(3, service.restar(8, 5));
    }

    @Test
    void dividir_entreCero_debeLanzarExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> service.dividir(10, 0));
    }
}