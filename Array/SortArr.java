public class SortArr{
    public static void main(String args[]){
        int[] arr = {2,1,3,5,4};


        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
               

                if(arr[i]>=arr[j]){
                  int temp = arr[i];
                  arr[i]= arr[j];
                  arr[j]= temp;
                }
            }

          
        }
          System.out.println("After sorted :");
            for(int k=0;k<arr.length;k++){
                System.out.print(arr[k]+ " ");
            }
    }
}