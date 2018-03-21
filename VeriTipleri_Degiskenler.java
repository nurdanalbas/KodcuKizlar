package blog_1;

/**
 *
 * @author nurdanalbas
 */
public class VeriTipleri_Degiskenler {

    public static void main(String[] args) {

        int i=12;
        float f=12.0f;
        float toplam=i+f;
        System.out.println(toplam);
//         double ile daire alan ve  bulma 
//
        double yaricap=2.0;
        double pi=3.14;
        double alan=pi*yaricap*yaricap;
        double cevre=2*pi*yaricap;
        System.out.println("Dairenin alanı: "+alan+ " Dairenin çevresi:"+cevre);
//        dikdörtgen alan bulma
////        
        int kisa_kenar=8;
        int uzun_kenar=16;
        int dikdort_alan= kisa_kenar*uzun_kenar;
        int dikdort_cevre=2*(kisa_kenar+uzun_kenar);
        System.out.println("Dikdörtgenin alanı:"+dikdort_alan+" Dikdörtgenin çevresi:" +dikdort_cevre);
//        üçgen alanı bulma
        int kenar1=5,kenar2=7;
        int taban =12;
        int yukseklik=15;
        int ucgen_alan= (taban*yukseklik)/2;
        int ucgen_cevre=kenar1+kenar2+taban;
        System.out.println("Üçgenin Alanı: "+ucgen_alan+" Üçgenin Çevresi: "+ucgen_cevre);             
//        karenin alanı
        int kenar=4;
        int kare_alan=kenar*kenar;
        int kare_cevre=4*kenar;
        System.out.println("Karenin alanı: " +kare_alan+" Karenin çevresi: " +kare_cevre);
//               
//        üç sayının ortalamasını alma
        
        int a=5;
        int b=15;
        int c=4;
        int ortalama= (a+b+c)/3;
        System.out.println("Üç sayının ortalaması: " +ortalama);
//a değişkeninin değerini b nin değeri yapın
int a1 =8;
int b1 =10;
a1=b1;
        System.out.println("a sayısının yeni değeri: " +a1);
        
//    a sayısının değerini 3. değişkenle b sayısının değeri yapın

    int a2=5;
    int b2 =2;
    int c2=0;
    c2=a2;
    a2=b2;
    b2=c2;
        System.out.println("a sayısının yeni değeri: "+a2+" b sayısının yeni değeri: " +b2);
                
      //  a sayısının değerini yeni değişken kullanmadan b sayısının değeri yapın 
        int a3 =5;
        int b3=6;
        a3=b3;
        System.out.println("a sayisi: "+a3);
    }

}
