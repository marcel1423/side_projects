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
public class Kvadr extends Trojuhelnik {
    Kvadr() {}
    
    Kvadr (double strana) {
        super(strana);
    }
    
    Kvadr (double strana, double strana1, double strana2) {
        super (strana, strana1, strana2);
    }
    
    double Vypocet_objemu() {
        return strana * strana_1 * strana_2;
    }
    
    double Vypocet_povrchu() {
        return 2 * ((strana * strana_1) + (strana_1 * strana_2) + (strana * strana_2) );
    }
    
    double Telesova_uhlopricka() {
        return sqrt(pow(strana,2) + pow(strana_1,2) + pow (strana_2,2));
    }
    
    double Stenova_uhlopricka() {
        return sqrt(pow(strana, 2) + pow(strana_1, 2));
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

