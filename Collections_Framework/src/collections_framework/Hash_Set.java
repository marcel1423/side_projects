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
public class Hash_Set {
//implementuje rozhrani Set a Collection

    void Ukazka_HashSet() {
        HashSet<String> hs = new HashSet<>();
        hs.add("B");
        hs.add("A");
        hs.add("D");
        hs.add("E");
        hs.add("C");
        hs.add("F");

        System.out.println(hs);
        
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("B");
        lhs.add("A");
        lhs.add("D");
        lhs.add("E");
        lhs.add("C");
        lhs.add("F");
        
         System.out.println(lhs);
    }
}

