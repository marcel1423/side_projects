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
    private int strana;
    private int strana1;
    private int strana2;
    
    Obvod (int strana) {
        this.strana = strana;
    }
    
    Obvod () {
        strana = 0;
        System.out.println("Nezadal jsi delku strany. Strana byla automaticky nastavena na 0.");
    }
    
    Obvod (int strana, int strana1) {
        this.strana = strana;
        this.strana1 = strana1;
    }
    
    Obvod (int strana, int strana1, int strana2 ) {
        this.strana = strana;
        this.strana2 = strana1;
        this.strana2 = strana2;
    }
    int Vypocet_obvodu_ctverec() {
        return 4 * strana;
    }
    
    int Vypocet_obsahu_ctverec() {
        return strana * strana;
    }
    
    int Vypocet_obvodu_dvoustranny() {
        return 2 * (strana + strana1);
    }
    
    int Vypocet_obsahu_dvoustranny() {
        return strana * strana1;
    }
}
