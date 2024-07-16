package oops;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n =8;
		int sum =0;
		for(int i =1 ; i <= n;i++) {
			
			if(n % i == 0) {
				System.out.println(i);
				sum += i;
				
			}
			
		}
		
		System.out.println(sum);
		
	}

}
