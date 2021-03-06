import java.util.Scanner;

public class Main {

    // thanks to: https://hyperskill.org/learn/daily/2727#solutions-593416
    public static long power(int n, int m) {
        return m == 0 ? 1 : n * power(n, m - 1);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();
        System.out.println(power(n, m));
    }
}