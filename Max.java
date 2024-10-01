import java.util.Scanner;
import java.io.*;
class Max{
	public static void main(String args[]){
			int x,y,z;
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter your value:");
			x=sc.nextInt();
			System.out.println("Enter your value:");
			y=sc.nextInt();
			System.out.println("Enter your value:");
			z=sc.nextInt();
			if(x>y && x>z){
				System.out.println("Maximum Value = " + x);
			}
			else if(y>z){
				System.out.println("Maximum Value = " + y);
			}
			else{
				System.out.println("Maximum Value = " + z);
			}
	}
}
