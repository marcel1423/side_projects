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
public class Jehlan extends Trojuhelnik {
    protected double vyska;
    
    Jehlan (double strana, double vyska) {
        super(strana);
        this.vyska = vyska;
    }
    
    Jehlan (double strany[], double vyska) {
        super(strany);     
        this.vyska = vyska;
    }
    
    double Vypocet_objemu_jehlanu() {
        return (1.0/3.0) * Vypocet_obsahu_obdelnik() * vyska;
    }
    
    @Override
    void Vypis() throws IOException {
        boolean vypni = false;
        do {
              System.out.println("1 - Objem jehlanu\n2 - Obvod trojuhelniku");
              switch ((int)Nacti_cislo.Nacitani()) {
                  case 1: System.out.println("Objem jehlanu je: " + Vypocet_objemu_jehlanu());
                  break;
                  case 2: System.out.println("Obvod trojuhelniku je: " + Vypocet_obvodu());
                  break;
                  default: System.out.println("Zadej 1 - 2!"); vypni = true;  
              }
        } while ( vypni );      
    }
}
