package collections.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningList {
    // To partion a list we can use partitioningBy or groupingBy from Collectors
    public static void main(String[] args) {
        List<Integer> intList = List.of(1,2,3,4,5,6,7,8,9);

        // Map<Boolean, List<Integer>> parttitions = intList.stream().collect(Collectors.partitioningBy(s->s>5));
        Map<Integer, List<Integer>> groups = intList.stream().collect(Collectors.groupingBy(s -> (s -1) / 3));
        List<List<Integer>> subsets = new ArrayList<>(groups.values());

        System.out.println(subsets);


    }
}
