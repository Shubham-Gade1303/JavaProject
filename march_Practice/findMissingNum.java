package march_Practice;

public class findMissingNum {
    public static void main(String[] args){
        int[] arr ={1,2,4,5};
        int n = arr.length+1;

        int exp = n*(n+1)/2;
        int act = 0;
        for(int i=0;i<arr.length;i++){
            act = act + arr[i];
        }
        int missing = exp - act;
        System.out.println(missing);
    }
}
