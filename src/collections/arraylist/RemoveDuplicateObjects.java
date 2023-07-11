package collections.arraylist;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicateObjects {

    public static void main(String[] args) {
        List<Integer> withDuplicate = List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 9, 9, 8);
        // List<Integer> withoutDuplicate = new ArrayList<>(new LinkedHashSet<>(withDuplicate));

        // Using Java 8

        List<Integer> withoutDuplicate = withDuplicate.stream().distinct().collect(Collectors.toList());

        System.out.println(containDuplicate(withDuplicate));

        System.out.println(containDuplicate(withoutDuplicate));
    }

    static boolean containDuplicate(List<Integer> liste){
        Map<Integer, Integer> map = new HashMap<>();
        if(liste == null || liste.isEmpty())
            return false;
        for(Integer value: liste){
            if(map.containsKey(value)){
                map.put(value, map.get(value) + 1);
            }else{
                map.put(value, 1);
            }
        }
        for(Integer key: map.keySet()){
            if(map.get(key) > 1){
                return true;
            }
        }
        return false;
    }

}
