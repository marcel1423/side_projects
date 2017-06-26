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
public class Mnohouhelnik {
    private double strany[];
    Mnohouhelnik() {
      //  delky = x; /* nemusim nastavovat rozsah delky, protoze predavam odkaz na pole x */
    }
    
    Mnohouhelnik (double strany[]) {
        this.strany = strany;
    }
    public double Vypocet_obvodu(double strany[]) {
        double obvod = 0;
        for (int i = 0; i < strany.length; i ++ ) obvod += strany[i];
        return obvod;
    }
    
    public double Vypocet_obsahu(double strany[]) {
        double obsah = 1;
        for (int i = 0; i < strany.length; i ++ ) obsah *= strany[i];
        return obsah;
    }
}
