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
public class Obdelnik {
    double strany[];
    double strana, strana1;
    
    Obdelnik (double strany[]) {
        this.strany = strany;
        for (int i = 0; i < strany.length; i ++ ) { 
                        strana = strany[i];
                        strana1 = strany[i];
                    }
    }
    Obdelnik() { }
    
    double Vypocet_obvodu(){
        return 2 * (strana + strana1);
    }
    double Vypocet_obsahu() {
        return strana * strana1;
    }
    
    double Uhlopricka() {
        return Math.sqrt(Math.pow(strana, 2) + Math.pow(strana1, 2));
    }
}
