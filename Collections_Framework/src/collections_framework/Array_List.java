/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections_framework;
import java.util.*;
/**
 *
 * @author mnovak
 */
public class Array_List {
    //implementuje rozhrani List a Collections
    void Dynamicke_pole () {
        ArrayList<String> al = new ArrayList<>();
        System.out.println("Pocatecni velikost pole al: " + al.size());
        //add (pridani prvku)
        al.add("c");
        al.add("b");
        al.add("e");
        al.add("b");
        al.add("d");
        al.add("f");
        al.add(1, "a2");
        //size (zjistuje velikost seznamu)
        System.out.println("Velikost pole al po pridani prvku: " + al.size());
        
        System.out.println("Obsah pole al: " + al);
        //remove (vymaze prvky na urcite pozici nebo prvky ktere jsou zadane)
        al.remove("f");
        System.out.println("rem: " + al.remove(2));
        
        //set (na urcenou pozici vlozi prvek stejneho typu)
        al.set(1, "Vlozeni");
        System.out.println("Velikost pole al po odstraneni prvku: " + al.size());
        System.out.println("Obsah pole al: " + al);
        
        //get (hledani prvku podle umisteni)
        System.out.println("Prvek na miste 3: " + al.get(3));
        //sublist (zobrazi seznam, ktery je ohraniceny zadanymi body
        System.out.println("Novy seznam: " + al.subList(1, 4));
        
        //vytvoreni noveho String seznamu
        ArrayList<String> pom = new ArrayList<>();
        pom.add("ahoj");
        pom.add("jak");
        pom.add("se");
        pom.add("mas");
        pom.add("?");
        
        //adAll (prida do seznamu dalsi seznam od zadane pozice)
        al.addAll(5, pom);
        System.out.println("SEZNAM: " + al);
        if (al.addAll(2, pom)) System.out.println("seznam: " + al);
        
        //Pole z Integer
        ArrayList<Integer> poc = new ArrayList<>();
        poc.add(4);
        poc.add(2);
        poc.add(5);
        poc.add(4);
        poc.add(8);
        int n = 4;
        //indexof (hledani zadaneho prvku v celem poli)
        System.out.println("indexof: " + poc.indexOf(n));
        //lastIndexof (hleda posledni zminku o zadanem objektu v poli)
        System.out.println("lastindexof: " + poc.lastIndexOf(n));
        System.out.println("Intova kolekce: " + poc);
        //clear (vymaze vse v kolekci)
        //poc.clear();
        System.out.println("Intova kolekce po clearu: " + poc);
        
        //contains (hleda prvek v kolekci a pripadne vraci true, nebo false
        if (poc.contains(5) ) System.out.println("Je pvkem kolekce");
        else System.out.println("Neni prvkem kolekce.");
        // equals (funguje jinak nez contains, objekty musi byt opravdu uplne stejny)
        if (poc.equals(poc)) System.out.println("Je pvkem kolekce");
        else System.out.println("Neni prvkem kolekce.");
        //isEmpty (zjistuje jestli je kolekce prazdna
        System.out.println("Je prazdna? " + poc.isEmpty());
        
        // novy list Stringu
        ArrayList<String> pom_1 = new ArrayList<>();
        pom_1.add("a");
        pom_1.add("f");
        pom_1.add("g");
        pom_1.add("d");
        pom_1.add("b");
        // removeAll (odstranuje vsechny prvky ktere jsou schodny)
        System.out.println("Remove all: " + al.removeAll(pom) + "\n" + al);
        //retainAll (vymaze vse krome tech ktery se shoduji)
        System.out.println("Retain all: " + al.retainAll(pom_1) + "\n" + al);
        //toArray (prevede kolekci na pole)
        Integer pole[] = new Integer[poc.size()];
        pole = poc.toArray(pole);
        pole[2] = 10;
        for (int v: pole)
            System.out.print(v + " ");
        System.out.println("\nNove: " + poc);
    }
}
