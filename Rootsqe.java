import java.util.Scanner;
import java.io.*;

public class Rootsqe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter coefficient a: ");
        double a = sc.nextDouble();
        
        System.out.print("Enter coefficient b: ");
        double b = sc.nextDouble();
        
        System.out.print("Enter coefficient c: ");
        double c = sc.nextDouble();

	if(a==0){
		System.out.println("Not a Quadratic Equation");
	}
	else{
		double discriminant = (b*b) - (4*a*c);

    if (discriminant > 0) {
      double root1 = (-b + Math.sqrt(discriminant)) / (2*a);
      double root2 = (-b - Math.sqrt(discriminant)) / (2*a);
      System.out.printf("There are two real solutions: x1 = %.2f, x2 = %.2f%n", root1, root2);
    }
		else if (discriminant == 0) {
      double root = -b / (2*a);
      System.out.printf("There is one real solution: x = %.2f%n", root);
    }
		else {
 
      System.out.println("There are no real solutions.");
    }
        
  }
}
