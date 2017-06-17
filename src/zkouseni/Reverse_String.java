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
public class Reverse_String {
    private int delka;
    
    void Opak_retezec (String ret) {
        delka = ret.length();
        while (delka-- != 0 ) {
            System.out.print(ret.charAt(delka));
        }
        System.out.println();
    }
    
    
}
