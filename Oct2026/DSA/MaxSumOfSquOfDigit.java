
package Oct2026.DSA;
public class MaxSumOfSquOfDigit{
    public String maxSumOfSqu(int num, int sum){

        if(sum > 9 * num){
            return "";

        }

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<num;i++){
        int digit = Math.min(9, sum);

        sb.append(digit);
        sum -= digit;
        }
        return sb.toString();


    }


    public static void main(String[] args){

        int num = 2;
        int sum =3;


        MaxSumOfSquOfDigit obj = new MaxSumOfSquOfDigit();
        String result = obj.maxSumOfSqu(num, sum);

        System.out.println(result);

    }
}