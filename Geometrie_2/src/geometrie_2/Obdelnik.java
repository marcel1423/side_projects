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
public class Obdelnik extends Kruznice {
    double strana1;
    
    Obdelnik(double strana) {
        super(strana);
    }
    
    Obdelnik (double strany[]) {
        super(strany);
    }
    Obdelnik() { }
    
    double Vypocet_obvodu_obdelnik(){
        return 2 * (strany[0] + strany[1]);
    }
    
    double Vypocet_obsahu_obdelnik() {
        //System.out.println("Strana: " + strana + "Strana1: " + strana1);
        return strany[0] * strany[1];
    }
    
    double Uhlopricka_obdelnik() {
        return Math.sqrt(Math.pow(strany[0], 2) + Math.pow(strany[1], 2));
    }
    
    @Override
    void Vypis() throws IOException {
        boolean vypni = false;
        do {
              System.out.println("1 - Obsah obdelniku\n2 - Obvod obdelniku\n3 - Uhlopricka obdelniku");
              switch ((int)Nacti_cislo.Nacitani()) {
                  case 1: System.out.println("Obsah obdelniku je: " + Vypocet_obsahu_obdelnik());
                  break;
                  case 2: System.out.println("Obvod obdelniku je: " + Vypocet_obvodu_obdelnik());
                  break;
                  case 3: System.out.println("Uhlopricka obdelniku je: " + Uhlopricka_obdelnik());
                  break;
                  default: System.out.println("Zadej 1 - 3!"); vypni = true;  
              }
        } while ( vypni );
    }
}
