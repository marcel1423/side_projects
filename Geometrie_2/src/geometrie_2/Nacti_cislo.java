/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometrie_2;

import java.io.*;
/**
 *
 * @author mnovak
 */
public class Nacti_cislo {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static double strana;
    private double strany[];
    
    Nacti_cislo() {   }
    
    static double Nacitani() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            try {
                        strana = Integer.parseInt(br.readLine());
                    } catch (NumberFormatException vyj) {
                          System.out.println("Nespravny format.");
                           strana = 0;
                     }
            return strana;
    }
    
    double[] Nacitani(int pocet) throws IOException {
        strany = new double[pocet];
            try {
                for (int i = 0; i < strany.length; i ++ )  
                      strany[i] = Integer.parseInt(br.readLine());
                    } catch (NumberFormatException vyj) {
                          System.out.println("Nespravny format.");
                           strana = 0;
                     }
            return strany;
    }
}
