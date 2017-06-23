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
import java.io.*;
public class Geometrie_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Nacti_cislo nacitani = new Nacti_cislo();
        String s;
        int vyber, vyber_2,
                strana, strana1, strana2;
        boolean konec = false;
        do {
            System.out.println("Vyber si co chces spocitat" );
            System.out.println("1 - Ctverec\n2 - Obdelnik\n3 - Trojuhelnik\n4 - Mnohouhelnik\n5 - Kruznice");
            vyber = nacitani.Nacitani();
            
            switch (vyber) {
                case 1: 
                    System.out.print("Zadej delky strany ctverce: ");
                    strana = nacitani.Nacitani();
                    Ctyruhelnik ctverec = new Ctyruhelnik(strana);
                    System.out.println("1 - Obsah ctverce\n2 - Obvod ctverce");
                    vyber_2 = nacitani.Nacitani();
                    switch (vyber_2) {
                        case 1: System.out.println("Obsah ctverce je: " + ctverec.Vypocet_obsahu());
                            break;
                        case 2: System.out.println("Obvod ctverce je: " + ctverec.Vypocet_obvodu());
                    }
                    break;
                case 2: 
                    System.out.print("Zadej delky stran obdelniku: ");
                    strana = nacitani.Nacitani();
                    strana1 = nacitani.Nacitani();
                    Ctyruhelnik obdelnik = new Ctyruhelnik(strana, strana1);
                    System.out.println("1 - Obsah obdelniku\n2 - Obvod obdelniku");
                    vyber_2 = nacitani.Nacitani();
                    switch (vyber_2) {
                        case 1: 
                            System.out.println("Obsah obdelniku je: " + obdelnik.Vypocet_obsahu());
                            break;
                        case 2:
                            System.out.println("Obvod obdelniku je: " + obdelnik.Vypocet_obvodu());
                    }
                    break;
                case 3: 
                    System.out.print("Zadej delky stran obdelniku: ");
                    strana = nacitani.Nacitani();
                    strana1 = nacitani.Nacitani();
                    strana2 = nacitani.Nacitani();
                    Trojuhelnik trojuhelnik = new Trojuhelnik(strana, strana1, strana2);
                    System.out.println("1 - Obsah trojuhelniku\n2 - Obvod trojuhelniku");
                    vyber_2 = nacitani.Nacitani();
                    switch (vyber_2) {
                        case 1: 
                            System.out.println("Obsah trojuhelniku je: " + trojuhelnik.Vypocet_obsahu());
                            break;
                        case 2:
                            System.out.println("Obvod trojuhelniku je: " + trojuhelnik.Vypocet_obvodu());
                    }
                    break;
                default: konec = true;
            } 
        } while (!konec);
        
       
        
     //   Kruznice kruznice = new Kruznice(5);
      //  Mnohouhelnik mnohouhelnik = new Mnohouhelnik(3, 5, 6, 9, 7, 8, 10, 5);
      //  Vypocty ob;
     //   ob = ctyruhelnik;
     //   System.out.println("Ctyruhelnik: " + ob.Vypocet_obsahu());
      //  System.out.println("Trojuhelnik: " + trojuhelnik.Vypocet_obvodu());
      //  System.out.println("Kruznice: " + kruznice.Vypocet_obvodu());
      //  System.out.println("Mnohouhelnik: " + mnohouhelnik.Vypocet_obvodu());
    }
    
}
