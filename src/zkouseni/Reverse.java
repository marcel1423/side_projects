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
public class Reverse {
    public int pole[];
    private int tmp = 0;
    private int a;
    private int pom_pole[];
    public int velikost;
    
    Reverse(int a) {
        pole = new int[a];
        this.a = a;
        pom_pole = new int[a];  
        for (int x = 0; x < pole.length; x ++) {
            pole[x] = x;
        }
        velikost = pole.length;
    }

    Reverse () {
        pole = new int[10];
        pom_pole = new int[10];
         for (int x = 0; x < pole.length; x ++) {
            pole[x] = x;
        }
         velikost = pole.length;
    }
    Reverse (int ... x) {
        pole = new int [x.length];
        pom_pole = new int[x.length];
        System.arraycopy(x, 0, pole, 0, x.length);
        velikost = pole.length;
    }
     void Opak (int a) {
        if ( a == 0) {
            pom_pole[a] = pole[--tmp]; //musim zmensit aby bylo na pole[9] == 0, jinak bych tam mel 1
            return;
        } else {
            tmp++;
            Opak(a - 1);
        }

//zmensuji, jinak bych se dostal do stavu tmp = -1, potom error
        if (--tmp >= 0) {
               pom_pole[a] = pole[tmp];

        }
        }
     
     void Vypis() {
     for (int i = 0; i < pom_pole.length; i++ ) {
         System.out.println(pom_pole[i]);
     }
     }
    }

