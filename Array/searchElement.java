public class searchElement {
    public static void main(String args[]){
        int[] ar = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        int target =21;

        for(int i=0;i<ar.length;i++){
            if(ar[i] == target){
                System.out.println("Tartget in array : " +target );
                return;
            }
        }
        System.out.println("not found in array : "+ target);
    }
}
