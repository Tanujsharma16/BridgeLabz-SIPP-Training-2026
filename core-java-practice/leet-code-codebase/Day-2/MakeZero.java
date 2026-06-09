public class MakeZero {
    public static void main(String[] args) {
        int num = 14;

        int steps = 0;

        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
            steps++;
        }

        System.out.println(steps);
    }
}
