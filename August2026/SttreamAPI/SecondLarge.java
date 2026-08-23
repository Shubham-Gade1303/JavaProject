package August2026.SttreamAPI;

public class SecondLarge {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int large = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > large) {
                secondLarge = large;
                large = arr[i];
            }
            else if (arr[i] > secondLarge && arr[i] != large) {
                secondLarge = arr[i];
            }
        }

        System.out.println("Large: " + large);
        System.out.println("SecondLarge: " + secondLarge);
    }
}