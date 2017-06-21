/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometrie_2;
import static java.lang.Math.*;
/**
 *
 * @author mnovak
 */
public class Kruznice {
    private double polomer;
    
    Kruznice(int polomer) {
        this.polomer = polomer;
    }
    
    Kruznice () {
        System.out.println("Nezadal jsi delku kruznice. Polomer byl automaticky nastaven na 0.");
    }
    
    double Vypocet_obvodu_kruznice() {
        return PI * polomer * 2;
    }
    
    double Vypocet_obsahu_kruznice() {
        return PI * pow(polomer, 2);
    }
}
