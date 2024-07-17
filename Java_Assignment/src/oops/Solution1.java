package oops;

import java.io.*;
import java.math.*;




public class Solution1 {
    public static void main(String[] args) throws IOException {
    	
    	System.out.println("Enter a Number");
    	
    	
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        
       BigInteger bi =  new BigInteger(n);
       
       if(bi.isProbablePrime(1)) {
    	  System.out.println("Prime"); 
       }else {
    	   System.out.println("not prime");
       }
      
        bufferedReader.close();
        
    }
}
