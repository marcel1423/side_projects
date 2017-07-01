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
public class Koule extends Valec {
    

    Koule() {}

    Koule(double polomer) {
        super(polomer);
    }
    
    double Vypocet_objemu_koule() {
        return (4.0/3.0) * Math.PI * Math.pow(strana, 3);
    }
    
    double Vypocet_povrchu_koule() {
        return 4 * Math.PI * Math.pow(strana, 2);
    }
    
    @Override
    void Vypis() throws IOException {
        boolean vypni = false;
        do {
              System.out.println("1 - Objem koule\n2 - Povrch koule");
              switch ((int)Nacti_cislo.Nacitani()) {
                  case 1: System.out.println("Objem koule je: " + Vypocet_objemu_koule());
                  break;
                  case 2: System.out.println("Povrch koule je: " + Vypocet_povrchu_koule());
                  break;
                  default: System.out.println("Zadej 1 - 2!"); vypni = true;  
              }
        } while ( vypni );      
    }
}
