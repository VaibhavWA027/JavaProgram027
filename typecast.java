Conversation opened. 1 unread message.

Skip to content
Using BMS College of Engineering Mail with screen readers
10 of 427
(no subject)
Inbox

Vaibhav Kumar <vaibhavkumar.cs23@bmsce.ac.in>
Attachments
Oct 8, 2024, 7:33 AM (1 day ago)
to me


 3 Attachments
  •  Scanned by Gmail
import java.util.Scanner;
import java.io.*;
class typecast{
	public static void main(String[] args){
		int a;
		System.out.println("Enter Your Integer:");
		Scanner sc =new Scanner(System.in);
		a=sc.nextInt();
		short b;
		byte c;
		double d;
		System.out.println("Original Integer = " + a);
		b=(short)a;	
		c=(byte)a;
		d=(double)a;
		System.out.println("Original Integer " + a + " is turned into short datatype=" + b);
		System.out.println("Original Integer " + a + " is turned into byte datatype=" + c);
		System.out.println("Original Integer " + a + " is turned into double datatype=" + d);
		double x;
		System.out.println("Enter Your Double:");
		x=sc.nextDouble();
		int i= (int)x;
		byte j= (byte)x;
		System.out.println("Original Double " + x + " is turned into int datatype=" + i);
		System.out.println("Original Double " + x + " is turned into byte datatype=" + j);
	}
}
typecast.java.txt
Displaying typecast.java.txt.
