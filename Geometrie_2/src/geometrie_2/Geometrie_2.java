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
        Ctyruhelnik ctyruhelnik = new Ctyruhelnik(10);
        Trojuhelnik trojuhelnik = new Trojuhelnik(10, 2, 5);
        Kruznice kruznice = new Kruznice(5);
        
        System.out.println("Ctyruhelnik: " + trojuhelnik.Vypocet_obsahu_dvoustranny());
        System.out.println("Trojuhelnik: " + trojuhelnik.Vypocet_obvodu_trojuhelnik());
        System.out.println("Kruznice: " + kruznice.Vypocet_obsahu_kruznice());
    }
    
}
