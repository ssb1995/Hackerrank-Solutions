import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BirthdayCakeCandles {
    public static void main(String[] args) {
        List<Integer> candles = new ArrayList<Integer>();
        candles.add(4);
        candles.add(4);
        candles.add(1);
        candles.add(2);
        System.out.println(birthdayCakeCandles(candles));
    }

    public static int birthdayCakeCandles(List<Integer> candles) {

        // Write your code here

        Map<Integer, Integer> candleMap = new HashMap<>();

        for (Integer i : candles) {
            if (i != null && candleMap.containsKey(i)) {
                candleMap.put(i, candleMap.get(i) + 1);
            } else {
                candleMap.put(i, 1);
            }
        }

        Integer max = 0;
        for (Map.Entry<Integer, Integer> entry : candleMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
            if (entry.getValue() > max) {
                max = entry.getValue();
            }
        }

        return max;

    }
}