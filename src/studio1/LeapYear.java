package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What year it is: ");
		int year = in.nextInt(); 
		
		boolean isLeapyear = year%4 == 0 && year%100 > 0 || year%400 == 0;
		System.out.println(isLeapyear);
	}

}
