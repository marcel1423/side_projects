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
public class Obdelnik extends Ctverec {
    double strany[];
    double strana1;
    
    Obdelnik (double strany[]) {
        this.strany = strany;
        for (int i = 0; i < strany.length; i ++ ) { 
                        strana = strany[i];
                        strana1 = strany[i];
                    }
    }
    Obdelnik() { }
    
    @Override
    double Vypocet_obvodu(){
        return 2 * (strana + strana1);
    }
    
    @Override
    double Vypocet_obsahu() {
        return strana * strana1;
    }
    
    @Override
    double Uhlopricka() {
        return Math.sqrt(Math.pow(strana, 2) + Math.pow(strana1, 2));
    }
    
    @Override
    void Vypis() throws IOException {
        boolean vypni = false;
        do {
              System.out.println("1 - Obsah obdelniku\n2 - Obvod obdelniku\n3 - Uhlopricka obdelniku");
              switch ((int)Nacti_cislo.Nacitani()) {
                  case 1: System.out.println("Obsah obdelniku je: " + Vypocet_obsahu());
                  break;
                  case 2: System.out.println("Obvod obdelniku je: " + Vypocet_obvodu());
                  break;
                  case 3: System.out.println("Uhlopricka obdelniku je: " + Uhlopricka());
                  break;
                  default: System.out.println("Zadej 1 - 3!"); vypni = true;  
              }
        } while ( vypni );      
    }
}
