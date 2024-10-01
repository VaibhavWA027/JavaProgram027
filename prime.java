import java.util.Scanner;
import java.io.*;
class prime{
	public static void main(String args[]){
			int x;
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter your value:");
			x=sc.nextInt();
			int flag=0;
			for(int i=2;i<x/2;i++){
				if( x%i==0){
					flag+=1;
				}
			}
			if(flag==0){
				System.out.println("Prime");
			}
			else{
				System.out.println("Composite");
			}
			

	}
}
