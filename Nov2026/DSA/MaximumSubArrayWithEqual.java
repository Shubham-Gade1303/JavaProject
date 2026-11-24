package Nov2026.DSA;

public class MaximumSubArrayWithEqual {
    public int maxLength(int[] nums) {
        int n = nums.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            long product = 1;
            long gcd = 0;
            long lcm = 1;

            for (int j = i; j < n; j++) {
                product *= nums[j];

                gcd = gcd(gcd, nums[j]);

                lcm = lcm(lcm, nums[j]);

                if (product == gcd * lcm) {
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }

        return ans;
    }

    private long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }


    


    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 1, 2, 1, 1, 1};


        MaximumSubArrayWithEqual obj = new MaximumSubArrayWithEqual();
        int result = obj.maxLength(nums);
        System.out.print(result);
    }
}
