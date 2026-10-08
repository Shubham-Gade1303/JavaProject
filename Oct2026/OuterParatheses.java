
    package Oct2026;

    public class OuterParatheses{
        public static String removeOuterParenthesis(String s){
            StringBuilder sb = new StringBuilder();
            int depth =0;

            for(char ch : s.toCharArray()){
                if(ch == '('){
                    if(depth >0){
                      sb.append(ch);
                    }
                    depth++;;
                }else{
                    depth--;

                    if(depth>0){
                        sb.append(ch);
                    }
                }
            }
            return sb.toString();
        }


        public static void main(String[] args){
            String s = "(()())(())";


          String result = removeOuterParenthesis(s);
          System.out.println(result);
        }
    }