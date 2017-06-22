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
    @Override
    public double Vypocet_obvodu() {
        return strana + strana1 + strana2;
    }
    @Override
    public double Vypocet_obsahu() {
        return strana * strana1 * strana2;
    }
}
