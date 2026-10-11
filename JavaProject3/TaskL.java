
import java.util.Scanner;

public class TaskL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        int b = 1;

        while (a > 0) {
            sum += (a % 10) * b;
            b *= 2;
            a /= 10;
        }

        System.out.println(sum);
    }
}

