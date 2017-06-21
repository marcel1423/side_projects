/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometrie;

/**
 *
 * @author mnovak
 */
public class Geometrie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Obvod obvod = new Obvod(3);
        
        System.out.println("Obvod: " + obvod.Vypocet_obvodu_ctverec());
        System.out.println("Obsah: " + obvod.Vypocet_obsahu_ctverec());

    }
    
}
