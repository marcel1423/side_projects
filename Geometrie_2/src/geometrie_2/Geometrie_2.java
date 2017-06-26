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
        boolean konec = false;
        do {
            System.out.println("Vyber si co chces spocitat" );
            System.out.println("Pro tvary ve 2D stiskni 1\nPro tvary ve 3D stikni 2");
        if ((int)Nacti_cislo.Nacitani() == 1) {
            System.out.println("1 - Ctverec\n2 - Obdelnik\n3 - Trojuhelnik\n4 - Mnohouhelnik\n5 - Kruznice\n0 - Konec");
            
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
                    System.out.print("Zadej kolika chces stran: " );
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
                default: System.out.println("Vyber 0 - 5!");
            } 
        } else {
            System.out.println("1 - Krychle\n2 - Kvadr\n3 - Jehlan\n4 - Valec\n5 - Koule\n6 - Hranol\n7 - Kuzel\n0 - Konec");
            switch ((int)Nacti_cislo.Nacitani()) {
                case 1: 
                    System.out.print("Zadej delky strany ctverce: ");
                    //Do ctverce prirazuji hodnotu tim ze je rovnou nacitam a nemusim si tak vytvaret dalsi promenou   
                    krychle = new Krychle(Nacti_cislo.Nacitani());
                    krychle.Vypis();
                    break;
        }
        } 
    } while (!konec);
    }
}
