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
       // Nacti_cislo nacitani = new Nacti_cislo();
        Ctverec ctverec = new Ctverec();
        Trojuhelnik trojuhelnik = new Trojuhelnik();
        Mnohouhelnik mnohouhelnik = new Mnohouhelnik();
        Obdelnik obdelnik = new Obdelnik();
        String s;
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
                    obdelnik.Vypis(2);
                    break;
                case 3: 
                    trojuhelnik.Vypis(3);
                    break;
                case 4:
                    System.out.print("Zadej kolika chces zadat stran: " );
                    int max = (int)Nacti_cislo.Nacitani();
                    mnohouhelnik.Vypis(max);
                    break;
                case 0: konec = true;
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
