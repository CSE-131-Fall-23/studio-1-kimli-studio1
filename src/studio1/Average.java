package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("The first of two integeres to be averaged:");
		int int1 = in.nextInt();
		System.out.println("The second of two integeres to be averaged:");
		int int2 = in.nextInt();
		System.out.println((int1 + int2) / 2);
	}

}
