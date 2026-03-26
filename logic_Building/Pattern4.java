package logic_Building;

public class Pattern4 {
   
    public static void main(String[] args) {
        int rows = 5; // You can change this for more rows

        for (int i = 0; i < rows; i++) {
            // Print leading spaces
            for (int s = rows; s > i; s--) {
                System.out.print("  ");
            }

            // Print descending numbers
            for (int j = i; j >= 0; j--) {
                System.out.print(j + " ");
            }

            // Print ascending numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Move to next line
            System.out.println();
        }
    }
}


