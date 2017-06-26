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
public class Trojuhelnik extends Ctverec {
    private double strana, strana1, strana2;
    private double strany[];
    
    Trojuhelnik() {}   
    
    Trojuhelnik(double strany[]) {
        this.strany = strany;
        for (int i = 0; i < strany.length; i ++ ) { 
                        strana = strany[i];
                        strana1 = strany[i];
                        strana2 = strany[i];
                    }
    }
   
    public double Vypocet_obvodu(double strany[]) {
        return strana + strana1 + strana2;
    }
   
    public double Vypocet_obsahu(double strany[]) {
        return strana * strana1 * strana2;
    }
}
