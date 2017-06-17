/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zkouseni;

/**
 *
 * @author mnovak
 */
public class Zkouseni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Reverse reverse = new Reverse(5);
        Opak_reverse opako = new Opak_reverse(5);
        Reverse t;
        t = reverse;
        //everse_String opak_R = new Reverse_String();
        reverse.Opak(reverse.velikost);
        t.Vypis();
        System.out.println();
        t = opako;
        t.Vypis();
       //opak_R.Opak_retezec("ahoj prdelko");
    }
    
    
    
}
