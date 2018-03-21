/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blog_1;

import java.util.Scanner;

public class KontrolYapilari_IF_ELSE {

    public static void main(String[] args) {
        //  soru 1
        Scanner sc = new Scanner(System.in);
        System.out.println("Soru 1 - Öğrencinin ortalamasına göre geçtiğini veya kaldığını gösteren bir uygulama geliştiriniz.");
        int not1;
        System.out.print("Vize Notunuzu Giriniz : ");
        not1 = sc.nextInt();
        System.out.print("Final Notunuzu Giriniz : ");
        int not2 = sc.nextInt();

        int ortalama = (not1 + not2) / 2;
        System.out.println("Not Ortalamanız : " + ortalama);
        if (ortalama > 50) {
            System.out.println("Dersten Geçtiniz.");
        } else {
            System.out.println("Dersten Kaldınız.");
        }

//        //soru 2
        System.out.println("Soru 2 - Öğrencinin ortalamasına göre ders başarı durumunu gösteren bir uygulama geliştiriniz.");
        int vize_not;
        System.out.print("Vize Notunuzu Giriniz : ");
        vize_not = sc.nextInt();
        System.out.print("Final Notunuzu Giriniz : ");
        int final_not = sc.nextInt();

        int vizeOrt = (vize_not * 40) / 100;
        int finalOrt = (final_not * 60) / 100;
        int dersOrt = vizeOrt + finalOrt;
        System.out.println("Not Ortalamanız : " + dersOrt);
        if (dersOrt > 50) {
            System.out.println("Ders durumu : Başarılı.");
        } else {
            System.out.println("Ders durumu : Başarısız.");
        }

//Soru 3
        Scanner grs = new Scanner(System.in);
        String kullanici_adi;
        System.out.print("Kullanıcı adınızı giriniz:");
        kullanici_adi = grs.next();
        System.out.print("Şifrenizi Giriniz:");
        String sifre = grs.next();
        String k_adi = "nurdan", k_sifre = "123";
        if (kullanici_adi.equals(k_adi) && sifre.equals(sifre)) {
            System.out.println("giris basarili");
        } else {
            System.out.println("basarisiz");
        }

        //soru:4
        Scanner fyt = new Scanner(System.in);
        System.out.println("Aldığınız ürünün fiyatını giriniz:");
        int fiyat = fyt.nextInt();
        int kargo = 5;
        int odenecek = fiyat + kargo;
        if (fiyat > 100) {
            odenecek = odenecek - kargo;
            System.out.println("Toplam tutar:" + odenecek);
        } else {
            System.out.println("Toplam tutar:" + odenecek);
        }

//soru 5:
        System.out.println("Soru 5 - Klavyeden girilen sayının negatif, pozitif veya sıfır olduğunu gösteren bir ugygulama yazınız.");
        System.out.println("Bir sayı giriniz : ");
        int sayi = sc.nextInt();
        if (sayi == 0) {
            System.out.println("Sayı 0'dır.");
        } else if (sayi > 0) {
            System.out.println("Sayı pozitiftir.");
        } else {
            System.out.println("Sayı negatiftir.");
        }

//soru 6
        Scanner sayi1 = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz: ");
        int s1 = sayi1.nextInt();

        System.out.println("İkinci sayıyı giriniz: ");
        int s2 = sayi1.nextInt();

        int toplam = s1 + s2;
        int fark = s1 - s2;
        int carpim = s1 * s2;
        int bolum = s1 / s2;

        System.out.println("Seçiminizi yapınız: ");
        String secim = sayi1.next();
        String deger = "t", deger2 = "f", deger3 = "c", deger4 = "b";
        if (secim.equals(deger)) {
            System.out.println(toplam);
        } else if (secim.equals(deger2)) {
            System.out.println(fark);
        } else if (secim.equals(deger3)) {
            System.out.println(carpim);
        } else {
            System.out.println(bolum);
        }

//soru7:
        System.out.println("Soru 7 - Ürün fiyatı üzerinden indirim olduğu takdirde ödenecek toplam tutarı hesaplayan bir uygulama yazınız.");
        System.out.print("Aldığınız 1.ürünün fiyatını giriniz : ");
        int urun1 = sc.nextInt();
        System.out.print("Aldığınız 2.ürünün fiyatını giriniz : ");
        int urun2 = sc.nextInt();
        int toplam1 = urun1 + urun2;
        if (toplam1 < 200) {
            System.out.println("Ödenecek toplam tutar : " + toplam1);
        } else {
            urun2 = urun2 - ((urun2 * 25) / 100);
            System.out.println("200 TL'nin üzerinde alışveriş yaptığınız için,2.ürün size " + urun2 + " TL olarak indirimli gelmiştir.");
            toplam = urun1 + urun2;

            System.out.println("Ödenecek toplam tutar : " + toplam1);
        }

//soru8:
        Scanner temp = new Scanner(System.in);
        System.out.println("Bulunduğunuz ortamın sıcaklığını giriniz: ");
        int sicaklik = temp.nextInt();

        if (sicaklik < 20 || sicaklik > 26) {
            System.out.println("Yaşanılamaz ortam");
        } else {
            System.out.println("Yaşanılabilir ortam");
        }

//soru9:
        Scanner p = new Scanner(System.in);
        System.out.println("Parça miktarını girin: ");
        int parca = p.nextInt();

        if (parca > 0 && parca < 10) {
            System.out.println("Alacağınız pirim parça başı: 5 TL");
        } else if (parca > 10 && parca < 25) {
            System.out.println("Alacağınız pirim parça başı: 11 TL");
        } else if (parca > 25 && parca < 40) {
            System.out.println("Alacağınız pirim parça başı: 17 TL");
        } else if (parca > 40) {
            System.out.println("Alacağınız pirim parça başı: 30 TL");
        }
//soru:10
        int d1 = 852, d2 = 145, d3 = -96;
        if (d1 < d2 && d1 < d3) {
            System.out.println("minimum eleman: " + d1);
        } else if (d2 < d1 && d2 < d3) {
            System.out.println("minimum eleman: " + d2);
        } else {
            System.out.println("minimum eleman: " + d3);
        }
//        

        Scanner dgr = new Scanner(System.in);
        System.out.println("Değer giriniz: ");
        int deger_1 = dgr.nextInt();

        System.out.println("Değer giriniz: ");
        int deger_2 = dgr.nextInt();

        System.out.println("Değer giriniz: ");
        int deger_3 = dgr.nextInt();

        if (deger_1 < deger_2 && deger_1 < deger_3) {
            System.out.println("En küçük eleman : " + deger_1);
        } else if (deger_2 < deger_3 && deger_2 < deger_1) {
            System.out.println("En küçük eleman :" + deger_2);
        } else {
            System.out.println("En küçük eleman :" + deger_3);
        }
//    //Soru11:

        int f0 = 0;
        int f1 = 1;
        int f2 = f0 + f1;
        int f3 = f1 + f2;
        int f4 = f2 + f3;
        int f5 = f3 + f4;
        int f6 = f4 + f5;
        System.out.println(f0 + "-" + f1 + "-" + f2 + "-" + f3 + "-" + f4 + "-" + f5 + "-" + f6);

        //forlu çözüm
        System.out.println("Soru 11 - İlk iki elemanı 0 ve 1 olan Fibonacci serisinin sonraki 5.elemanını ekrana yazdırın. \n");
        int fib1 = 0;
        int fib2 = 1;
        int fib3 = 0;
        int count = 10;
        for (int i = 2; i < 5; i++) {
            fib3 = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib3;
        }
        System.out.println("Fibonacci Dizisi 5.elemanı =  " + fib3 + "\n");

//        soru 12:
        System.out.println("Soru 12 - Bir integer değişkenin son rakamını ekrana yazdırın.");

        int sonRakam = 758;
        int kalan;
        kalan = sonRakam % 10;
        System.out.println("Son rakam : " + kalan + "\n");
//diğer çözüm
        int sa1 = 12;
        int bolm = sa1 / 10;
        System.out.println(bolm);
        int son_basamak = sa1 - (bolm * 10);
        System.out.println(son_basamak);

////soru13:
        int s_2 = 18;
        int onlar_basamak = s_2 / 10;
        System.out.println(onlar_basamak);
        int birler_basamak = s_2 - (onlar_basamak * 10);
        System.out.println(birler_basamak);
        System.out.println(birler_basamak + "" + onlar_basamak);
//        //soru14
        int sayiCiftMi = 10;
        if (sayiCiftMi % 2 == 0) {
            System.out.println("Bu sayı çifttir");
        } else {
            System.out.println("Bu sayı tektir");
        }
//soru15:
        byte b = 100;
        byte b1 = 125;
        System.out.println(b ^ b1);
        System.out.println(b & b1);
        System.out.println(b | b1);
        System.out.println(b << b1);
        System.out.println(b >> b1);
//soru:16
        System.out.println("Soru 16 - İki basamaklı bir integer değişkenin rakamlarını terse çevirin.");
        int d_sayi = 75;
        System.out.println("Orjinal Sayı : " + d_sayi + "\n");
        int b_basamak = d_sayi % 10;
        int o_basamak = (d_sayi % 100) / 10;
        System.out.println("Birler Basamağı = " + b_basamak);
        System.out.println("Onlar Basamağı = " + o_basamak);
        System.out.println("");
        int t_sayi = (b_basamak * 10) + (o_basamak * 1);
        System.out.println("Tersine Çevrilmiş Hali : " + t_sayi + "\n");

//soru17:
        byte d_1 = 50;
        byte d_2 = 50;
        byte d_3 = (byte) (d_1 + d_2);
        System.out.println(d_3);

//soru18:
        float blm = sayi / 100f;
        System.out.println(blm);

    }

}
