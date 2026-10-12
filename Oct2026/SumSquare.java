package Oct2026;

public class SumSquare {
    public int sumOfSpecialNumSqr(int[] num) {

        int sum = 0;
        int size = num.length;

        for (int i = 0; i < size; i++) {
            int pos = i + 1;

            if (size % pos == 0) {
                sum += num[i] * num[i];
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        int[] num = {1, 2, 3, 4};

        SumSquare obj = new SumSquare();

        int result = obj.sumOfSpecialNumSqr(num);

        System.out.println(result);
    }
}
