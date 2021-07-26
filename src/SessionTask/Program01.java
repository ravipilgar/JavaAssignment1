package SessionTask;

import java.util.Scanner;

public class Program01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check palindrome: ");
		int number = sc.nextInt();
		
		int origin_number = number;
		int reverse_number = 0, remainder;
		
		while (number != 0) {
		      remainder = number % 10;
		      reverse_number = reverse_number * 10 + remainder;
		      number /= 10;
	    }
		
		if (origin_number == reverse_number)
			System.out.println("Number "+origin_number+" is Palindrome");
	    else
			System.out.println("Number "+origin_number+" is not Palindrome");

	}

}
