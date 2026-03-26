package OOP.InnerClass;
class A{
    int age;
    public void show(){
        System.out.println("In show");
    }
    static class B{// static inner class it only for ineer class not outer class.......
        public void config(){
            System.out.println("in config");
        }

    }
}

public class Demo {
    public static void main(String args[]){

        A obj = new A();
        obj.show();


        A.B obj1 = new A.B();
        obj1.config();
    }
}
