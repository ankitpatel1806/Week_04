package mapinterface;
import java.util.*;

public class FindKeyWithMaxValue {

    public String findKeyWithMaxValue(Map<String, Integer> inputMap) {
        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;


        for (Map.Entry<String, Integer> entry : inputMap.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        return maxKey;
    }

    public static void main(String[] args) {

        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("A", 10);
        inputMap.put("B", 20);
        inputMap.put("C", 15);

        FindKeyWithMaxValue finder = new FindKeyWithMaxValue();
        String keyWithMaxValue = finder.findKeyWithMaxValue(inputMap);

        System.out.println("Key with maximum value: " + keyWithMaxValue);
    }
}
