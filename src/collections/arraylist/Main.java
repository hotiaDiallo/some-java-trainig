package collections.arraylist;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> maListe = new ArrayList<>(Arrays.asList(1,2,3,4));
        Iterator<Integer> iterator = maListe.iterator();
        iterator.forEachRemaining(System.out::println);
        ListIterator<Integer> listIterator = maListe.listIterator(maListe.size());
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

        // convert an Iterator to List
        Iterator<Integer> myIterator = Arrays.asList(1,2,3,4,5,6).iterator();
        List<Integer> myList = new ArrayList<>();
        myIterator.forEachRemaining(myList::add);
        System.out.println(myList);
    }
}
