package setinterface;
import java.util.*;
public class FindSubsets {
    public static <T> Set<Set<T>> findSubsets(Set<T> set) {
        Set<Set<T>> subsets = new HashSet<>();
        List<T> list = new ArrayList<>(set);
        int n = list.size();
        for (int i = 0; i < (1 << n); i++) {
            Set<T> subset = new HashSet<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    subset.add(list.get(j));
                }
            }
            subsets.add(subset);
        }
        return subsets;
    }

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Set<Integer>> subsets = findSubsets(set);
        System.out.println("Subsets: " + subsets);
    }
}
