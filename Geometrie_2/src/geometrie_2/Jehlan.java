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
public class Jehlan extends Kvadr {
    protected double vyska;
    protected int delka;
    
    Jehlan() {}

    Jehlan (double strana, double vyska) {
        super(strana);
        this.vyska = vyska;
    }
    Jehlan (double strana) {
        super (strana);
    }
    
    Jehlan (double strany[]) {
        super (strany);
    }
    Jehlan (double podstava[], double vyska) {
        super(podstava);     
        this.vyska = vyska;
        delka = podstava.length;
    }
    
    Jehlan (double podstava[], double plast[]) {
        super(plast);
        delka = podstava.length;
    }
    
    double Zjisteni_podstavy() {
        switch (delka) {
            case 1:
                return Vypocet_obsahu_ctverec();
            case 0:
                System.out.println("Nezadal jsi strany podstavy."); return 0;
            case 2:
                return Vypocet_obsahu_obdelnik();
            case 3:
                return Vypocet_obsahu_trojuhelnik();
            default:
                return Vypocet_obsahu_mnohouhelnik();
    }
    }
    
    double Vypocet_objemu_jehlan() {
        return (1.0/3.0) * Zjisteni_podstavy() * vyska;
    }
    
    double Vypocet_povrchu_jehlan() {
        return Zjisteni_podstavy() * Vypocet_obsahu_trojuhelnik();
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
