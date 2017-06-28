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
    protected int delka;
    
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
        delka = strany.length;
         System.out.println("Delka: " + delka);
    }
    
    double Vypocet_objemu() {
        System.out.println("Delka: " + delka);
        switch (delka) {
            case 1:
                return (1.0/3.0) * Vypocet_obsahu_ctverec()* vyska;
            case 2:
                return (1.0/3.0) * Vypocet_obsahu_obdelnik() * vyska;
            case 3:
                return (1.0/3.0) * Vypocet_obsahu_trojuhelnik()* vyska;
            default:
                Mnohouhelnik mnohouhelnik = new Mnohouhelnik(strany);
                return (1.0/3.0) * mnohouhelnik.Vypocet_obsahu_mnohouhelnik() * vyska;
        }
    }
    
    @Override
    void Vypis() throws IOException {
        boolean vypni = false;
        do {
            System.out.println("1 - Objem jehlanu\n2 - Obvod trojuhelniku");
              switch ((int)Nacti_cislo.Nacitani()) {
                  case 1: System.out.println("Objem jehlanu je: " + Vypocet_objemu());
                  break;
                  case 2: System.out.println("Obvod trojuhelniku je: " + Vypocet_obvodu_ctverec());
                  break;
                  default: System.out.println("Zadej 1 - 2!"); vypni = true;  
              }
        } while ( vypni );      
    }
    
    static int Nacitani(String tvar) throws IOException {
        boolean konec = true;
        int pocet = 0;
        do {
        if (tvar.equalsIgnoreCase("ctverec")) {
            pocet = 1;
        } else if (tvar.equalsIgnoreCase("obdelnik")) {
            pocet = 2;
        } else if (tvar.equalsIgnoreCase("trojuhelnik")) {
            pocet = 3;
        } else if (tvar.equalsIgnoreCase("mnohouhelnik")) {
            pocet = (int)Nacti_cislo.Nacitani();
        } else {
            System.out.println("Nezadal jsi zadny z geometrickych tvaru.");
            konec = false;
        }
        } while (!konec);
            return pocet;
    }
}
