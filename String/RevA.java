import java.util.*;
public class RevA{
	
	public static void main(String []args){
		String str = "java is good";
		String[] word = str.split(" ");
		String rev = " ";
		
		for(int i= word.length-1;i>=0;i--){
		rev = rev + word[i]+" ";
		}
		
		System.out.print("First rev: "+ rev);
		
		System.out.println();
		
		String[] word2 = rev.trim().split(" ");
		
		String org =" ";
		
		for(int j =word2.length-1;j>=0;j--){
			org = org + word2[j]+" ";
		}
		System.out.print("orignal : "+ org);
		
		
	}
}