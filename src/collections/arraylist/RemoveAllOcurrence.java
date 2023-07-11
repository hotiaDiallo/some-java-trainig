package collections.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RemoveAllOcurrence {
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        init(liste);
        System.out.println("After init: " + liste);
        removeUsingRemoveIf(liste, 1);
        System.out.println("After removeUsingRemoveIf" + liste);
        init(liste);
        System.out.println("After init: " + liste);
    }
    static void init(List<Integer> liste){
        liste.add(1);
        liste.add(1);
        liste.add(2);
        liste.add(3);
        liste.add(3);
        liste.add(4);
    }

    static void removeUsingRemoveIf(List<Integer> liste, Integer element){
        liste.removeIf(el -> Objects.equals(el, element));
    }


}
