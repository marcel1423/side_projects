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
public class Kruznice extends Ctverec {
    
    Kruznice(int polomer) {
        super(polomer);
    }
    Kruznice() {}
    
    public double Vypocet_obvodu() {
        return PI * strana * 2;
    }
    
    
    public double Vypocet_obsahu() {
        return PI * pow(strana, 2);
    }
}
