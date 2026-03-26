public class SortAr {
        public static void main(String[] args) {
            int[] ar = {1,4,5,2,3,7,6,8,9,10,12,11};

            for(int i=0;i<ar.length;i++){
                for(int j= i+1;j<ar.length;j++){

                    if(ar[i]>=ar[j]){
                        int temp = ar[i];
                        ar[i] = ar[j];
                        ar[j]=temp;
                    }
                }
            }
            System.out.println("After sorting array: ");
                for(int i=0;i<ar.length;i++){
                    System.out.print(ar[i] + " ");

                
            }
        }
}
