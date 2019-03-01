package pullpush;

import java.util.Scanner;

public class palindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		String original  , reverse="" ;
		
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the String " );
		original = sc.nextLine() ;
		
		for(int i=original.length()-1 ; i>=0 ; i-- )
			reverse = reverse+original.charAt(i) ;
		
		if(original.equals(reverse))
			
			System.out.println("String is palindrome1");
		else
			
			System.out.println("String is not palindrome2");
		 
			
		
		
		

	   }
	}