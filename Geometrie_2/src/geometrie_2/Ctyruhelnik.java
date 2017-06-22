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
public class Ctyruhelnik implements Vypocty {
    protected double strana;
    protected double strana1;
    
    Ctyruhelnik (double strana) {
        this.strana = strana;
    }
    
    Ctyruhelnik () {
        strana = 0;
        System.out.println("Nezadal jsi delku strany. Strana byla automaticky nastavena na 0.");
    }
    
    Ctyruhelnik (double strana, double strana1) {
        this.strana = strana;
        this.strana1 = strana1;
    }
    
    @Override
    public double Vypocet_obvodu() {
        return strana * 4;
    }
    @Override
    public double Vypocet_obsahu() {
        return strana * strana;
    }
    
    double Vypocet_obvodu_dvoustranny() {
        return (strana + strana1) * 2;
    }
    
    double Vypocet_obsahu_dvoustranny() {
        return strana * strana1;
    }
}
