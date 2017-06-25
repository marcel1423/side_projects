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
     * @throws java.io.IOException
     */
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Ctverec ctverec = new Ctverec();
        Trojuhelnik trojuhelnik = new Trojuhelnik();
        Mnohouhelnik mnohouhelnik = new Mnohouhelnik();
       // Obdelnik obdelnik = new Obdelnik();
        Kruznice kruznice = new Kruznice();
        int vyber;
        boolean konec = false;
        do {
            System.out.println("Vyber si co chces spocitat" );
            System.out.println("1 - Ctverec\n2 - Obdelnik\n3 - Trojuhelnik\n4 - Mnohouhelnik\n5 - Kruznice\n0 - Konec");
            vyber = (int)Nacti_cislo.Nacitani();
            
            switch (vyber) {
                case 1: 
                    ctverec.Vypis();
                    break;
                case 2:
                    double strany[] = new double[vyber];
                    Nacti_cislo nacitani = new Nacti_cislo();
                    System.out.print("Zadej delky strany obdelniku: ");
                    strany = nacitani.Nacitani(vyber);
                    Obdelnik obdelnik = new Obdelnik(strany);
                    boolean vypni = false;
                    do {
                    System.out.println("1 - Obsah obdelniku\n2 - Obvod obdelniku\n3 - Uhlopricka obdelniku");
                    int vyber_2 = (int)nacitani.Nacitani();
                    switch (vyber_2) {
                        case 1: System.out.println("Obsah obdelniku je: " + obdelnik.Vypocet_obsahu());
                        break;
                        case 2: System.out.println("Obvod obdelniku je: " + obdelnik.Vypocet_obvodu());
                        break;
                        case 3: System.out.println("Uhlopricka obdelniku je: " + obdelnik.Uhlopricka());
                        break;
                        default: System.out.println("Zadej 1 - 3!"); vypni = true;
                    }
                    } while ( vypni );
                    
                    break;
                case 3: 
                    trojuhelnik.Vypis(3);
                    break;
                case 4:
                    System.out.print("Zadej kolika chces zadat stran: " );
                    int max = (int)Nacti_cislo.Nacitani();
                    mnohouhelnik.Vypis(max);
                    break;
                case 5:
                    kruznice.Vypis();
                    break;
                case 0: konec = true; break;
                default: System.out.println("Vyber 0 - 5!");
            } 
        } while (!konec);
    }
    
}
