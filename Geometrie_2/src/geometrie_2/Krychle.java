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
public class Krychle extends Jehlan{
    
    Krychle() {}

    Krychle(double strana) {
        super(strana);
    }
    
    @Override
    double Vypocet_objemu() {
        return Math.pow(strana, 3);
    }
    
    @Override
    double Vypocet_povrchu() {
        return 6 * Math.pow(strana, 2);
    }
    
    @Override
    double Telesova_uhlopricka() {
        return strana * Math.sqrt(3);
    }
    
    @Override
    double Stenova_uhlopricka() {
        return strana * Math.sqrt(2);
    }
    
    @Override
     void Vypis() throws IOException {
        boolean vypni = false;
        do {
              System.out.println("1 - Objem krychle\n2 - Povrch krychle\n3 - Telesova uhlopricka krychle\n4 - Stenova uhlopricka krychle");
              switch ((int)Nacti_cislo.Nacitani()) {
                  case 1: System.out.println("Objem krychle je: " + Vypocet_objemu());
                  break;
                  case 2: System.out.println("Povrch krychle je: " + Vypocet_povrchu());
                  break;
                  case 3: System.out.println("Telesova Uhlopricka krychle je: " + Telesova_uhlopricka());
                  break;
                  case 4: System.out.println("Stenova uhlopricka krychle je: " + Stenova_uhlopricka());
                  default: System.out.println("Zadej 1 - 3!"); vypni = true;  
              }
        } while ( vypni );      
    }
}
