/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blog_1;

/**
 *
 * @author nurdanalbas
 */
public class KontrolYapi {

    public static void main(String[] args) {

       // while örnek
        System.out.println("20 ye kadar olan sayılar:");
        int sayilar = 0;
        while (sayilar < 20) {
            sayilar++;
            System.out.print(sayilar+"-");
        }
       // do while örnek
        System.out.println("Do-while sonsuz döngü: ");
        int sayilar1=0;
        do{
            sayilar1++;
            System.out.print(sayilar1+"-");
        }
        while(sayilar1!=0);
       // for örnek

        System.out.println("10 dan 1 e kadar olan sayıları yazdırma: ");

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }


}
