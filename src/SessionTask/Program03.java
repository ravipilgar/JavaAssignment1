package SessionTask;

import java.util.Scanner;

public class Program03 {

	public static void main(String[] args) {
		int array_length = 5;
		int number[] = new int[array_length];
		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 integers to be sorted: ");
		
		for(int i=0; i<array_length;i++) {
			num = sc.nextInt();
			number[i] = num;
		}
		
		for(int i=0; i<array_length-1;i++) {
			
			for(int j=0; j<array_length-i-1;j++) {
				
				if(number[j]>number[j+1]) {
					int temp = number[j];
					number[j] = number[j+1];
					number[j+1] = temp;
				}
			}
		}
		
		System.out.println("Sorted Array: ");
		for(int i=0; i<array_length;i++) {
			System.out.print(number[i] + " ");
		}
		
	}

}
