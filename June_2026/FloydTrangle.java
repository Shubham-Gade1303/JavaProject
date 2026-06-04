package June_2026;

public class FloydTrangle {
    public static void main(String[] args) {

        int num =1;
        for(int i =0;i<=4;i++){
            for(int j =1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
