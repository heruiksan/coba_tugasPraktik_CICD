/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author herui
 */

package com.mycompany.tp_mod_03_1302210009_heruikhsanmaulana;

public class Lingkaran_1302210009 {
    public String warna;
    public double jari;

    public void printWarna_1302210009() {
        System.out.println("Warna lingkaran adalah " + warna);
    }

    public void setWarna_1302210009(String WarnaLingkaran) {
        warna = WarnaLingkaran;
    }

    public double calculateKeliling() {
        return (22.0 / 7.0) * 2.0 * jari;
    }

    public void printkeliling_1302210009() {
        double keliling = calculateKeliling();
        System.out.println("Keliling objek lingkaran adalah " + keliling);
    }

    public double calculateLuas() {
        return (22.0 / 7.0) * jari * jari;
    }

    public void printLuas_1302210009() {
        double luas = calculateLuas();
        System.out.println("Luas objek lingkaran adalah " + luas);
    }
}
