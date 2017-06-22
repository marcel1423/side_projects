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
public class Kruznice extends Ctyruhelnik {
    
    Kruznice(int polomer) {
        super(polomer);
    }
    
    Kruznice () {
        System.out.println("Nezadal jsi delku kruznice. Polomer byl automaticky nastaven na 0.");
    }
    
    @Override
    public double Vypocet_obvodu() {
        return PI * strana * 2;
    }
    
    @Override
    public double Vypocet_obsahu() {
        return PI * pow(strana, 2);
    }
}
