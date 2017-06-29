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
        Krychle krychle;
        Kvadr kvadr;
        Jehlan jehlan;
        boolean konec = false;
        int vyber;
        do {
            System.out.println("Vyber si co chces spocitat" );
            System.out.println("Pro tvary ve 2D stiskni 1\nPro tvary ve 3D stikni 2\n0 - Konec");
            vyber = (int)Nacti_cislo.Nacitani();
            switch (vyber) {
                case 1:
                    System.out.println("1 - Ctverec\n2 - Obdelnik\n3 - Trojuhelnik\n4 - Mnohouhelnik\n5 - Kruznice\n0 - Zpet");
                    switch ((int)Nacti_cislo.Nacitani()) {
                        case 1:
                            System.out.print("Zadej delky strany ctverce: ");
                            //Do ctverce prirazuji hodnotu tim ze je rovnou nacitam a nemusim si tak vytvaret dalsi promenou
                            ctverec = new Ctverec(Nacti_cislo.Nacitani());
                            ctverec.Vypis();
                            break;
                        case 2:
                            System.out.print("Zadej delky strany obdelniku: ");
                            obdelnik = new Obdelnik(Nacti_cislo.Nacitani(2));
                            obdelnik.Vypis();
                            break;
                        case 3:
                            System.out.print("Zadej delky strany trojuhelniku: ");
                            trojuhelnik = new Trojuhelnik(Nacti_cislo.Nacitani(3));
                            trojuhelnik.Vypis();
                            break;
                        case 4:
                            System.out.print("Zadej kolik chces stran: " );
                            int max = (int)Nacti_cislo.Nacitani();
                            System.out.print("Zadej delky strany mnohouhelniku: ");
                            /*Do mnohouhelniku prirazuji pole tim ze ho rovnou nacitam a nemusim si tak vytvaret dalsi promenou a jeho
                            * rozsah je dany promennou max tu zadat musim protoze po ni nasleduje dalsi otazka
                            */
                            mnohouhelnik = new Mnohouhelnik(Nacti_cislo.Nacitani(max));
                            mnohouhelnik.Vypis();
                            break;
                        case 5:
                            System.out.print("Zadej delku polomeru kruznice: ");
                            kruznice = new Kruznice(Nacti_cislo.Nacitani());
                            kruznice.Vypis();
                            break;
                        case 0: konec = true; break;
                        //default: System.out.println("Vyber 0 - 5!");
                    }       break;
                case 0:
                    konec = true;
                    break;
                case 2:
                    System.out.println("1 - Krychle\n2 - Kvadr\n3 - Jehlan\n4 - Valec\n5 - Koule\n6 - Hranol\n7 - Kuzel\n0 - Zpet");
                    switch ((int)Nacti_cislo.Nacitani()) {
                        case 1:
                            System.out.print("Zadej delky strany krychle: ");
                            //Do ctverce prirazuji hodnotu tim ze je rovnou nacitam a nemusim si tak vytvaret dalsi promenou
                            krychle = new Krychle(Nacti_cislo.Nacitani());
                            krychle.Vypis();
                            break;
                        case 2:
                            System.out.print("Zadej delky strany kvadru: ");
                            kvadr = new Kvadr(Nacti_cislo.Nacitani(3));
                            kvadr.Vypis();
                            break;
                        case 3:
                            boolean vypni = false;
                            do {
                                System.out.println("1 - Objem jehlanu\n2 - Povrch jehlanu");
                                  switch ((int)Nacti_cislo.Nacitani()) {
                                      case 1:   System.out.print("Zadej vysku: " );
                                                double vyska = Nacti_cislo.Nacitani();
                                                System.out.print("Zadej jaky tvar ma podstava(ctverec, obdelnik, trojuhelnik, mnohouhelnik): ");
                                                String tvar = Nacti_cislo.Nacitani_znaku();
                                                System.out.print("Zadej delky stran podstavy: ");
                                                jehlan = new Jehlan (Nacti_cislo.Nacitani(Jehlan.Nacitani(tvar)), vyska);
                                                System.out.println("Objem jehlanu je: " + jehlan.Vypocet_objemu());
                                      break;
                                      case 2:   System.out.print("Zadej jaky tvar ma podstava(ctverec, obdelnik, trojuhelnik, mnohouhelnik): ");
                                                String tvar1 = Nacti_cislo.Nacitani_znaku();
                                                System.out.print("\nZadej delky stran podstavy: ");
                                                double pom[] = Nacti_cislo.Nacitani(Jehlan.Nacitani(tvar1));
                                                System.out.print("Zadej delky stran plaste(trojuhelniku): ");
                                                jehlan = new Jehlan (pom, Nacti_cislo.Nacitani(3));
                                                System.out.println("Povrch  jehlanu je: " + jehlan.Vypocet_povrchu());
                                      break;
                                      default: System.out.println("Zadej 1 - 2!"); vypni = true;  
                                  }
                            } while ( vypni );
                    }           break;
            } 
    } while (!konec);
    }
}
