package SeventhFive;

import java.util.Scanner;

public class YearLeaporNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int year ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Year");
		
		year = sc.nextInt();
		
		sc.close();
		
		boolean leap=false;
		
		if(year%4==0)
		{
			
			if(year%100==0)
			{
				
				if(year%400==0)
					
					leap= true;
				
				else
					
					leap=false ;
				}
			
			else
				
				leap=true ;
			
		}
		
		leap=false ;
		
		
		if(leap)
			
			System.out.println("Year is leap");
		
		else
			
			System.out.println("Year is not leap");
		


   }
		 
	}

 
