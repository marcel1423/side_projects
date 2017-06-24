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
public class Mnohouhelnik {
   // private double strany[];
    Mnohouhelnik() {
      //  delky = x; /* nemusim nastavovat rozsah delky, protoze predavam odkaz na pole x */
    }
    public double Vypocet_obvodu(double strany[]) {
        double obvod = 0;
        for (int i = 0; i < strany.length; i ++ ) obvod += strany[i];
        return obvod;
    }
    
    public double Vypocet_obsahu(double strany[]) {
        double obsah = 1;
        for (int i = 0; i < strany.length; i ++ ) obsah *= strany[i];
        return obsah;
    }
    
    void Vypis(int max) throws IOException {
        double strany[] = new double[max];
        Nacti_cislo nacitani = new Nacti_cislo();
        System.out.print("Zadej delky strany mnohouhelniku: ");
        strany = nacitani.Nacitani(max);
        System.out.println("1 - Obsah mnohouhelniku\n2 - Obvod mnohouhelniku");
        int vyber_2 = (int)nacitani.Nacitani();
        switch (vyber_2) {
            case 1: System.out.println("Obsah mnohouhelniku je: " + Vypocet_obsahu(strany));
                    break;
            case 2: System.out.println("Obvod mnohouhelniku je: " + Vypocet_obvodu(strany));
        }
    }
}
