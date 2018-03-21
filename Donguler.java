///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package blog_1;
//
//import java.util.Scanner;
//
///**
// *
// * @author nurdanalbas
// */
//public class Blog_Alistirma_Donguler {
//
//    public static void main(String[] args) {
//
//        //soru:1 dikdörtgen oluşturma
//        Scanner giris = new Scanner(System.in);
//        System.out.println("Oluşacak Şekil İçin Değer Giriniz: ");
//        int sayi = giris.nextInt();
//        System.out.println("--------------------------------");
//        int i, j, k;
//        for (i = 1; i <= sayi; i++) { //satır sayısı
//           
//            for (j = i ; j <= sayi; j++) { //sol taraftaki üçgen
//                System.out.print(j);
//                
//            } 
//            for (int l = 1; l <= i-1; l++) {//sağ taraftaki üçgen
//                     System.out.print(l);
//            }
//            System.out.println();
//            
//        }
//        
//        
//////soru2: girilen sayının iki katının tersi
//Scanner ss=new Scanner(System.in);
//        System.out.println("İki basamaklı bir sayı giriniz: ");
//int sayii=ss.nextInt();
//
//int ikiKat=sayii*2;
//int birler=ikiKat%10;
//int onlar=(ikiKat%100)/10;
//         System.out.println("Girdiğiniz sayının iki katı: " +ikiKat);
//        System.out.println("Girdiğiniz sayının iki katının tersi: " +birler+""+onlar);
//   
//       
//         //soru:3
//         for(int i=1;i<11;i++){
//           
//             for (int j = 1; j<11; j++) {
//                 
//                    
//                     System.out.print(i+"*"+j+"="+j*i);
//                      System.out.print("\t");
//             } 
//             System.out.println();
//             }
//         //soru 4
//         Scanner s1=new Scanner(System.in);
//         int sayi=s1.nextInt();
//          for(int i=0;i<(sayi/2)+1;i++){//satır
//             for (int j = 1; j <=2*i+1 ; j++) {//dik üçgen yıldız
//               System.out.print("*");
//            
//        }
//             System.out.println();
//             
//             }
//          for(int k=0;k<(sayi/2)+1;k++){//satir
//              for (int l = sayi-2; l>=2*k+1   ; l--) {
//                  System.out.print("*");
//              }
//              System.out.println();
//          }
//        }
//   
////    //soru
//    
//Scanner s=new Scanner(System.in);
//        System.out.println("Birinci sayıyı giriniz: ");
//int sayi=s.nextInt();
//        System.out.println("İkinci sayıyı giriniz: ");
// int sayi2=s.nextInt();
//    int taban=sayi-sayi2;
//    int us=sayi+sayi2;
//    int sonuc=1;
//    for(int i=1; i<=us; i++){
//     sonuc=sonuc*taban;
//        
//    }System.out.println(taban+"^"+us+": "+sonuc);
//   
//    
//    //soru11
//    int count=0;
//   int toplam=0;
//   for(int i=2;i<25;i++){
//       count=0;
//   for(int j=1;j<25;j++){
//       if(i%j==0){
//          // System.out.println(i+"/"+j);
//           count++;
//       }
//          
//   } if(count<=2){
//        System.out.println(i+ " sayısı asal");
//        toplam+=i;
//    }
//    else {
//      //  System.out.println(i+" sayısı asal değil");
//    }
//  
//   
//   } System.out.println("Asal sayıların toplamı: " +toplam);
//    //soru12
//    
//    Scanner giris=new Scanner(System.in);
//    System.out.println("Üç basamaklı bir sayı girin: ");
//    int grs=giris.nextInt();
//    
//    int birler=grs%10;
//    int onlar=(grs%100)/10;
//    int yuzler=(grs%1000)/100;
//   
//   int toplam=0;
//   if(yuzler%2==1){
//       toplam+=yuzler;
//   }
//        if(onlar%2==1){
//               toplam+=onlar;
//               }
//        if(birler%2==1){
//                   toplam+=birler;
//               }
//      
//       System.out.println("Tek rakamların toplamı: "+toplam);
//   
////    
////    //soru13
//    Scanner s1=new Scanner(System.in);
//    System.out.println("3 haneli sayı girin: ");
//    int s=s1.nextInt();
//    int count=1;
//    int birler=s%10;
//    int onlar=(s%100)/10;
//    int yuzler=(s%1000)/100;
//    int b=birler*birler*birler;
//    int o=onlar*onlar*onlar;
//    int y=yuzler*yuzler*yuzler;
//    
//    int top=b+o+y;
//     System.out.println(y+"+"+o+"+"+b+"= "+top);
//
//    if(top==s){
//        System.out.println("sayı armstrong");
//    }
//    else{
//        System.out.println("armstrong değil");
//    }
//   
//
////üs alma
//    int a=2;
//    int b=5;
//    int result =1;
//    
//            for (int i = 0; i < b; i++) {
//                result=result*a;   
//           }
//            
//            System.out.println(a+"^"+b+": "+result);
//   //faktoriyel
//   
//   int faktoriyel=1;      
//   Scanner girilen_deger=new Scanner(System.in);
//   System.out.println("Bir sayı giriniz: ");
//   int deger=girilen_deger.nextInt();
//   
//   for(int i=1;i<=deger;i++){
//       faktoriyel*=i;     
//   } 
//   System.out.println("Girdiğiniz sayının faktöriyeli: "+faktoriyel);
//   
//   //fibonacci
//   Scanner s=new Scanner(System.in);
//     System.out.println("Oluşacak fibonacci serisi için sayı giriniz: ");
//   int n=s.nextInt();
//    int fib0=0;
//    int fib1=1;
//    int fib2=1;
//     System.out.println(fib0);
//     System.out.println(fib1);
//     System.out.println(fib2);
//   for(int i=0;i<=n;i++){//satır sayısı
//       int fib=fib2+fib1;
//       fib1=fib2;
//       fib2=fib;
//       
//       System.out.println(fib);
//   }
//    //0-15 arasında 2 ve 5e bölünebilen sayıların toplamı
//    int toplam=0;
//    int count=0;
//     for(int i=0;i<=25;i++){
//         if(i%2==0 && i%3==0){
//             System.out.println(i);
//             toplam=toplam+i;
//             count++;
//             
//         }
//     }
//     int ort=toplam/count;
//      System.out.println("Bu sayıların toplamı: " +toplam);
//      System.out.println("Toplam bölünebilen sayısı : " +count);
//      System.out.println("Bu sayıların ortalaması : " +ort);
//      
//    //ebob ekok
//    
//    int a=16;
//    int b=24;
//    for(int i=b;i>=1;i--){
//        if(a%i==0 && b%i==0){
//            System.out.println("Ebob: " +i);
//            System.out.println("Ekok: " +a*b/i);
//            break;
//        }       
//      }
//    
//    
//      }
//    }
//          
//
//
