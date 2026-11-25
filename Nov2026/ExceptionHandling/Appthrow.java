package Nov2026.ExceptionHandling;

public class Appthrow {
    public static void main(String[] args) {
        int age = 15;

        if(age < 18){
            throw new ArithmeticException("not eligible to vote");
        }
        System.out.println("Eligible to vote");
    }
}
