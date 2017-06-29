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
public class Trojuhelnik extends Obdelnik {
    
    Trojuhelnik() {}   
    
    Trojuhelnik(double strana) {
        super(strana);
    }    
    
    Trojuhelnik(double strany[]) {
        super (strany);
    }
   
    public double Vypocet_obvodu_trojuhelnik() {
        return strany[0] + strany[1] + strany[2];
    }
   
    public double Vypocet_obsahu_trojuhelnik() {
        //System.out.println("strany[0] = " + strany[0] + "strany[1] = " + strany[1] + "strany[2] = " + strany[2]);
        return strany[0] * strany[1] * strany[2];
    }
    
    @Override
    void Vypis() throws IOException {
        boolean vypni = false;
        do {
              System.out.println("1 - Obsah trojuhelniku\n2 - Obvod trojuhelniku");
              switch ((int)Nacti_cislo.Nacitani()) {
                  case 1: System.out.println("Obsah trojuhelniku je: " + Vypocet_obsahu_trojuhelnik());
                  break;
                  case 2: System.out.println("Obvod trojuhelniku je: " + Vypocet_obvodu_trojuhelnik());
                  break;
                  default: System.out.println("Zadej 1 - 2!"); vypni = true;  
              }
        } while ( vypni );      
    }
}
