package oops;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Line :");
		
		int count = 1;
		while(sc.hasNext() == true) {
			
			String ns = sc.nextLine();
			
			System.out.println(count + " " + ns);
			count++;
			
			
		}
		
		
		
		
	}

}
