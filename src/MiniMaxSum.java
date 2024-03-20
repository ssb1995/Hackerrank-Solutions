import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MiniMaxSum {
    public static void main(String[] args) {
        List<Integer> candles = new ArrayList<Integer>();
        //539674108 549382170 270968351 746219035 140597628

        //793810624 895642170 685903712 623789054 468592370
        candles.add(793810624);
        candles.add(895642170);
        candles.add(685903712);
        candles.add(623789054);
        candles.add(468592370);
        System.out.println(miniMaxSum(candles));
    }

    public static String miniMaxSum(List<Integer> arr) {
        // Write your code here
        long sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int x : arr){
            sum += x;
            if(x > max){
                max = x;
            }
            if(x < min){
                min = x;
            }
        }
        return (sum - max) + " " + (sum - min);
    }
}