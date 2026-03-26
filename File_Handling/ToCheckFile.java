import java.io.*;
public class ToCheckFile{
	public static void main(String[] args){
		File file = new File("C:\Users\gadep\Desktop\java_practice\File_Handling\test1.txt");
		
			if(file.createNewFile()){
				System.out.println("File is created ");
			}else{
			System.out.println("File is already exist..");
			}
	}
}