package Sep2026.DSA;
import java.util.*;
public class zooCount {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();

            int zCount =0;
            int oCount=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i) == 'z'){
                    zCount++;
                }else if(s.charAt(i) == 'o'){
                    oCount++;
                }
            }

            if(oCount == 2 *zCount){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
}
