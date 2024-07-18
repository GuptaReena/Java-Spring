package stringoperation;

import java.util.Scanner;

public class StringOperation {
	
	public static void stringConcat(Scanner sc ) {
	
		System.out.println("Enter First Name : " );
		String firstName = sc.next();
		System.out.println("Enter Last Name : ");
		String lastName = sc.next();
		
		String result = firstName.concat(lastName);
		
		System.out.println("Concatenated string: " + result);
	}
	
	public static void stringLength(Scanner sc) {
		
		System.out.println("Enter a Word : ");
		String word = sc.nextLine();
		
		System.out.println("Length of String is :  " + word.length());
	}
	
	public static void StringUpperCase(Scanner sc) {
		System.out.println("Enter a String : ");
		
		String input = sc.next();
		System.out.println("String Upper Case is : " + input.toUpperCase());
		System.out.println("String Upper Case is : " + input.toLowerCase());
	}
	
	public static void subString(Scanner sc ) {
		System.out.println("Enter a String : ");
		String substr = sc.nextLine();
		System.out.println("Enter a StartIndex : ");
		int startIndx = sc.nextInt();
		System.out.println("Enter a EndIndex : ");
		int endIndx = sc.nextInt();
		
		
		String result  = substr.substring(startIndx, endIndx);
		System.out.println("The SubString is : " + result);
		
	}
	
	public static void splitString(Scanner sc) {
		 System.out.println("Enter a string : ");
		 
		 String splitInput = sc.nextLine();
		 System.out.println("Enter a Delimiter : ");
		 String delimiter = sc.nextLine();
		 String[] parts = splitInput.split(delimiter);
		 System.out.println("Split string is : " );
		 for(String part : parts) {
			System.out.println(part); 
		 }
	}
	
	public static void StringReverse(Scanner sc) {
		System.out.println("Enter a String to Reverse : ");
		
		String reverse = sc.next();
		String result = "";
		
		for(int i =0 ; i < reverse.length() ; i++) {
			
			result = reverse.charAt(i) + result;
			
			
		}
		
		System.out.println("Reverse String is : " + result);
	}
	
	
	public static int getValidChoice(Scanner sc) {
		
		int choice = -1;
		
		while(true) {
			try {
				choice = Integer.parseInt(sc.nextLine());
				if(choice >= 1 && choice <= 8) {
					break;
					
				}else {
					System.out.println("Invalid choice. Please Enter number between 1 to 8 : ");
				}
			}catch(NumberFormatException e){
				
				System.out.println("Invalid input. Please enter a valid number: ");
			}
		}
		return choice;
	}
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		char ch = '\0';
		
		do {
		displayMenu();
			int choice = getValidChoice(scanner);
			
			switch(choice) {
			
			case 1 : stringConcat(scanner);
			break;
			
			case 2 :
					stringLength(scanner);
				break;
			case 3 :
					StringUpperCase(scanner);
				break;
			case 4 : 
					subString(scanner);
				break;
			case 5 : 
					splitString(scanner);
				break;
			case 6 :
					StringReverse(scanner);
				break;
			case 7 :
				System.out.println("******************************");
				System.out.println("Exiting program.");
				System.out.println("******************************");
				System.exit(0);
                scanner.close();
			default :
				 System.out.println("Invalid choice. Please try again.");
			}
			System.out.println("Do you want to continue(Y/N) ? ");
		}while((ch = scanner.next().charAt(0)) == 'y');
		System.out.println("*****************************");
		
	}


	private static void displayMenu() {

	
	System.out.println("\nChoose an operation:");
	System.out.println("1. Concatenate two strings");
    System.out.println("2. Find the length of a string");
    System.out.println("3. Convert a string to uppercase");
    System.out.println("4. Convert a string to SubString");
    System.out.println("5. Split a string");
    System.out.println("6. Reverse a string");
    System.out.println("7. Exit");
    System.out.print("Enter your choice: ");

	}
}
	
