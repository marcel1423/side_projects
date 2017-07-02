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
public class Kuzel extends Jehlan {
    Kuzel() {}

    Kuzel (double strana, double vyska) {
        super(strana);
        this.vyska = vyska;
    }
    Kuzel (double strana) {
        super (strana);
    }
    
    Kuzel (double podstava[], double vyska) {
        super(podstava);     
        this.vyska = vyska;
        delka = podstava.length;
    }
    
    Kuzel (double podstava[], double plast[]) {
        super(plast);
        delka = podstava.length;
    }
    
    double Vypocet_objemu_kuzel() {
        return (1.0/3.0) * Vypocet_obsahu() * vyska;
    }
    
    double Vypocet_povrchu_kuzel() {
        return Vypocet_obsahu() * Vypocet_obsahu_trojuhelnik();
    }
}
