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
public class Mnohouhelnik implements Vypocty {
    private double delky[];
    Mnohouhelnik(double ... x) {
        delky = x; /* nemusim nastavovat rozsah delky, protoze predavam odkaz na pole x */
    }
    @Override
    public double Vypocet_obvodu() {
        double obvod = 0;
        for (int i = 0; i < delky.length; i ++ ) obvod += delky[i];
        return obvod;
    }
    
    @Override
    public double Vypocet_obsahu() {
        double obsah = 1;
        for (int i = 0; i < delky.length; i ++ ) obsah *= delky[i];
        return obsah;
    }
}
