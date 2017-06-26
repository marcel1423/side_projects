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
public class Ctverec {
    protected double strana;
    
    Ctverec (double strana) {
        this.strana = strana;
    }    

    Ctverec() { }
    
    double Vypocet_obvodu() {
        return 4 * strana;
    }
    
    double Vypocet_obsahu() {
        return strana * strana;
    }
    
    double Uhlopricka() {
        return strana * Math.sqrt(2);
    }
}
