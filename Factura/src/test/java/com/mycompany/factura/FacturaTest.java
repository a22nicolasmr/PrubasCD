/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.factura;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Usuario
 */
public class FacturaTest {
    
    public FacturaTest() {
    }


    @Test
    public void testCalcularPrezokWh() {
        System.out.println("calcularPrezokWh");
        Factura instance = new Factura();
        instance.setConsumokWh(-100);
        int expResult = 9;
        int result = instance.calcularPrezokWh();
        assertEquals(expResult, result);
    }
    @Test
    public void testCalcularPrezokWh2() {
        System.out.println("calcularPrezokWh");
        Factura instance = new Factura();
        instance.setConsumokWh(-50);
        int expResult = 9;
        int result = instance.calcularPrezokWh();
        assertEquals(expResult, result);
    }
    @Test
    public void testCalcularPrezokWh3() {
        System.out.println("calcularPrezokWh");
        Factura instance = new Factura();
        instance.setConsumokWh(300);
        int expResult = 9;
        int result = instance.calcularPrezokWh();
        assertEquals(expResult, result);
    }
    @Test
    public void testCalcularPrezokWh4() {
        System.out.println("calcularPrezokWh");
        Factura instance = new Factura();
        instance.setConsumokWh(301);
        int expResult = 8;
        int result = instance.calcularPrezokWh();
        assertEquals(expResult, result);
    }
    @Test
    public void testCalcularPrezokWh5() {
        System.out.println("calcularPrezokWh");
        Factura instance = new Factura();
        instance.setConsumokWh(555);
        int expResult = 8;
        int result = instance.calcularPrezokWh();
        assertEquals(expResult, result);
    }
    @Test
    public void testCalcularPrezokWh6() {
        System.out.println("calcularPrezokWh");
        Factura instance = new Factura();
        instance.setConsumokWh(600);
        int expResult = 8;
        int result = instance.calcularPrezokWh();
        assertEquals(expResult, result);
    }
    @Test
    public void testCalcularPrezokWh7() {
       System.out.println("calcularPrezokWh");
        Factura instance = new Factura();
        instance.setConsumokWh(601);
        int expResult = 6;
        int result = instance.calcularPrezokWh();
        assertEquals(expResult, result);
    }
    @Test
    public void testCalcularPrezokWh8() {
        System.out.println("calcularPrezokWh");
        Factura instance = new Factura();
        instance.setConsumokWh(777);
        int expResult = 6;
        int result = instance.calcularPrezokWh();
        assertEquals(expResult, result);
    }
    @Test
    public void testCalcularPrezokWh9() {
        System.out.println("calcularPrezokWh");
        Factura instance = new Factura();
        instance.setConsumokWh(1000);
        int expResult = 6;
        int result = instance.calcularPrezokWh();
        assertEquals(expResult, result);
    }
    @Test
    public void testCalcularPrezokWh10() {
        System.out.println("calcularPrezokWh");
        Factura instance = new Factura();
        instance.setConsumokWh(1001);
        int expResult = 5;
        int result = instance.calcularPrezokWh();
        assertEquals(expResult, result);
    }
    @Test
    public void testCalcularPrezokWh11() {
        System.out.println("calcularPrezokWh");
        Factura instance = new Factura();
        instance.setConsumokWh(1600);
        int expResult = 5;
        int result = instance.calcularPrezokWh();
        assertEquals(expResult, result);
    }
    @Test
    public void testCalcularPrezokWh12() {
        System.out.println("calcularPrezokWh");
        Factura instance = new Factura();
        instance.setConsumokWh(2000);
        int expResult = 5;
        int result = instance.calcularPrezokWh();
        assertEquals(expResult, result);
    }
    @Test
    public void testCalcularPrezokWh13() {
        System.out.println("calcularPrezokWh");
        Factura instance = new Factura();
        instance.setConsumokWh(0);
        int expResult = 9;
        int result = instance.calcularPrezokWh();
        assertEquals(expResult, result);
    }
}
