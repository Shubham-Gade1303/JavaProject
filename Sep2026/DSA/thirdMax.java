package Sep2026.DSA;

import java.util.Scanner;

public class thirdMax {
    public int thirdmax(int[] nums) {
    long first = Long.MIN_VALUE;
    long second = Long.MIN_VALUE;
    long third = Long.MIN_VALUE;

    for (int num : nums) {
        if (num == first || num == second || num == third) {
            continue;
        }

        if (num > first) {
            third = second;
            second = first;
            first = num;
        } else if (num > second) {
            third = second;
            second = num;
        } else if (num > third) {
            third = num;
        }
    }

    if (third == Long.MIN_VALUE) {
        return (int) first;
    }
    return (int) third;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        System.out.print("Enter elements: ");
        for(int i=0;i<size;i++){
            nums[i] = sc.nextInt();
        }

        thirdMax obj = new thirdMax();
        System.out.println(obj.thirdmax(nums));

    }
}
