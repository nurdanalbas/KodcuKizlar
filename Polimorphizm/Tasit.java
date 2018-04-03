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
public class Tasit {
    public void Tur() {
        System.out.println("Tasitlarin birçok turu vardir");
    }

    public void Cins() {
        System.out.println();
    }

    public void yazdir(Tasit t1) {

        t1.Tur();
        t1.Cins();
        
    }
}
