/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zaqiah ahmad
 */
public class mobilClass {
    String warna;
    int tahunPembuatan;
    
    void isiVariabel(String warnaMobil, int tahunMobil){
        warna=warnaMobil;
        tahunPembuatan=tahunMobil;
    }
    void printMobil(){
        System.out.println("warna mobil:" + warna);
        System.out.println("tahun Mobil:" + tahunPembuatan);
    }
}
