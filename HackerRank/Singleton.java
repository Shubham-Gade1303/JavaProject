package HackerRank;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.io.*;
import java.lang.reflect.*;

class single{
    public String str;

    public static single instance;

    private single(){
        str = "Hello I am a singleton! Let me say ";

    }
    public static single getSingleInsstance(){
        if(instance ==null){
            instance = new single();
        }
        return instance;
    }


}


public class Singleton {
    public static void main(String []args)throws Exception{
    Scanner sc = new Scanner(System.in);
    single s1 = single.getSingleInsstance();
    single s2 = single.getSingleInsstance();


    assert(s1==s2);


    Class c = s1.getClass();
    Constructor[] allConstructors= c.getDeclaredConstructors();
    assert allConstructors.length==1;
    for(Constructor ctor : allConstructors){
        if(ctor.getModifiers()!=2 || !ctor.toString().equals("priavte Single(")){
            System.out.println("Wrong Class");
        }
    }
    String str = sc.nextLine();
    s1.str=str;
    s2.str=str;
    System.out.println("Hello i am a singleton!  let me say"+ str+ "to you");


    }
}
