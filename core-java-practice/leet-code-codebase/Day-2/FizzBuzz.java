
import java.util.*;

public class FizzBuzz {
    public static void main(String[] args) {
        int n = 15;

        List<String> ans = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                ans.add("FizzBuzz");
            } else if (i % 3 == 0) {
                ans.add("Fizz");
            } else if (i % 5 == 0) {
                ans.add("Buzz");
            } else {
                ans.add(String.valueOf(i));
            }
        }

        System.out.println(ans);
    }
}