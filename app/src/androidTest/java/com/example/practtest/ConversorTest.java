package com.example.practtest;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConversorTest {
    Conversor conversor;

    @Before
    public void preparacion() {
        conversor = new Conversor();

    }

    @Test
    public void noDaNulo() {
        assertNotNull(conversor);
    }

    @Test
    public void dolaresAEuros() {
       assertEquals(".00", conversor.eurosADolares("0"));
        assertEquals("1.10", conversor.eurosADolares("1"));
        assertEquals("22.00", conversor.eurosADolares("20"));
        assertEquals("148.50", conversor.eurosADolares("135"));
        assertEquals("502.34", conversor.eurosADolares("456.67"));
        assertEquals("Error", conversor.eurosADolares("cadena"));
    }

    @Test
    public void eurosADolares() {
       assertEquals(".00", conversor.dolaresAEuros("0"));
        assertEquals("1.00", conversor.dolaresAEuros("1.1"));
        assertEquals("20.00", conversor.dolaresAEuros("22"));
        assertEquals("135.00", conversor.dolaresAEuros("148.5"));
        assertEquals("456.67", conversor.dolaresAEuros("502.34"));
        assertEquals("Error", conversor.dolaresAEuros("cadena"));

    }

    @Test
    public void librasAEuros() {
       assertEquals(".00", conversor.eurosALibras("0"));
        assertEquals("1.00", conversor.eurosALibras("1.18"));
        assertEquals("33.00", conversor.eurosALibras("38.94"));
        assertEquals("267.00", conversor.eurosALibras("315.06"));
        assertEquals("1678.00", conversor.eurosALibras("1980.04"));
        assertEquals("888.89", conversor.eurosALibras("1048.89"));
        assertEquals("Error", conversor.eurosALibras("cadena"));
    }

    @Test
    public void eurosALibras() {
        assertEquals("0", conversor.librasAEuros("0"));
        assertEquals("1.18", conversor.librasAEuros("1"));
        assertEquals("38.94", conversor.librasAEuros("33"));
        assertEquals("315.06", conversor.librasAEuros("267"));
        assertEquals("1980.04", conversor.librasAEuros("1678"));
        assertEquals("1048.89", conversor.librasAEuros("888.89"));
        assertEquals("Error", conversor.librasAEuros("cadena"));
    }
}