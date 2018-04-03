/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorphizm;

/**
 *
 * @author NurdanPC
 */
public class Test {

    public static void main(String[] args) {

        //downcast ornek
        //motorlu nesnesini ucak nesnesine cevirme islemi
        Motorlu m1 = new Ucak();
        Ucak u1 = new Ucak();

        u1 = (Ucak) m1;
        //u1.Tur();

        //downcast ornek
        //motorsuz nesnesini bisiklet yapmak
        Motorsuz m = new Bisiklet();
        Bisiklet b = new Bisiklet();

        b = (Bisiklet) m;
       // b.Cins();

        //upcast ornek
        Motorlu m2 = new Motorlu();
        Tren t1 = new Tren();

        m2 = (Motorlu) t1;
        m2.yazdir(m2);
    }

}
