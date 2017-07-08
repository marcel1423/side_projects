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
public class Jehlan extends Mnohouhelnik {

    protected double plast, vyska;

    Jehlan() {
    }

    Jehlan(double strana, double vyska, int max) {
        super(strana, max);
        this.vyska = vyska;
    }

    Jehlan(double strana) {
        super(strana);
    }

    /*double Zjisteni_podstavy() {
        switch (delka) {
            case 1:
                return Vypocet_obsahu_ctverec_1();
            case 2:
                return Vypocet_obsahu_obdelnik();
            case 3:
                return Vypocet_obsahu_trojuhelnik();
            default:
                return Vypocet_obsahu_mnohouhelnik();
    }
    }*/
    double Vypocet_objemu_jehlan() {
        return (1.0 / 3.0) * Vypocet_obsahu_mnohouhelnik() * vyska;
    }

    double Vypocet_povrchu_jehlan() {
        /*vyska se tady pouzivat jako delka strany plaste (trojuhelniku)*/
        return Vypocet_obsahu_mnohouhelnik() + (Vypocet_obsahu_rovnostranny_trojuhelnik(plast) * pocet_stran);
    }

    void Vypis() throws IOException {
        System.out.print("Zadej pocet stran podstavy: ");
        this.pocet_stran = (int) Nacti_cislo.Nacitani();
        System.out.print("Zadej delku strany podstavy: ");
        this.strana = Nacti_cislo.Nacitani();
        boolean vypni = false;
        do {
            System.out.println("1 - Objem jehlanu\n2 - Povrch jehlanu");
            switch ((int) Nacti_cislo.Nacitani()) {
                case 1:
                    System.out.print("Zadej delku vysky: ");
                    this.vyska = Nacti_cislo.Nacitani();
                    System.out.println("Objem  jehlanu je: " + Vypocet_objemu_jehlan());
                    break;
                case 2:
                    System.out.print("Zadej delku strany plaste: ");
                    this.plast = Nacti_cislo.Nacitani();
                    System.out.println("Povrch  jehlanu je: " + Vypocet_povrchu_jehlan());
                    break;
                default:
                    System.out.println("Zadej 1 - 2!");
                    vypni = true;
            }
        } while (vypni);
    }

    /*static int Nacitani(String tvar) throws IOException {
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
    }*/
}
