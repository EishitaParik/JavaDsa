import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Integer[] nums = {1, 2, 2, 3, 4, 4, 5};
        Set<Integer> set = new LinkedHashSet<>(Arrays.asList(nums));
        System.out.println(set); // [1, 2, 3, 4, 5]
    }
}
