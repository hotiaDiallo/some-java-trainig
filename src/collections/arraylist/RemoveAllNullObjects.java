package collections.arraylist;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class RemoveAllNullObjects {
    public static void main(String[] args) {
        List<Integer> maListe = new java.util.ArrayList<>(List.of(1, 2, 3, 4));
        maListe.add(null);
        maListe.add(null);
        maListe.add(null);
        System.out.println(maListe);


        // while (maListe.remove(null));

        List<Integer> nullInt = maListe.stream().filter(Objects::isNull).collect(Collectors.toList());
        // maListe.removeAll(nullInt);

        maListe.removeIf(Objects::isNull);

        System.out.println(maListe);

    }
}
