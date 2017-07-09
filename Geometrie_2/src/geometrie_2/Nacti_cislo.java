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
        double strana = 0;
      //  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      Scanner br = new Scanner(System.in);
      boolean konec = true;
            do {
                try {
                    if(br.hasNext("stop")) break;
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
    
    static String Nacitani_znaku() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String i = "";
        boolean konec = true;
        do {
            try {
                i = br.readLine();
                konec = false;
            } catch (InputMismatchException vyj) {
                System.out.println("Nespravny format.");
            }
        } while (konec);
        return i;
    }
    
    /*static int Nacitani(String tvar) throws IOException {
        boolean konec = true;
        int pocet = 0;
        do {
        if (tvar.equalsIgnoreCase("ctverec")) {
            pocet = 1;
        } else if (tvar.equalsIgnoreCase("obdelnik")final) {
            pocet = 2;
        } else if (tvar.equalsIgnoreCase("trojuhelnik")) {
            pocet = 3;
        } else if (tvar.equalsIgnoreCase("mnohouhelnik")) {
            pocet = (int)Nacitani();
        } else {
            System.out.println("Nezadal jsi zadny z geometrickych tvaru.");
            konec = false;
        }
        } while (!konec);
            return pocet;
    }*/
}
