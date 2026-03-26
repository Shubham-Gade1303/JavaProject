public class StringComparision{
	public static void main(String args[]){

String s1 = "Shubham"; 
String s2 = "Shubham";

String s3 = "shubham";
String s4 = "sampada";

String s5 = new String("sampada");
String s6 = new String("shubham");
System.out.println(s1==s2); // true
System.out.println(s2==s3);//  true
System.out.println(s5==s6);// false
System.out.println(s4==s5);// true

System.out.println(s1.equals(s2));//  true
System.out.println(s4.equals(s5));//  true 


true
false
false
false
true
true

	}
}