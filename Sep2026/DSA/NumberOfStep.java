package Sep2026.DSA;
import java.util.*;

public class NumberOfStep {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        int answer = Integer.MAX_VALUE;

        
        int minA = a[0];

        for (int i = 1; i < n; i++) {
            minA = Math.min(minA, a[i]);
        }

        for (int target = 0; target <= minA; target++) {

            int steps = 0;
            boolean possible = true;

            for (int i = 0; i < n; i++) {

            
                if (b[i] == 0) {

                    if (a[i] != target) {
                        possible = false;
                        break;
                    }

                } else {

                    int difference = a[i] - target;

                    if (difference % b[i] != 0) {
                        possible = false;
                        break;
                    }

                    steps += difference / b[i];
                }
            }

            if (possible) {
                answer = Math.min(answer, steps);
            }
        }

        if (answer == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(answer);
        }

        sc.close();
    }
}