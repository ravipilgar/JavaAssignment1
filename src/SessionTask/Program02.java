package SessionTask;

import java.util.Scanner;

public class Program02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int rows = sc.nextInt();
		int value=1; 
		
		for(int i=1;i<=rows;i++){
			
	        for(int j=0;j<i;j++){
	        	
	            System.out.print(value+" ");
	            value++;
	        }
	        System.out.println();
	    }

	}

}
