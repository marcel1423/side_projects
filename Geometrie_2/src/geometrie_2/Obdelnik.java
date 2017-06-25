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
public class Obdelnik {
    double strany[];
    double strana, strana1;
    
    Obdelnik (double strany[]) {
        this.strany = strany;
        for (int i = 0; i < strany.length; i ++ ) { 
                        strana = strany[i];
                        strana1 = strany[i];
                    }
    }
    Obdelnik() { }
    
    double Vypocet_obvodu(){
        return 2 * (strana + strana1);
    }
    double Vypocet_obsahu() {
        return strana * strana1;
    }
    
    double Uhlopricka() {
        return Math.sqrt(Math.pow(strana, 2) + Math.pow(strana1, 2));
    }
    
     /*void Vypis(int max) throws IOException {
        strany = new double[max];
        Nacti_cislo nacitani = new Nacti_cislo();
        System.out.print("Zadej delky strany obdelniku: ");
        strany = nacitani.Nacitani(max);
        System.out.println("1 - Obsah obdelniku\n2 - Obvod obdelniku");
        int vyber_2 = (int)nacitani.Nacitani();
        switch (vyber_2) {
            case 1: System.out.println("Obsah obdelniku je: " + Vypocet_obsahu());
                    break;
            case 2: System.out.println("Obvod obdelniku je: " + Vypocet_obvodu());
        }
    }*/
}
