package studio1;

import java.util.Scanner;

public class HiOne {

	/**
	 * Says hello to the supplied argument
	 */
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter your name:");
		String name1 = scan.nextLine();
		System.out.println("Hi " + name1 + "! How are you?");

	}

}
