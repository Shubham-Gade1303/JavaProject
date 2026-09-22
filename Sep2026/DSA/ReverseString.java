
    package Sep2026.DSA;

    public class ReverseString{
        public void revString(char[] s){
            int left =0;
            int right = s.length-1;
            while(left< right){
                char temp = s[left];
                s[left] = s[right];
                s[right] = temp;
                left++;
                right--;
            }
        }
        public static void main(String[] args){
            char[] s = {'h','e','l','l','o'};
            ReverseString obj = new ReverseString();
            obj.revString(s);
            System.out.print(s);

        }
    }