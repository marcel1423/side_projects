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
public class Valec extends Jehlan {

    Valec() {
    }

    Valec(double polomer, double vyska) {
        super(polomer);
        this.vyska = vyska;
    }

    Valec(double strana) {
        super(strana);
    }

    double Vypocet_objemu_valec() {
        return Math.PI * Math.pow(strana, 2) * vyska;
    }

    double Vypocet_povrchu_valec() {
        return 2 * Math.PI * strana * (strana + vyska);
    }

    @Override
    void Vypis() throws IOException {
        System.out.print("Zadej delku polomeru valce: ");
        this.strana = Nacti_cislo.Nacitani();
        System.out.print("Zadej delku vysky: ");
        this.vyska = Nacti_cislo.Nacitani();
        boolean vypni = false;
        do {
            System.out.println("1 - Objem valce\n2 - Povrch valce");
            switch ((int) Nacti_cislo.Nacitani()) {
                case 1:
                    System.out.println("Objem valce je: " + Vypocet_objemu_valec());
                    break;
                case 2:
                    System.out.println("Povrch valce je: " + Vypocet_povrchu_valec());
                    break;
                default:
                    System.out.println("Zadej 1 - 2!");
                    vypni = true;
            }
        } while (vypni);
    }
}
