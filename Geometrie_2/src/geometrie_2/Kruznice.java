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
    
    Kruznice(double polomer) {
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
        boolean vypni = false;
        do {
              System.out.println("1 - Obsah kruznice\n2 - Obvod kruznice");
              switch ((int)Nacti_cislo.Nacitani()) {
                  case 1: System.out.println("Obsah kruznice je: " + Vypocet_obsahu());
                  break;
                  case 2: System.out.println("Obvod kruznice je: " + Vypocet_obvodu());
                  break;
                  default: System.out.println("Zadej 1 - 2!"); vypni = true;  
              }
        } while ( vypni );      
    }
}
