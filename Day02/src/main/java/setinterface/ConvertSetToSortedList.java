package setinterface;
import java.util.*;

public class ConvertSetToSortedList {
    public static <T extends Comparable<T>> List<T> convertToSortedList(Set<T> set) {
        List<T> sortedList = new ArrayList<>(set);
        Collections.sort(sortedList);
        return sortedList;
    }

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Arrays.asList(5, 3, 9, 1));
        List<Integer> sortedList = convertToSortedList(set);
        System.out.println("Sorted List: " + sortedList);
    }
}
