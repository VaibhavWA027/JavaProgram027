import java.util.Scanner;
import java.io.*;
class Fibo1{
	public static void main(String args[]){
			int x;
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter your value:");
			x=sc.nextInt();
			int num1=0;
			int num2=1;
			System.out.println("The fibonnaci series:"+"\n"+num1+"\n"+num2);
			for(int i=2;i<x;i++){
				int num3= num1+num2;
				System.out.printf("%d\n",num3);
				num1=num2;
				num2=num3;
			}
			

	}
}
