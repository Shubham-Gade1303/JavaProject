package Nov2026.LogicalProgramming;

import java.util.function.Consumer;

class Demo{
void show(String name){
    System.out.println(name);
}
}
public class InstanceMethodReference {
    

    public static void main(String[] args) {

        Demo d = new Demo();
        Consumer<String> p = d::show;
        p.accept("Shubham");
        
    }
}
