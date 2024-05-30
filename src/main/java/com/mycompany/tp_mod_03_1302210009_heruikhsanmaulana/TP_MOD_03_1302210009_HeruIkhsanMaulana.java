/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp_mod_03_1302210009_heruikhsanmaulana;

/**
 *
 * @author herui
 */
import java.util.*;
class Lingkaran_1302210009{
    String warna;
    double jari;
    void printWarna_1302210009(Lingkaran_1302210009 L){
        L.setWarna_1302210009(warna);
        System.out.println("Warna lingkaran adalah "+warna);
    }
    
    void setWarna_1302210009(String WarnaLingkaran){
        warna = WarnaLingkaran;
    }
    
    void printkeliling_1302210009(Lingkaran_1302210009 L){
        double keliling;
        keliling = (22.0/7.0) * 2.0 * jari;
        System.out.println("Keliling objek lingkaran adalah "+keliling);
    }
    
    void printLuas_1302210009(Lingkaran_1302210009 L){
        double luas;
        luas = (22.0/7.0) * jari * jari;
        System.out.println("Luas objek lingkaran adalah "+luas);
    }
}


public class TP_MOD_03_1302210009_HeruIkhsanMaulana {

    public static void main(String[] args) {
        Lingkaran_1302210009 L;
        L = new Lingkaran_1302210009();
        
        Scanner writeline = new Scanner(System.in);
        System.out.println("Masukan besaran jari-jari lingkaran: ");
        L.jari = writeline.nextDouble();
        System.out.println("Masukan warna dari lingkaran: ");
        L.warna = writeline.next();
        System.out.println("\n");
        L.printWarna_1302210009(L);
        L.printkeliling_1302210009(L);
        L.printLuas_1302210009(L);
    }
}
