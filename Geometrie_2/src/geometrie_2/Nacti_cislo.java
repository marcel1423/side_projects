/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometrie_2;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author mnovak
 */
public class Nacti_cislo {
    
    static double Nacitani() throws IOException {
        double strana;
      //  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      Scanner br = new Scanner(System.in);
      boolean konec = true;
            do {
                try {
                        strana = br.nextDouble();
                        konec = false;
                    } catch (InputMismatchException vyj) {
                        br.next();
                        System.out.println("Nespravny format.");
                        strana = 0;
                     }
            } while ( konec );
            return strana;
    }
    
    static double[] Nacitani(int pocet) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner br = new Scanner(System.in);
        double strany[] = new double[pocet];
        boolean konec = true;
            do {
                try {
                for (int i = 0; i < strany.length; i ++ ) {
                      strany[i] = br.nextDouble();
                }
                      konec = false;
                    } catch (InputMismatchException vyj) {
                        br.next();
                        System.out.println("Nespravny format.");
                     }
            } while (konec);
            return strany;
    }
}
