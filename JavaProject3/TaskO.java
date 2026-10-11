import java.util.Scanner;

public class TaskO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x == 0) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}