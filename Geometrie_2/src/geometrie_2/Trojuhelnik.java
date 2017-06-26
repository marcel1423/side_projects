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
    private double strana2;
    
    Trojuhelnik() {}   
    
    Trojuhelnik(double strany[]) {
        this.strany = strany;
        for (int i = 0; i < strany.length; i ++ ) { 
                        strana = strany[i];
                        strana1 = strany[i];
                        strana2 = strany[i];
                    }
    }
   
    @Override
    public double Vypocet_obvodu() {
        return strana + strana1 + strana2;
    }
   
    @Override
    public double Vypocet_obsahu() {
        return strana * strana1 * strana2;
    }
    
    @Override
    void Vypis() throws IOException {
        boolean vypni = false;
        do {
              System.out.println("1 - Obsah trojuhelniku\n2 - Obvod trojuhelniku");
              switch ((int)Nacti_cislo.Nacitani()) {
                  case 1: System.out.println("Obsah trojuhelniku je: " + Vypocet_obsahu());
                  break;
                  case 2: System.out.println("Obvod trojuhelniku je: " + Vypocet_obvodu());
                  break;
                  default: System.out.println("Zadej 1 - 2!"); vypni = true;  
              }
        } while ( vypni );      
    }
}
