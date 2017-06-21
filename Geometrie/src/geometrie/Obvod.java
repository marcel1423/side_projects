/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometrie;

/**
 *
 * @author mnovak
 */
public class Obvod {
    private double strana;
    private double strana1;
    private double strana2;
    
    Obvod (double strana) {
        this.strana = strana;
    }
    
    Obvod () {
        strana = 0;
        System.out.println("Nezadal jsi delku strany. Strana byla automaticky nastavena na 0.");
    }
    
    Obvod (double strana, double strana1) {
        this.strana = strana;
        this.strana1 = strana1;
    }
    
    Obvod (double strana, double strana1, double strana2 ) {
        this.strana = strana;
        this.strana2 = strana1;
        this.strana2 = strana2;
    }
    double Vypocet_obvodu_ctverec() {
        return strana * 4;
    }
    
    double Vypocet_obsahu_ctverec() {
        return strana * strana;
    }
    
    double Vypocet_obvodu_dvoustranny() {
        return (strana + strana1) * 2;
    }
    
    double Vypocet_obsahu_dvoustranny() {
        return strana * strana1;
    }
    
    double Vypocet_obvodu_trojuhelnik() {
        return strana + strana1 + strana2;
    }
    
    double Vypocet_obsahu_trojuhelnik() {
        return strana * strana1 * strana2;
    }
}
