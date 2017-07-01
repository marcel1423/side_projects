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
public class Mnohouhelnik extends Trojuhelnik {
    Mnohouhelnik() {
      //  delky = x; /* nemusim nastavovat rozsah delky, protoze predavam odkaz na pole x */
    }
    
    Mnohouhelnik (double strany[]) {
        super(strany);
    }
    Mnohouhelnik (double strana) {
        super (strana);
    }
    public double Vypocet_obvodu_mnohouhelnik() {
        double obvod = 0;
        for (int i = 0; i < strany.length; i ++ ) obvod += strany[i];
        return obvod;
    }
    
    public double Vypocet_obsahu_mnohouhelnik() {
        double obsah = 1;
        for (int i = 0; i < strany.length; i ++ ) obsah *= strany[i];
        return obsah;
    }
    
    void Vypis() throws IOException {
        boolean vypni = false;
        do {
              System.out.println("1 - Obsah mnohouhelniku\n2 - Obvod mnohouhelniku");
              switch ((int)Nacti_cislo.Nacitani()) {
                  case 1: System.out.println("Obsah mnohouhelniku je: " + Vypocet_obsahu_mnohouhelnik());
                  break;
                  case 2: System.out.println("Obvod mnohouhelniku je: " + Vypocet_obvodu_mnohouhelnik());
                  break;
                  default: System.out.println("Zadej 1 - 2!"); vypni = true;  
              }
        } while ( vypni );      
    }
}
