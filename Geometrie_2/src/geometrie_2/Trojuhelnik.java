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
public class Trojuhelnik extends Obdelnik {

    protected double strana_2;

    Trojuhelnik() {
    }

    Trojuhelnik(double strana) {
        super(strana);
    }

    Trojuhelnik(double strana, double strana1, double strana2) {
        super(strana, strana1);
        strana_2 = strana2;
    }

    public double Vypocet_obvodu_trojuhelnik() {
        return strana + strana_1 + strana_2;
    }

    public double Vypocet_obsahu_trojuhelnik() {
        double s;
        s = (strana + strana_1 + strana_2) / 2;
        return Math.sqrt(s * (s - strana) * (s - strana_1) * (s - strana_2));
    }

    public double Vypocet_obsahu_rovnostranny_trojuhelnik(double plast) {
        return (Math.sqrt(3) / 4) * Math.pow(plast, 2);
    }

    @Override
    void Vypis() throws IOException {
        System.out.print("Zadej delku strany a: ");
        this.strana = Nacti_cislo.Nacitani();
        System.out.print("Zadej delku strany b: ");
        this.strana_1 = Nacti_cislo.Nacitani();
        System.out.print("Zadej delku strany a: ");
        this.strana_2 = Nacti_cislo.Nacitani();
        boolean vypni = false;
        do {
            System.out.println("1 - Obsah trojuhelniku\n2 - Obvod trojuhelniku");
            switch ((int) Nacti_cislo.Nacitani()) {
                case 1:
                    System.out.println("Obsah trojuhelniku je: " + Vypocet_obsahu_trojuhelnik());
                    break;
                case 2:
                    System.out.println("Obvod trojuhelniku je: " + Vypocet_obvodu_trojuhelnik());
                    break;
                default:
                    System.out.println("Zadej 1 - 2!");
                    vypni = true;
            }
        } while (vypni);
    }
}
