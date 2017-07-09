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
                        case 1: Ctverec ctverec = new Ctverec();
                                ctverec.Vypis();
                                break;
                        case 2: Obdelnik obdelnik = new Obdelnik();
                                obdelnik.Vypis();
                                break;
                        case 3: Trojuhelnik trojuhelnik = new Trojuhelnik();
                                trojuhelnik.Vypis();
                                break;
                        case 4: Mnohouhelnik mnohouhelnik = new Mnohouhelnik();
                                mnohouhelnik.Vypis();
                                break;
                        case 5: Kruznice kruznice = new Kruznice();
                                kruznice.Vypis();
                                break;
                        case 0: break;
                    }       break;
                case 0:
                    konec = true;
                    break;
                case 2:
                    System.out.println("1 - Krychle\n2 - Kvadr\n3 - Jehlan\n4 - Valec\n5 - Koule\n6 - Hranol\n7 - Kuzel\n0 - Zpet");
                    switch ((int)Nacti_cislo.Nacitani()) {
                        case 1: Krychle krychle = new Krychle();
                                krychle.Vypis();
                                break;
                        case 2: Kvadr kvadr = new Kvadr();
                                kvadr.Vypis();
                                break;
                        case 3: Jehlan jehlan = new Jehlan();
                                jehlan.Vypis();
                                break;
                        case 4: Valec valec = new Valec();
                                valec.Vypis();
                                break;
                        case 5: Koule koule = new Koule();
                                koule.Vypis();
                                break;
                        case 6: Hranol hranol = new Hranol();
                                hranol.Vypis();
                                break;
                        case 7: Kuzel kuzel = new Kuzel();
                                kuzel.Vypis();
                                break;
                        case 0: break;
                    }           break;
            } 
    } while (!konec);
    }
}
