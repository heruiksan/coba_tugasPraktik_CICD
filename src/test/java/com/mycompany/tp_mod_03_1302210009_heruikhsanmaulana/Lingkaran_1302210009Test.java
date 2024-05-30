/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.tp_mod_03_1302210009_heruikhsanmaulana;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author herui
 */
public class Lingkaran_1302210009Test {
    
    public Lingkaran_1302210009Test() {
    }

    @Test
    public void testSetWarna() {
        Lingkaran_1302210009 L = new Lingkaran_1302210009();
        L.setWarna_1302210009("merah");
        assertEquals("merah", L.warna);
    }

    @Test
    public void testCalculateKeliling() {
        Lingkaran_1302210009 L = new Lingkaran_1302210009();
        L.jari = 7;
        double expectedKeliling = (22.0 / 7.0) * 2.0 * L.jari;
        assertEquals(expectedKeliling, L.calculateKeliling(), 1e-9);
    }

    @Test
    public void testCalculateLuas() {
        Lingkaran_1302210009 L = new Lingkaran_1302210009();
        L.jari = 7;
        double expectedLuas = (22.0 / 7.0) * L.jari * L.jari;
        assertEquals(expectedLuas, L.calculateLuas(), 1e-9);
    }
    
}
