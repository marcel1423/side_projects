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
public class Hranol extends Jehlan {
    
    Hranol() {}

    Hranol (double strana, double vyska, int pocet_stran) {
        super (strana, vyska, pocet_stran);
    }
    
    double Vypocet_objemu_hranol() {
        return Vypocet_obsahu_mnohouhelnik() * vyska;
    }
    
    double Vypocet_povrchu_hranol() {
        return (2 * Vypocet_obsahu_mnohouhelnik()) + (Vypocet_obvodu_mnohouhelnik() * vyska);
    }
}
