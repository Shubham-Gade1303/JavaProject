    package Nov2026.ExceptionHandling;

    public class tryCatchFinally{

        public static void main(String[] args){
            try{
                int result = 10 / 0;

            }catch (ArithmeticException e){
                System.out.println("Divison by zero is not Allow");
            }
            finally{
                System.out.println("Finally block Execute always ");
            }
        }
    }