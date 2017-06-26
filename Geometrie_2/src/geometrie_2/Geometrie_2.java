package geometrie_2;
/**
 * @author mnovak
 */
import java.io.*;
public class Geometrie_2 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    
    public static void main(String[] args) throws IOException {
        Ctverec ctverec;
        Trojuhelnik trojuhelnik;
        Mnohouhelnik mnohouhelnik;
        Obdelnik obdelnik;
        Kruznice kruznice;
        Nacti_cislo nacitani = new Nacti_cislo();
        double strana;
        double strany[];
        int vyber;
        boolean konec = false, vypni = false;
        do {
            System.out.println("Vyber si co chces spocitat" );
            System.out.println("1 - Ctverec\n2 - Obdelnik\n3 - Trojuhelnik\n4 - Mnohouhelnik\n5 - Kruznice\n0 - Konec");
            vyber = (int)Nacti_cislo.Nacitani();
            
            switch (vyber) {
                case 1: 
                    System.out.print("Zadej delky strany ctverce: ");
                    strana = Nacti_cislo.Nacitani();
                    ctverec = new Ctverec(strana);
                    do {
                    System.out.println("1 - Obsah ctverce\n2 - Obvod ctverce\n3 - Uhlopricka");
                    int vyber_2 = (int)Nacti_cislo.Nacitani();
                    switch (vyber_2) {
                        case 1: System.out.println("Obsah ctverce je: " + ctverec.Vypocet_obsahu());
                                break;
                        case 2: System.out.println("Obvod ctverce je: " + ctverec.Vypocet_obvodu());
                                break;
                        case 3: System.out.println("Uhlopricka ctverce je: " + ctverec.Uhlopricka());
                                break;
                        default: System.out.println("Vyber 1 - 3!!"); vypni = true;
                    }
                   } while (vypni);                    
                    break;
                case 2:
                    strany = new double[vyber];
                    System.out.print("Zadej delky strany obdelniku: ");
                    strany = nacitani.Nacitani(vyber);
                    obdelnik = new Obdelnik(strany);
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
                    strany = new double[vyber];
                    System.out.print("Zadej delky strany trojuhelniku: ");
                    strany = nacitani.Nacitani(vyber);
                    do {
                    System.out.println("1 - Obsah trojuhelniku\n2 - Obvod trojuhelniku");
                    trojuhelnik = new Trojuhelnik(strany);
                    int vyber_2 = (int)nacitani.Nacitani();
                    switch (vyber_2) {
                        case 1: System.out.println("Obsah trojuhelniku je: " + trojuhelnik.Vypocet_obsahu(strany));
                                break;
                        case 2: System.out.println("Obvod trojuhelniku je: " + trojuhelnik.Vypocet_obvodu(strany));
                                break;
                        default: System.out.println("Zadej 1 - 2!"); vypni = true;
                    }
                    } while (vypni);
                    break;
                case 4:
                    System.out.print("Zadej kolika chces zadat stran: " );
                    int max = (int)Nacti_cislo.Nacitani();
                    System.out.print("Zadej delky strany mnohouhelniku: ");
                    strany = nacitani.Nacitani(max);
                    mnohouhelnik = new Mnohouhelnik(strany);
                    do {
                    System.out.println("1 - Obsah mnohouhelniku\n2 - Obvod mnohouhelniku");
                    int vyber_2 = (int)nacitani.Nacitani();
                    switch (vyber_2) {
                        case 1: System.out.println("Obsah mnohouhelniku je: " + mnohouhelnik.Vypocet_obsahu(strany));
                                break;
                        case 2: System.out.println("Obvod mnohouhelniku je: " + mnohouhelnik.Vypocet_obvodu(strany));
                                break;  
                        default: System.out.println("Zadej 1 - 2!"); vypni = true;
                    }     
                    } while (vypni);
                    break;
                case 5:
                    System.out.print("Zadej delku polomeru kruznice: ");
                    strana = Nacti_cislo.Nacitani();
                    kruznice = new Kruznice(strana);
                    do {
                    System.out.println("1 - Obsah kruznice\n2 - Obvod kruznice");
                    int vyber_2 = (int)Nacti_cislo.Nacitani();
                    switch (vyber_2) {
                        case 1: System.out.println("Obsah kruznice je: " + kruznice.Vypocet_obsahu());
                                break;
                        case 2: System.out.println("Obvod kruznice je: " + kruznice.Vypocet_obvodu());
                                break;
                        default: System.out.println("Zadej 1 - 2!"); vypni = true;
                    }
                    } while (vypni);
                    break;
                case 0: konec = true; break;
                default: System.out.println("Vyber 0 - 5!");
            } 
        } while (!konec);
    }
    
    
}
