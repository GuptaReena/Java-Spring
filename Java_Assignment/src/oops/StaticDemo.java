package oops;

import java.util.Scanner;

public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 100;
		String s = Integer.toString(n);
		
		System.out.println(s);
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a breadth:");
		int breadth =  sc.nextInt();
		
		System.out.println("Enter Height:");
		int height = sc.nextInt();
		
		if(breadth <= 0 || height <=0) {
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}else {
			int area = breadth*height;
			System.out.println(area);
		}
	}

}
