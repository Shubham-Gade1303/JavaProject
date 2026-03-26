public class CountVowels {
    public static void main(String rags[]){
        String s = "welcometomumbai";

        char ch[] = s.toCharArray();
        int count =0;

        for(int i=0;i<ch.length;i++){
         char c = ch[i];
         if((c>='a' && c<='z') || (c>='A' && c<='Z')){
                if((c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u' || c=='A'|| c== 'E'|| c=='I'|| c=='O'|| c=='U')){
                    count++;
                }
            }
        }
        System.out.println("count of Vowel: "+ count);
    }
}
