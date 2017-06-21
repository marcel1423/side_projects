/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometrie_2;

/**
 *
 * @author mnovak
 */
public class Trojuhelnik extends Ctyruhelnik {
    private double strana2;
    
    Trojuhelnik (double strana, double strana1, double strana2 ) {
        super(strana, strana1);
        this.strana2 = strana2;
    }
    Trojuhelnik() {
        super();
    }
    
    double Vypocet_obvodu_trojuhelnik() {
        return strana + strana1 + strana2;
    }
    
    double Vypocet_obsahu_trojuhelnik() {
        return strana * strana1 * strana2;
    }
}
