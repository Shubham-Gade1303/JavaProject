package Oct2026;

public class MinimumSumOfsquardDiff {

    public long minSumDiff(int[] nums1, int[] nums2, int k1, int k2) {

        int n = nums1.length;

        int[] diff = new int[n];

        long total = 0;
        int maxDiff = 0;

        int k = k1 + k2;

        // Step 1: Calculate absolute differences
        for (int i = 0; i < n; i++) {

            diff[i] = Math.abs(nums1[i] - nums2[i]);

            total += diff[i];

            maxDiff = Math.max(maxDiff, diff[i]);
        }

        // If all differences can become 0
        if (total <= k) {
            return 0;
        }

        // Step 2: Binary search minimum possible maximum difference
        int left = 0;
        int right = maxDiff;

        while (left < right) {

            int mid = left + (right - left) / 2;

            long required = 0;

            for (int d : diff) {

                if (d > mid) {
                    required += d - mid;
                }
            }

            if (required <= k) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        // Step 3: Reduce differences greater than left
        for (int i = 0; i < n; i++) {

            if (diff[i] > left) {

                k -= diff[i] - left;

                diff[i] = left;
            }
        }

        // Step 4: Use remaining operations
        for (int i = 0; i < n && k > 0; i++) {

            if (diff[i] == left) {

                diff[i]--;
                k--;
            }
        }

        // Step 5: Calculate sum of squares
        long answer = 0;

        for (int d : diff) {

            answer += (long) d * d;
        }

        return answer;
    }

    public static void main(String[] args) {

        MinimumSumOfsquardDiff obj = new MinimumSumOfsquardDiff();

        int[] nums1 = {1, 4, 10, 12};
        int[] nums2 = {5, 8, 6, 9};

        int k1 = 1;
        int k2 = 1;

        long result = obj.minSumDiff(nums1, nums2, k1, k2);

        System.out.println("Minimum Sum of Squared Difference = " + result);
    }
}