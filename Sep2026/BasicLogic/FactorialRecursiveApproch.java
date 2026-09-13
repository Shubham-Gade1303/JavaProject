package Sep2026.BasicLogic;

    public class FactorialRecursiveApproch{
        public static void main(String[] args) {
            int num =5;
            long result = calculate(num);
            System.out.println(num + " is "+ result);
        }

        public static long calculate(int n){
            if(n <=1){
                return 1;
            }
            return  n *calculate(n-1);
        }
    }