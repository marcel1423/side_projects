/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometrie_2;
import java.io.IOException;
import static java.lang.Math.*;
/**
 *
 * @author mnovak
 */
public class Kvadr extends Mnohouhelnik {
    Kvadr() {}

    Kvadr (double strany[]) {
        super(strany);
    }
    Kvadr (double strana) {
        super(strana);
    }
    
    double Vypocet_objemu() {
        return strany[0] * strany[1] * strany[2];
    }
    
    double Vypocet_povrchu() {
        return 2 * ((strany[0] * strany[1]) + (strany[1] * strany[2]) + (strany[0] * strany[2]) );
    }
    
    double Telesova_uhlopricka() {
        return sqrt(pow(strany[0],2) + pow(strany[1],2) + pow (strany[2],2));
    }
    
    double Stenova_uhlopricka() {
        return sqrt(pow(strany[0], 2) + pow(strany[1], 2));
    }
    
    @Override
     void Vypis() throws IOException {
        boolean vypni = false;
        do {
              System.out.println("1 - Objem kvadru\n2 - Povrch kvadru\n3 - Telesova uhlopricka kvadru\n4 - Stenova uhlopricka kvadru");
              switch ((int)Nacti_cislo.Nacitani()) {
                  case 1: System.out.println("Objem kvadru je: " + Vypocet_objemu());
                  break;
                  case 2: System.out.println("Povrch kvadru je: " + Vypocet_povrchu());
                  break;
                  case 3: System.out.println("Telesova Uhlopricka kvadru je: " + Telesova_uhlopricka());
                  break;
                  case 4: System.out.println("Stenova uhlopricka kvadru je: " + Stenova_uhlopricka());
                  default: System.out.println("Zadej 1 - 3!"); vypni = true;  
              }
        } while ( vypni );      
    }
}

