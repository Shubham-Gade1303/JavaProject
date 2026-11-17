
package Nov2026.DSA;

import java.util.*;

public class Permutation {

    public List<List<Integer>> permutation(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        backtrack(nums, new ArrayList<>(), result);

        return result;
    }

    public void backtrack(int[] nums,
                          List<Integer> current,
                          List<List<Integer>> result) {

        // Base condition
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            // Skip already selected elements
            if (current.contains(nums[i])) {
                continue;
            }

            // Choose
            current.add(nums[i]);

            // Explore
            backtrack(nums, current, result);

            // Backtrack
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};

        Permutation obj = new Permutation();

        List<List<Integer>> result = obj.permutation(nums);

        System.out.println(result);
    }
}
