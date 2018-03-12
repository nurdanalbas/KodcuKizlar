/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author NurdanPC
 */
public class Nesne {

    int saat;
    int dakika;
    int saniye;

    public Nesne(int saat, int dakika, int saniye) {

        this.saat = saat;
        this.dakika = dakika;
        this.saniye = saniye;
    }
    
    void zaman() {

        System.out.println("Zamanı yaz: " + saat + " saat " + dakika + " dakika " + saniye + " saniye ");
    }


    public static void main(String[] args) {
        Nesne saat = new Nesne(1, 2, 3);
        saat.zaman();
       
    }
}
