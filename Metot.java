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
public class Metot {

    public int topla(int a, int b) {
        
        return a + b;
    }

    public int faktoriyel(int a){
       
        int carpim=1;
        for (int i = a; i >0; i--) {
            carpim*=i;
        }
        return carpim;
    }
    public int usluSayi(int a,int b){
        
        int us=1;
        for (int i = 1; i <= b; i++) {
            us*=a;
        }
        return us;
    }
    
    public static void main(String[] args) {
        Metot m=new Metot();
        System.out.println("Toplam: " +m.topla(5,7));
        System.out.println("Faktöriyel: " +m.faktoriyel(4));
        System.out.println("Üslü Sayı: " +m.usluSayi(2, 7));
    }
}
