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
    protected double podstava[];
    protected int delka;
    
    Jehlan () throws IOException {
        Vypis();
    }
    
    Jehlan (double strana, double vyska) {
        super(strana);
        this.vyska = vyska;
    }
    
    Jehlan (double podstava[], double vyska) {
        super(podstava);     
        this.vyska = vyska;
    }
    
    Jehlan (double podstava[], double plast[]) {
        super(plast);
        this.podstava = podstava; 
    }
    
    double Zjisteni_podstavy() {
        switch (podstava.length) {
            case 1:
                return Vypocet_obsahu_ctverec();
            case 2:
                return Vypocet_obsahu_obdelnik();
            case 3:
                return Vypocet_obsahu_trojuhelnik();
            default:
                Mnohouhelnik mnohouhelnik = new Mnohouhelnik(podstava);
                return mnohouhelnik.Vypocet_obsahu_mnohouhelnik();
    }
    }
    
    double Vypocet_objemu() {
        return (1.0/3.0) * Zjisteni_podstavy() * vyska;
    }
    
    double Vypocet_povrchu() {
        return Zjisteni_podstavy() * Vypocet_obsahu_trojuhelnik();
    }
    
   /* @Override
    void Vypis() throws IOException {
        boolean vypni = false;
        do {
            System.out.println("1 - Objem jehlanu\n2 - Povrch jehlanu");
              switch ((int)Nacti_cislo.Nacitani()) {
                  case 1: System.out.println("Objem jehlanu je: " + Vypocet_objemu());
                  break;
                  case 2: System.out.println("Povrch  jehlanu je: " + Vypocet_povrchu());
                  break;
                  default: System.out.println("Zadej 1 - 2!"); vypni = true;  
              }
        } while ( vypni );      
    }*/
    
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
