/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author NurdanPC
 */
public class DiziMatrisOrnek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //fibonacci bulma çözümleri
        //çözüm1
        
        //        //1  1  2 3 5 8 13 21
        //        //f1 f2 f3
        //        //   f1 f2 f3 
        
        //        int fib1 = 1;
        //        int fib2 = 1;
        //        int fib3;
        //        for (int i = 0; i < 10; i++) {
        //            fib3 = fib1 + fib2;
        //            fib1 = fib2;
        //            fib2 = fib3;
        //      //      System.out.println(fib3);
        //        }
        
        //çözüm2
        //        //1  1  2  3  5  8  13
        //        //a0 a1 a2
        //        //a2=a0+a1
        //        //a3=a2+a1
        //        //a4=a3+a1
        //
        //        int f[] = new int[10];
        //        f[0] = 1;
        //        f[1] = 1;
        //        for (int i = 2; i < f.length; i++) {
        //            f[i] = f[0] + f[1];
        //
        //        }
        //
        
        //        //dizinin elemanlarının toplamı
        //        
        //        int dizi[]={10,20,30,40,05,60,07,80,90};
        //        int toplam=0;
        //        for (int i = 0; i < dizi.length; i++) {
        //            toplam+=dizi[i];

        // }   
        //    System.out.println(toplam);
        
        //iki dizinin elemanlarının toplamını yeni diziye atama 
        //        int dizi1[]={1,3,5,7,9,11};
        //        int dizi2[]={0,2,4,6,8,10};
        //        System.out.print("{");
        //        int dizi3[]=new int[6];
        //        int toplam12=0;
        //        for (int i = 0; i < dizi1.length; i++) {
        //            dizi3[i]=dizi1[i]+dizi2[i];
        //        System.out.print(dizi3[i]+ ",");
        //        
        //        
        //        }
        //           System.out.println("}");
        //           
        
        //Dizi elemanları ortalaması
        //        int dizi[]={1,2,3};
        //        int sum=0;int ort=0;
        //        for (int i = 0; i < dizi.length; i++) {
        //            sum+=dizi[i];
        //            ort=sum/dizi.length;          
        //        }
        //        System.out.println("Dizinin elemanları toplamı: " +sum);
        //        System.out.println("Dizinin elemanlarının ortalaması: "+ort);
        

        // Dizi elemanları arasındaki maksimum değerin bulunması
        //        int dizi[] = {10, 9, 8, 7, 5, 6, 123, 5, 5698};
        //        int max = dizi[0];
        //
        //        for (int i = 0; i < dizi.length; i++) {
        //            if (dizi[i] > max) {
        //                max = dizi[i];
        //            }
        //            
        //        }
        //        System.out.println("Dizinin en büyük elemanı: " + max);
        //
        

        //Dizi elemanları arasındaki minimum değerin bulunması
        //        int dizi2[] = {10, 9, 8, 7, 5, 6, 123, 5, 5698};
        //        int min = dizi2[0];
        //
        //        for (int i = 0; i < dizi2.length; i++) {
        //            if (dizi2[i] < min) {
        //                min = dizi2[i];
        //            }
        //        }
        //        System.out.println("Dizinin en küçük elemanı: " + min);
        

        //dizinin büyük ve küçük elemanı arasındaki fark
        //
        //        int dizi2[] = {10, 9, 8, 7, 5, 6, 123, 5, 5698};
        //        int max = dizi2[0];
        //        int min = dizi2[0];
        //
        //        for (int i = 0; i < dizi2.length; i++) {
        //            if (dizi2[i] < min) {
        //                min = dizi2[i];
        //            } else if (dizi2[i] > max) {
        //                max = dizi2[i];
        //            }
        //        }
        //        System.out.println("Dizinin büyük ve küçük elemanı arasındaki fark: " + (max - min));
        

        //dizideki elemanları küçükten büyüğe sıralama
        //        int dizi[] = {7, 5, 4, 8, 6};
        //        int temp;
        //        for (int i = 1; i < dizi.length; i++) {
        //            for (int j = 0; j < dizi.length - i; j++) {
        //                if (dizi[j] > dizi[j + 1]) {// 7>?5
        //                    temp = dizi[j];//temp=7
        //                    dizi[j] = dizi[j + 1];//dizi[0]=5
        //                    dizi[j + 1] = temp; //dizi[1]=7
        //
        //                }
        //            }
        //        }
        //        
        //        for (int i = 0; i < dizi.length; i++) {
        //            System.out.println(dizi[i]);
        //        }
        
    
        //dizinin elemanlarını 3er 3er toplayıp yeni diziye atma
//        int dizi[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int top = 0;
//        int dizi2[] = new int[3];
//
//        for (int i = 0; i < dizi.length+1; i++) {
//            
//             
//            
//            if (i != 0 && i % 3 == 0) {
//               
//                for (int j =2; j < dizi2.length; j++)
//                {   
//                    dizi2[j]=top;
//                    System.out.println(dizi2[j]);
//                }
//               
//                top=0;
//
//            }
//            
//           top += dizi[i];          
//
//        }



            // iki boyutlu diziler
            //        Random r=new Random();
            //        int dizi[][]=new int[3][3];
            //       
            //                for (int i = 0; i < dizi.length; i++) {
            //                    for (int j = 0; j < dizi[0].length; j++) {
            //                        dizi[i][j]=r.nextInt(9);
            //                        System.out.print(dizi[i][j]);
            //                       
            //                    } System.out.println();
            //        }
            
                    //iki boyutlu diziler çıkarma işlemi
                    //önce iki tane matris oluştur
            //     int dizi[][]=new int[2][2];
            //     int dizi2[][]=new int[2][2];
            //     
            //     //bu matrislere girilecek değerleri kullanıcıdan al
            //     System.out.println("3x3 lük matris için sayı girin:");
            //     
            //     Scanner scan=new Scanner(System.in);
            //            
            //     
            //     //Girdiğimiz sayılar matrislere atansın
            //        for (int i = 0; i < dizi.length; i++) {
            //            for (int j = 0; j < dizi[0].length; j++) {
            //                int deger=scan.nextInt();
            //                dizi[i][j]=deger;
            //            }
            //        }
            //        for (int i = 0; i < dizi2.length; i++) {
            //            for (int j = 0; j < dizi2[0].length; j++) {
            //                int deger=scan.nextInt();
            //                dizi2[i][j]=deger;
            //            }
            //        }        
            //        System.out.println("Oluşan matris: ");
            //        
            //        for (int i = 0; i < dizi.length; i++) {
            //            for (int j = 0; j < dizi[0].length; j++) {
            //                System.out.print(dizi[i][j]+" ");
            //                
            //            }
            //            System.out.println("");
            //        }
            //        System.out.println("-");
            //        
            //        for (int i = 0; i < dizi2.length; i++) {
            //            for (int j = 0; j < dizi2[0].length; j++) {
            //                System.out.print(dizi2[i][j]+" ");
            //                
            //            }
            //            System.out.println("");
            //        }        
            //        //sonuc matrisi:
            //        System.out.println("Sonuç: ");
            //        for (int i = 0; i < dizi.length; i++) {
            //            for (int j = 0; j < dizi2[0].length; j++) {
            //                 System.out.print(dizi[i][j]-dizi2[i][j]+" ");
            //       
            //            }
            //            System.out.println("");
            //        }
            
            
            //matrisin satır ve sütunlarının yerlerini değiştirme
                    //önce diziyi oluştur
            //        int dizi[][] = new int[3][3];
            //
            //        //random olarak diziyi doldur
            //        Random r = new Random();
            //
            //        for (int i = 0; i < dizi.length; i++) {
            //            for (int j = 0; j < dizi[0].length; j++) {
            //                dizi[i][j] = r.nextInt(9);
            //                System.out.print(dizi[i][j] + " ");
            //            }
            //            System.out.println("");
            //        }
            //        //matrisin satır ve sütunlarının yerlerini değiştir
            //        
            //        int temp;
            //        System.out.println("Yer değişmiş hali");
            //        for (int i = 0; i < dizi.length; i++) { //satır
            //            for (int j = 0; j <i; j++) { //sutun
            //                temp=dizi[i][j];
            //                dizi[i][j]=dizi[j][i];
            //                dizi[j][i]=temp;
            //            }
            //            
            //            
            //        }
            //        for (int i = 0; i < dizi.length; i++) {
            //            for (int j = 0; j <dizi[0].length; j++) {
            //               System.out.print(dizi[i][j]+" ");
            //            }System.out.println("");
            //        }
            

            //Bir matrisin satır ve sütunlarının toplamının bulunması
            //        int matris[][] = new int[3][3];
            //
            //        Random r = new Random();
            //
            //        for (int i = 0; i < matris.length; i++) {
            //            for (int j = 0; j < matris[0].length; j++) {
            //                matris[i][j] = r.nextInt(9);
            //                System.out.print(matris[i][j] + " ");
            //            }
            //            System.out.println("");
            //        }
            //        
            //        int sum=0;
            //        for (int i = 0; i < matris.length; i++) {
            //            for (int j = 0; j <matris[0].length ; j++) {
            //     
            //                sum+=matris[i][j];
            //                System.out.println("top: "+sum);
            //
            //            }
            //        }
    
            
            //Bir matrisin en büyük elemanının bulunması
            //        int matris[][] = new int[3][3];
            //        int yeni[] = new int[3];
            //        Random r = new Random();
            //
            //        for (int i = 0; i < matris.length; i++) {
            //            for (int j = 0; j < matris[0].length; j++) {
            //                matris[i][j] = r.nextInt(9);
            //                System.out.print(matris[i][j] + " ");
            //            }
            //            System.out.println("");
            //        }
            //
            //        int buyuk = matris[0][0];
            //
            //        for (int i = 0; i < matris.length; i++) {
            //
            //            for (int j = 0; j < matris[0].length; j++) {
            //
            //                if (matris[i][j] > buyuk) {
            //
            //                    buyuk = matris[i][j];
            //
            //                }
            //
            //            }
            //
            //        }
            //        System.out.println("En büyük eleman" + buyuk);

            
            //iki matrisin çarpımı
            //
            //        int matris[][]=new int[2][2];
            //        int matris2[][] = new int[2][2];
            //
            //        Random r=new Random();
            //        
            //        //Matrisleri random olarak dolduralım
            //        System.out.println("Oluşan matris :");
            //        for (int i = 0; i < matris.length; i++) {
            //            for (int j = 0; j < matris[0].length; j++) {
            //                matris[i][j]=r.nextInt(9);
            //                System.out.print(matris[i][j]+" ");
            //            }
            //            System.out.println();
            //        }
            //        
            //        System.out.println("Oluşan matris :");
            //        for (int i = 0; i < matris2.length; i++) {
            //            for (int j = 0; j < matris2[0].length; j++) {
            //                matris2[i][j]=r.nextInt(9);
            //                System.out.print(matris2[i][j]+" ");
            //            }
            //            System.out.println();
            //        }
            //        
            //        //carpma islemi 
            //        
            //        int carpim=1;
            //        int toplam=0;
            //        
            //        for (int i = 0; i < matris.length; i++) {
            //            toplam=0;
            //            
            //            for (int j = 0; j < matris2[0].length; j++) {
            //              carpim=matris[i][j]*matris2[j][i];
            //              toplam+=carpim;
            //              
            //            }
            //            System.out.println(toplam);
            //        }
   }

}
