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
public class Linked_List {
    //implementuje rozhrani List, Deque, Queue a Collections
    void Ukazka_LinkeList() {
        LinkedList<String> ll = new LinkedList<>();
        
        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        //addLast (pridani prvku na konec seznamu)
        ll.addLast("Z");
        //addFirst (pridani prvku na zacatek seznamu)
        ll.addFirst("A");
        ll.add(1, "A2");
        System.out.println("Puvodni obsah spojoveho seznamu ll: " + ll);
        //remove (funguje stejne jako v ArraList()
        ll.remove("F");
        ll.remove(2);
        System.out.println("Obsah spojoveho seznamu ll po vymazu: " + ll);
        //removeFirst (odstrani prvni prvek ze seznamu)
        ll.removeFirst();
        //removeLast (odstrani posledni prvek ze seznamu)
        ll.removeLast();
        System.out.println("Spojovy seznam ll po vymazu prvniho a posledniho prvku: " + ll);
        //get (Ziska nam prvek na pozici 2)
        String val = ll.get(2);
        //set (nastavi vybrany prvek na nami zadanou pozici)
        ll.set(2, val + " zmeneno");
        System.out.println("Spojovy seznam ll po zmene: " + ll);
        //element (vraci prvek nachazejici se na zacatku seznamu)
        System.out.println("Element: " + ll.element());
        //offer (snazi se pridat prvek do seznamu)
        if (ll.offer("D")) System.out.println("Offer se povedl\nNovy obsah: " + ll);
        else System.out.println("Offer se nepovedl");
        //peek (vraci prvek nachazejici se na zacatku seznamu, je-li fronta prazdna vraci null)
        System.out.println("Peek: " + ll.peek());
        //poll (vraci prvni prvek v seznamu a nasledne ho i odstrani)
        System.out.println("Poll: " + ll.poll() + "\nObsah po poll: " + ll);
        //remove() (stejne jako poll, pokud je prazdny vraci vyjimku
        System.out.println("Remove: " + ll.remove() + "\nObsah po remove: " + ll);
        //getFirst (vraci prvni prvek)
        System.out.println("getFirst: " + ll.getFirst());
        //getLast (vraci posledni prvek)
        System.out.println("getLast: " + ll.getLast());
        //offerFirst (snazi se pridat prvek na zacatek seznamu)
        ll.offerFirst("Kopyto");
        //offerLast (snazi se pridat prvek na konec seznamu)
        ll.offerLast("konec");
        System.out.println("Obsah po offerFirst a Last: " + ll);
        //pop (vraci prvni prvek a odstranuje ho)
        System.out.println("Pop: " + ll.pop() + " Obsah po pop: " + ll);
        //push (pridava prvek na zacatek seznamu)
        ll.push("Start");
        System.out.println("Obsah po push: " + ll);
        //removeFirstOccurrence (odstranuje prvni vyskyt zadaneho objektu)
        ll.removeFirstOccurrence("C");
        System.out.println("Obsah po remFirstOccu: " + ll);
        //removeLastOccurrence (odstranuje posledni vyskyt zadaneho objektu)
        ll.removeLastOccurrence("konec");
        System.out.println("Obsah po remLastOccu: " + ll);
    }
}
