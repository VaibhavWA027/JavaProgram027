import java.io.*;
import java.util.Scanner;

class Box{
    double width;
    double length;
    double depth;
}

class BoxDemo
{
	public static void main(String[] args) {
		Box mybox = new Box();
		double vol;
		mybox.width=10;
		mybox.length=20;
		mybox.depth=30;
		vol = mybox.width*mybox.length*mybox.depth;
		System.out.println(vol);
		
	}
}
