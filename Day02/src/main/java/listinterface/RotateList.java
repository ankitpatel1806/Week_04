package listinterface;
import java.util.*;
public class RotateList {
    public static <T> List<T> rotate(List<T> list, int positions) {
        int size = list.size();
        positions = positions % size;  // Handle case where positions > size
        List<T> rotatedList = new ArrayList<>();
        for (int i = positions; i < size; i++) {
            rotatedList.add(list.get(i));
        }
        for (int i = 0; i < positions; i++) {
            rotatedList.add(list.get(i));
        }
        return rotatedList;
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(10, 20, 30, 40, 50);
        List<Integer> rotatedList = rotate(intList, 2);
        System.out.println("Rotated List: " + rotatedList);
    }
}
