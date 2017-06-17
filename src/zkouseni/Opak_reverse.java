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
public class Opak_reverse extends Reverse {
    int pocet_znaku;
    int spravne[];

    Opak_reverse() {
        super();
        spravne = new int[10];
    }
    Opak_reverse(int...x) {
        super(x);
        spravne = new int[x.length];
    }
    Opak_reverse(int a) {
        super(a);
        spravne = new int[a];
    }
    void Vypis () {

    for (int i: super.pole) {
        System.out.print(super.pole[i] + " ");
    }
    System.out.println();
}
    
    
}
