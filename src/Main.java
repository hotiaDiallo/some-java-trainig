import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Integer [] ints = {1, 2, 3, 4};
        List<Integer> integersList = new ArrayList<>(Arrays.asList(ints));
        List<Integer> integersList2 = new ArrayList<>(Arrays.asList(6,7,8,9));
        /*
        System.out.println(integersList);

        integersList.addAll(integersList2);

        System.out.println(integersList);*/

        integersList.stream()
                .filter(e -> e < 1)
                .forEachOrdered(integersList2::add);

        System.out.println(integersList);

        Optional.ofNullable(integersList).ifPresent(integersList2::addAll);

    }
}