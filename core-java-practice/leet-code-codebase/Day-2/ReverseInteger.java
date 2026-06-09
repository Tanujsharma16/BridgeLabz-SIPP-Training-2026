
public class ReverseInteger {
    public static void main(String[] args) {
        int x = 123;

        int rev = 0;

        while (x != 0) {
            int digit = x % 10;
            x /= 10;

            // Overflow check
            if (rev > Integer.MAX_VALUE / 10 ||
               (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
                rev = 0;
                break;
            }

            // Underflow check
            if (rev < Integer.MIN_VALUE / 10 ||
               (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
                rev = 0;
                break;
            }

            rev = rev * 10 + digit;
        }

        System.out.println(rev);
    }
}