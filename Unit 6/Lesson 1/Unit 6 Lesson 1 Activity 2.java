import java.util.Scanner;

public class U6_L1_Activity_Two {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] h = new int[11];

            h[0] = 0;
            h[1] = h[0] + 1;
            h[2] = h[1] + 2;
            h[3] = h[2] + 3;
            h[4] = h[3] + 4;
            h[5] = h[4] + 5;
            h[6] = h[5] + 6;
            h[7] = h[6] + 7;
            h[8] = h[7] + 8;
            h[9] = h[8] + 9;
            h[10] = h[9] + 10;

            int i = scanner.nextInt();
            if (i >= 0 && i <= 10)
                System.out.println(h[i]);
        }
    }
}