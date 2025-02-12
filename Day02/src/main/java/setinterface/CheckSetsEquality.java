package setinterface;
import java.util.*;
public class CheckSetsEquality {
    public static <T> boolean areSetsEqual(Set<T> set1, Set<T> set2) {
        return set1.equals(set2);
    }

    public static void main(String[] args) {
        Set<Integer> set1 = Set.of(1, 2, 3, 4, 5);
        Set<Integer> set2 = Set.of(5, 4, 3, 2, 1);
        System.out.println("Are Sets Equal: " + areSetsEqual(set1, set2));
    }

}
