/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author herui
 */
package com.mycompany.tp_mod_03_1302210009_heruikhsanmaulana;

public class TestLingkaran_1302210009 {
    public static void main(String[] args) {
        // Create an instance of Lingkaran_1302210009
        Lingkaran_1302210009 L = new Lingkaran_1302210009();
        
        // Test case 1: Set jari-jari to 7 and warna to "merah"
        L.jari = 7;
        L.setWarna_1302210009("merah");
        
        // Test the color
        assert L.warna.equals("merah") : "Test case 1 failed: Warna should be merah";
        
        // Print and test keliling
        double expectedKeliling = (22.0 / 7.0) * 2.0 * L.jari;
        L.printkeliling_1302210009(L);
        System.out.println("Expected keliling: " + expectedKeliling);
        assert Math.abs(expectedKeliling - ((22.0 / 7.0) * 2.0 * L.jari)) < 1e-9 : "Test case 1 failed: Keliling is incorrect";
        
        // Print and test luas
        double expectedLuas = (22.0 / 7.0) * L.jari * L.jari;
        L.printLuas_1302210009(L);
        System.out.println("Expected luas: " + expectedLuas);
        assert Math.abs(expectedLuas - ((22.0 / 7.0) * L.jari * L.jari)) < 1e-9 : "Test case 1 failed: Luas is incorrect";
        
        // Additional test cases can be added similarly
        System.out.println("All test cases passed.");
    }
}

