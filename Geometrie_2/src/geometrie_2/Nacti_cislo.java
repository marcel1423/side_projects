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
    private int strana;
    
    Nacti_cislo() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    }
    
    int Nacitani() throws IOException {
            try {
                        strana = Integer.parseInt(br.readLine());
                    } catch (NumberFormatException vyj) {
                          System.out.println("Nespravny format.");
                           strana = 0;
                     }
            return strana;
    }
}
