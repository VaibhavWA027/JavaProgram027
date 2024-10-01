import java.util.Scanner;
import java.io.*;
class factorial{
	public static void main(String args[]){
			int x;
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter your value:");
			x=sc.nextInt();
			if(x==0){
				System.out.println(1);
			}
			int fact=1;
			for(int i=1;i<=x;i++){
				fact*=i;
			}
			System.out.println(fact);

	}
}
