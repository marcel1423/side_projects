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
public final class Jehlan extends Trojuhelnik {
    protected double vyska;
    Jehlan jehlan;
    
    Jehlan () throws IOException {
        Vypis();
    }
    
    Jehlan (double strana, double vyska) {
        super(strana);
        this.vyska = vyska;
    }
    
    Jehlan (double strany[], double vyska) {
        super(strany);     
        this.vyska = vyska;
    }
    
    double Vypocet_objemu(String tvar) {
        if (tvar.equalsIgnoreCase("ctverec"))
            return (1.0/3.0) * Vypocet_obsahu_ctverec()* vyska;
        else if (tvar.equalsIgnoreCase("obdelnik"))
            return (1.0/3.0) * Vypocet_obsahu_obdelnik() * vyska;
        else if (tvar.equalsIgnoreCase("trojuhelnik"))
            return (1.0/3.0) * Vypocet_obsahu_trojuhelnik()* vyska;
        else {
            Mnohouhelnik mnohouhelnik = new Mnohouhelnik(strany);
            return (1.0/3.0) * mnohouhelnik.Vypocet_obsahu_mnohouhelnik() * vyska;
        }
    }
    double Vypocet_objemu_jehlanu_obdelnik() {
        return (1.0/3.0) * Vypocet_obsahu_obdelnik() * vyska;
    }
    
    double Vypocet_objemu_jehlanu_ctverec() {
        return (1.0/3.0) * Vypocet_obsahu_ctverec()* vyska;
    }
    double Vypocet_objemu_jehlanu_trojuhelnik() {
        return (1.0/3.0) * Vypocet_obsahu_trojuhelnik()* vyska;
    }
    
    @Override
    void Vypis() throws IOException {
        boolean vypni = false;
        do {
            System.out.print("Zadej typ podstavy: ");
            String ret = Nacti_cislo.Nacitani_znaku();
            System.out.print("Zadej vysku: " );
            vyska = Nacti_cislo.Nacitani();
              
              System.out.print("\nZadej delky stran podstavy: ");
                            if (ret.equalsIgnoreCase("ctverec") ) {
                                jehlan = new Jehlan (Nacti_cislo.Nacitani(), vyska);
                            } else if (ret.equalsIgnoreCase("obdelnik")) {
                                jehlan = new Jehlan (Nacti_cislo.Nacitani(2), vyska);
                            } else {
                                jehlan = new Jehlan (Nacti_cislo.Nacitani(3), vyska);
                            }
                            System.out.println("1 - Objem jehlanu\n2 - Obvod trojuhelniku");
              switch ((int)Nacti_cislo.Nacitani()) {
                  case 1: System.out.println("Objem jehlanu je: " + jehlan.Vypocet_objemu(ret));
                  break;
                  case 2: System.out.println("Obvod trojuhelniku je: " + Vypocet_obvodu_ctverec());
                  break;
                  default: System.out.println("Zadej 1 - 2!"); vypni = true;  
              }
        } while ( vypni );      
    }
}
