package listinterface;
import java.util.*;
public class ReverseList {
    public static <T> List<T> reverse(List<T> list) {
        List<T> reversedList = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        return reversedList;
    }
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> reversedList = reverse(intList);
        System.out.println("Reversed List: " + reversedList);
    }
}

