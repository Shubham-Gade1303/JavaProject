    package June_2026;
    import java.util.*;

import javax.sound.midi.SysexMessage;


    public class TwoSum{
        public static void main(String[] args) {
            Scanner sc =  new Scanner(System.in);
            System.out.print("Enter size: ");
            int size = sc.nextInt();

            int[] arr = new int[size];
            
            System.out.print("Enter Array : ");
            for(int i=0;i<size;i++){
                arr[i] = sc.nextInt();
            }

            System.out.print("Enter target: ");
            int target = sc.nextInt();
            boolean found = false;

            for(int i=0;i<arr.length;i++){
                for(int j= i+1;j<arr.length;j++){
                    if(arr[i] + arr[j] == target){

                        System.out.print("Found : "+ arr[i] +" + " + arr[j]+ " = " + target);
                        found = true;
                        break; 
                    }    
                }  
                 if(found){
                break;
                }
            }
           
                if(!found){
                    System.out.println("Not Found:    ");
             }
        }
    }