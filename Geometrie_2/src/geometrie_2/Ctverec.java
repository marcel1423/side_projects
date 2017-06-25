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
    
    double Vypocet_obvodu() {
        return 4 * strana;
    }
    
    double Vypocet_obsahu() {
        return strana * strana;
    }
    
    double Uhlopricka() {
        return strana * Math.sqrt(2);
    }
    
    
     void Vypis() throws IOException {
        System.out.print("Zadej delky strany ctverce: ");
        strana = Nacti_cislo.Nacitani();
        boolean konec = false;
        do {
        System.out.println("1 - Obsah ctverce\n2 - Obvod ctverce\n3 - Uhlopricka");
        int vyber_2 = (int)Nacti_cislo.Nacitani();
        switch (vyber_2) {
            case 1: System.out.println("Obsah ctverce je: " + Vypocet_obsahu());
                    break;
            case 2: System.out.println("Obvod ctverce je: " + Vypocet_obvodu());
                    break;
            case 3: System.out.println("Uhlopricka ctverce je: " + Uhlopricka());
                    break;
            default: System.out.println("Vyber 1 - 3!!"); konec = true;
        }
        } while (konec);
    }
}
