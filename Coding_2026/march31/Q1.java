package March_2026.march31;
public class Q1{
    public static void main(String[] args) {
        int[] arr = {10,5,20,8};

        int max =arr[0];
        int secondma=arr[0];
        for(int num : arr){
            if(num > max){
                secondma = max;
                max=num;
            }
            else if(num > secondma && num != max){
                secondma = num;
            }
        }
        System.out.println("Second higetst max: "+ secondma);
    }
}