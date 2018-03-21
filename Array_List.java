/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import static java.lang.Math.E;
import java.util.ArrayList;
/**
 *
 * @author NurdanPC
 */
public class Array_List {

    public static void main(String[] args) {
    
        ArrayList a=new ArrayList();    
        a.add("Hemingway");
        a.add("Khaled Houssaini");
        a.add("Gabriel Marquez");
        a.add(525);
        a.add('x');
        a.add(-12543);
        
        System.out.println("Arraylistte bulunan elemanlar: "+a);
        
        System.out.println("1.indisteki eleman : " +a.get(1));
        System.out.println("Arraylistin boyutu: " +a.size());
        System.out.println("525 elemanı " +a.indexOf(525)+". indistedir. " );
        
        a.clear();
        System.out.println("Arraylistin son hali: "+a);
        
        
        ArrayList<String> b=new ArrayList<String>();
        
        b.add("kanuni");
        b.add("sultan");
        b.add("osmanlı imparatorluğu");
        b.remove(1);
        System.out.println("b arraylistinin elemanları: "+b);
        b.clear();
        System.out.println(b);

    }
    
}
