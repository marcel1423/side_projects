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
public class Kruznice extends Ctverec {
    
    Kruznice(int polomer) {
        super(polomer);
    }
    Kruznice() {}
    
    @Override
    double Vypocet_obvodu() {
        return PI * strana * 2;
    }
    
    
    @Override
    double Vypocet_obsahu() {
        return PI * pow(strana, 2);
    }
    
    @Override
    void Vypis() throws IOException {
        System.out.print("Zadej delku polomeru kruznice: ");
        strana = Nacti_cislo.Nacitani();
        System.out.println("1 - Obsah kruznice\n2 - Obvod kruznice");
        int vyber_2 = (int)Nacti_cislo.Nacitani();
        switch (vyber_2) {
            case 1: System.out.println("Obsah kruznice je: " + Vypocet_obsahu());
                    break;
            case 2: System.out.println("Obvod kruznice je: " + Vypocet_obvodu());
        }
    }
}
