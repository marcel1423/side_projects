/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometrie_2;

/**
 *
 * @author mnovak
 */
public class Geometrie_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ctyruhelnik ctyruhelnik = new Ctyruhelnik(10, 2);
        Trojuhelnik trojuhelnik = new Trojuhelnik(10, 2, 5);
        Kruznice kruznice = new Kruznice(5);
        Mnohouhelnik mnohouhelnik = new Mnohouhelnik(3, 5, 6, 9, 7, 8, 10, 5);
        Vypocty ob;
        ob = ctyruhelnik;
        System.out.println("Ctyruhelnik: " + ob.Vypocet_obsahu());
        System.out.println("Trojuhelnik: " + trojuhelnik.Vypocet_obvodu());
        System.out.println("Kruznice: " + kruznice.Vypocet_obvodu());
        System.out.println("Mnohouhelnik: " + mnohouhelnik.Vypocet_obvodu());
    }
    
}
