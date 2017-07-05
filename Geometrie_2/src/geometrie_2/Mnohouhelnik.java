/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometrie_2;

import java.io.IOException;
import static java.lang.Math.*;
/**
 *
 * @author mnovak
 */
public class Mnohouhelnik extends Trojuhelnik {
    protected int pocet_stran;
    Mnohouhelnik() {
      //  delky = x; /* nemusim nastavovat rozsah delky, protoze predavam odkaz na pole x */
    }
    
    Mnohouhelnik (double strany[]) {
        super(strany);
    }
    Mnohouhelnik (double strana) {
        super (strana);
    }
    Mnohouhelnik (double strana, int pocet_stran) {
        super(strana);
        this.pocet_stran = pocet_stran;
    }
    public double Vypocet_obvodu_mnohouhelnik() {
        return pocet_stran * strana;
    }
    
    public double Vypocet_obsahu_mnohouhelnik() {
        return (1.0/4.0) * pocet_stran * pow(strana, 2) * (cos(PI/pocet_stran)) / (sin(PI/pocet_stran));
    }
    
    void Vypis() throws IOException {
        boolean vypni = false;
        do {
              System.out.println("1 - Obsah mnohouhelniku\n2 - Obvod mnohouhelniku");
              switch ((int)Nacti_cislo.Nacitani()) {
                  case 1: System.out.println("Obsah mnohouhelniku je: " + Vypocet_obsahu_mnohouhelnik());
                  break;
                  case 2: System.out.println("Obvod mnohouhelniku je: " + Vypocet_obvodu_mnohouhelnik());
                  break;
                  default: System.out.println("Zadej 1 - 2!"); vypni = true;  
              }
        } while ( vypni );      
    }
}
