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
public class Kuzel extends Valec {

    Kuzel() {
    }

    Kuzel(double strana, double vyska) {
        super(strana, vyska);
    }

    double Vypocet_objemu_kuzel() {
        return (1.0 / 3.0) * Vypocet_obsahu() * vyska;
    }

    double Vypocet_povrchu_kuzel() {
        return Vypocet_obsahu() + (Math.PI * strana * Math.sqrt(Math.pow(strana, 2) + Math.pow(vyska, 2)));
    }

    @Override
    void Vypis() throws IOException{
        System.out.print("Zadej vysku: ");
        this.vyska = Nacti_cislo.Nacitani();
        System.out.print("Zadej delku polomeru podstavy: ");
        this.strana = Nacti_cislo.Nacitani();
        boolean vypni = false;

        do {
            System.out.println("1 - Objem kuzelu\n2 - Povrch kuzelu");

        switch ((int) Nacti_cislo.Nacitani()) {
            case 1: System.out.println("Objem kuzelu je: " + Vypocet_objemu_kuzel()); break;
            case 2: System.out.println("Povrch kuzelu je: " + Vypocet_povrchu_kuzel()); break;
            default: System.out.println("Zadej 1 - 2!"); vypni = true;
        }
    } while (vypni);
    }
}
