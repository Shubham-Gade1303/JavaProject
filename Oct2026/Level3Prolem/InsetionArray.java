package Oct2026.Level3Prolem;

public class InsetionArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 6, 7, 8, 9, 0};

        int n = 10;       // Current number of elements
        int index = 2;    // Position where we want to insert
        int value = 20202;

        // Shift elements to the right
        for (int i = n; i > index; i--) {
            arr[i] = arr[i - 1];
        }

        // Insert new value
        arr[index] = value;

        // Increase size
        n++;

        // Print array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}