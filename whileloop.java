import java.util.Scanner;
import java.io.*;
class whileloop{
	public static void main(String args[]){
			int x;
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter your value:");
			x=sc.nextInt();
			int i=1;
			while(i<=x){
				System.out.println(i);
				i++;
			}
			sc.close();

	}
}
