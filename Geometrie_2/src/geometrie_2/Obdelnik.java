/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometrie_2;

import java.io.IOException;
import java.util.*;

/**
 *
 * @author mnovak
 */
public class Obdelnik extends Kruznice {
    protected double strana_1;
    
    Obdelnik( double strana) {
        super (strana);
    }
    Obdelnik(double strana, double strana1) {
        super(strana);
        this.strana_1 = strana1;
    }
    
    Obdelnik() { }
    
    double Vypocet_obvodu_obdelnik(){
        return 2 * (strana + strana_1);
    }
    
    double Vypocet_obsahu_obdelnik() {
        //System.out.println("Strana: " + strana + "Strana1: " + strana1);
        return strana * strana_1;
    }
    
    double Uhlopricka_obdelnik() {
        return Math.sqrt(Math.pow(strana, 2) + Math.pow(strana_1, 2));
    }
    
    @Override
    void Vypis() throws IOException {
        ArrayList<Double> list = new ArrayList<>();
        String pole[] = new String[5];
        System.out.print("Zadej delku strany a: ");
        list.add(Nacti_cislo.Nacitani());
        System.out.print("Zadej delku strany b: ");
        list.add(Nacti_cislo.Nacitani());
        System.out.print("Zadej obsah: ");
        list.add(Nacti_cislo.Nacitani());
        System.out.print("Zadej obvod: ");
        list.add(Nacti_cislo.Nacitani());
        System.out.print("Zadej uhlopricku: ");
        list.add(Nacti_cislo.Nacitani());
        System.out.print(list);
        System.out.println();
        
       /* System.out.print("Zadej delku strany a: ");
        this.strana = Nacti_cislo.Nacitani();
        System.out.print("Zadej delku strany b: ");
        this.strana_1 = Nacti_cislo.Nacitani();*/
        boolean vypni = false;
        do {
              System.out.println("1 - Obsah obdelniku\n2 - Obvod obdelniku\n3 - Uhlopricka obdelniku");
              switch ((int)Nacti_cislo.Nacitani()) {
                  case 1: System.out.println("Obsah obdelniku je: " + Vypocet_obsahu_obdelnik());
                  break;
                  case 2: System.out.println("Obvod obdelniku je: " + Vypocet_obvodu_obdelnik());
                  break;
                  case 3: System.out.println("Uhlopricka obdelniku je: " + Uhlopricka_obdelnik());
                  break;
                  default: System.out.println("Zadej 1 - 3!"); vypni = true;  
              }
        } while ( vypni );
    }
}
