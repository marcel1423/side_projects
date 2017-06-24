/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometrie_2;

import java.io.IOException;

/**
 *
 * @author mnovak
 */
public class Ctverec {
    protected double strana;
    
    Ctverec (double strana) {
        this.strana = strana;
    }
    
    Ctverec() { }
    
    public double Vypocet_obvodu() {
        return 4 * strana;
    }
    
    public double Vypocet_obsahu() {
        return strana * strana;
    }
    
     void Vypis() throws IOException {
        System.out.print("Zadej delky strany ctverce: ");
        strana = Nacti_cislo.Nacitani();
        System.out.println("1 - Obsah ctverce\n2 - Obvod ctverce");
        int vyber_2 = (int)Nacti_cislo.Nacitani();
        switch (vyber_2) {
            case 1: System.out.println("Obsah ctverce je: " + Vypocet_obsahu());
                    break;
            case 2: System.out.println("Obvod ctverce je: " + Vypocet_obvodu());
        }
    }
}
