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
public class Kuzel extends Valec {
    Kuzel() {}

    Kuzel (double strana, double vyska) {
        super(strana, vyska);
    }
    
    
    double Vypocet_objemu_kuzel() {
        return (1.0/3.0) * Vypocet_obsahu() * vyska;
    }
    
    double Vypocet_povrchu_kuzel() {
        return Vypocet_obsahu() + (Math.PI * strana * Math.sqrt(Math.pow(strana, 2) + Math.pow(vyska,2) ) );
    }
}
