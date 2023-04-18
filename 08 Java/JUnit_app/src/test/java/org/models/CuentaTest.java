package org.models;

import org.junit.jupiter.api.*;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CuentaTest {

    @Test
    void testNombreCuenta() {
        Cuenta cuenta = new Cuenta("Manolo", new BigDecimal(1234.4132421));

        String esperado = "Manolo";
        String real = cuenta.getPersona();
        assertEquals(esperado, real);
    }

    @Test
    void testSaldoCuenta(){
        // 1 - Creamos la instancia de clase
        Cuenta cuenta = new Cuenta("Manolo", new BigDecimal(1234.4132421));

        //Miramos si ambos valores son iguales
        assertEquals(1234.4132421, cuenta.getSaldo().doubleValue());

        //Miramos que el saldo no sea negativo
        assertFalse(cuenta.getSaldo().compareTo(BigDecimal.ZERO) < 0);

    }

    //Comparación de dos objetos
    @Test
    void testDiferenciaCuenta(){
        Cuenta cuenta = new Cuenta("Manolo", new BigDecimal(1234.4132421));
        Cuenta cuenta2 = new Cuenta("Manolo", new BigDecimal(1234.4132421));

        assertEquals(cuenta.getPersona(), cuenta2.getPersona());
    }

    @Test
    void testDebitoCuenta(){
        Cuenta cuenta = new Cuenta("Manolo", new BigDecimal(1234));

        cuenta.debito(new BigDecimal(1000));
        assertNotNull(cuenta.getSaldo());

        assertEquals(234, cuenta.getSaldo().intValue());

    }

    @Test
    void testCreditoCuenta(){
        Cuenta cuenta = new Cuenta("Manolo", new BigDecimal(1234));

        cuenta.credito(new BigDecimal(1000));
        assertNotNull(cuenta.getSaldo());

        assertEquals(2234, cuenta.getSaldo().intValue());

    }

    @Test
    void dineroInsuficienteException(){
        Cuenta cuenta = new Cuenta("Manolo", new BigDecimal(-1234));

        //Assert para probar excepciones con lambda
        Exception excepcion = assertThrows(DineroInsuficienteException.class, ()->{
            cuenta.debito(new BigDecimal(1));
        });

        String actual = excepcion.getMessage();
        String esperado = "Dinero insuficiente";

        assertEquals(actual, esperado);
    }



}