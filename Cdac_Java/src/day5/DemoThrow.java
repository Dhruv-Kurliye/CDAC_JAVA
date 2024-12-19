package day5;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class DemoThrow {
	
	public static void checkfile(String path) throws IOException{
		File f = new File(path);
		if(!f.exists()) {
			throw new IOException("File is not present");
		}
	}
		public static void numCheck() throws IOException{
			    int num;
			    System.out.println("Enter number: ");
			    Scanner sc = new Scanner(System.in);
			    num=sc.nextInt();
				if (num>1000) {
					throw new IOException("Number to big!");
				}
		}
		
	
	public static void main(String[] args) {
//		try {
//			File f = new File("data.txt");
//			if(!f.exists())
//				throw new IOException("File is not present");
//		}		
//		 catch (IOException e){
//			 System.out.println(e.getMessage());
//		 }
			try {
				numCheck();
			}
			catch(IOException e){
				System.out.println(e.getMessage());
				
			}		
		 }
}
