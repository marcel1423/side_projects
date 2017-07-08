/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometrie_2;

import java.io.IOError;
import java.io.IOException;

/**
 *
 * @author mnovak
 */
public class Hranol extends Jehlan {
    
    Hranol() {}

    Hranol (double strana, double vyska, int pocet_stran) {
        super (strana, vyska, pocet_stran);
    }
    
    double Vypocet_objemu_hranol() {
        return Vypocet_obsahu_mnohouhelnik() * vyska;
    }
    
    double Vypocet_povrchu_hranol() {
        return (2 * Vypocet_obsahu_mnohouhelnik()) + (Vypocet_obvodu_mnohouhelnik() * vyska);
    }
    
    @Override
     void Vypis() throws IOException {
       System.out.print("Zadej vysku: " );
       this.vyska = Nacti_cislo.Nacitani();
       System.out.print("Zadej pocet stran mnohouhelniku: ");
       this.pocet_stran = (int)Nacti_cislo.Nacitani();
       System.out.print("Zadej delku strany podstavy: ");
       this.strana = Nacti_cislo.Nacitani();
       
       boolean vypni = false;
       do {
       System.out.println("1 - Objem hranolu\n2 - Povrch hranolu");
       switch ((int)Nacti_cislo.Nacitani()) {
           case 1: System.out.println("Objem hranolu je: " + Vypocet_objemu_hranol()); break;
           case 2: System.out.println("Povrch hranolu je: " + Vypocet_povrchu_hranol()); break;
           default: System.out.println("Zadej 1 - 2!"); vypni = true;
       } 
       } while (vypni);
    }
}
