package Basic;

import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a year to verify: ");
		int year=sc.nextInt();
		boolean is_leap_year=false;
		if(year % 4==0) {
			is_leap_year=true;
		if(year % 100==0) {
			is_leap_year=true;
			if(year % 400==0)
				is_leap_year=true;   
			else
				is_leap_year=false;
		}
	}
	else
 // Flag dealing-  Non leap-year
    is_leap_year = false;
	if (!is_leap_year)
	System.out.println(year + " : Non Leap-year");
	else
	System.out.println(year + " : Leap-year");
			
				}
	}


