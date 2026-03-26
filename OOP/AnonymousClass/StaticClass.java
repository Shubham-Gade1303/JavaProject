public class StaticClass{

    static class Nested{
        public static void print(){
            System.out.println("I am from nested clas");
        }
    }
    public static void main(String []args){
        Nested.print();
    }
}// this is the static java static class in