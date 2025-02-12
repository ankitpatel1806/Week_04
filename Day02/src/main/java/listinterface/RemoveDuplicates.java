package listinterface;
import java.util.*;
public class RemoveDuplicates {
    public static <T> List<T> remove(List<T> list) {
        Set<T> seen = new LinkedHashSet<>();
        for (T item : list) {
            seen.add(item);
        }
        return new ArrayList<>(seen);
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(3, 1, 2, 2, 3, 4);
        List<Integer> listWithoutDuplicates = remove(intList);
        System.out.println("List Without Duplicates: " + listWithoutDuplicates);
    }
}
