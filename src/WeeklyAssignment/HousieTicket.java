package WeeklyAssignment;

import java.util.Random;

public class HousieTicket {
	
	final static int rows = 3;
	final static int columns = 9;
	static int ticket_array[][] = new int[rows][columns];
	
	public static void main(String[] args) {
		
		System.out.println("**** Housie Ticket Generator ****");
		
		final int filled_max_rows = 2;
		final int filled_max_columns_in_single_row = 5;
		final int divisor = 10;
		
		for(int i=0; i<rows; i++) {
			
			int col_counter = 1;
			
			for(int j=0; j<columns; j++) {
			
				int ticket_number=0;
				int column_number = generate_random_column_number(columns);
				
				//System.out.print(col_counter+", ");				
				if(col_counter>filled_max_columns_in_single_row) {
					break;
				}
				//System.out.print(col_counter+", ");
				
				if(column_number==0) {
					//rc/ij 00 10 20
					ticket_number = generate_random_ticket_number(1,9);
					
					if(get_row_count(0,ticket_array))
							col_counter = add_value_in_ticket_array(i,0, ticket_array, ticket_number, col_counter);
					else
						break;
				}
				else if(column_number==1){
					ticket_number = generate_random_ticket_number(10,19);
					
					if(get_row_count(1,ticket_array))
						col_counter = add_value_in_ticket_array(i,1, ticket_array, ticket_number, col_counter);
					else
						break;
				}
				else if(column_number==2){
					ticket_number = generate_random_ticket_number(20,29);
					
					if(get_row_count(2,ticket_array))
						col_counter = add_value_in_ticket_array(i,2, ticket_array, ticket_number, col_counter);
					else
						break;
				}
				else if(column_number==3){
					ticket_number = generate_random_ticket_number(30,39);
					
					if(get_row_count(3,ticket_array))
						col_counter = add_value_in_ticket_array(i,3, ticket_array, ticket_number, col_counter);
					else
						break;
				}
				else if(column_number==4){
					ticket_number = generate_random_ticket_number(40,49);
					
					if(get_row_count(4,ticket_array))
						col_counter = add_value_in_ticket_array(i,4, ticket_array, ticket_number, col_counter);
					else
						break;
				}
				else if(column_number==5){
					ticket_number = generate_random_ticket_number(50,59);
					
					if(get_row_count(5,ticket_array))
						col_counter = add_value_in_ticket_array(i,5, ticket_array, ticket_number, col_counter);
					else
						break;
				}
				else if(column_number==6){
					ticket_number = generate_random_ticket_number(60,69);
					
					if(get_row_count(6,ticket_array))
						col_counter = add_value_in_ticket_array(i,6, ticket_array, ticket_number, col_counter);
					else
						break;
				}
				else if(column_number==7){
					ticket_number = generate_random_ticket_number(70,79);
					
					if(get_row_count(7,ticket_array))
						col_counter = add_value_in_ticket_array(i,7, ticket_array, ticket_number, col_counter);
					else
						break;
				}
				else if(column_number==8){
					ticket_number = generate_random_ticket_number(80,89);
						
					if(get_row_count(8,ticket_array))
						col_counter = add_value_in_ticket_array(i,8, ticket_array, ticket_number, col_counter);
					else
						break;
				}
				
			}
			//System.out.println();
		}
		
		display_ticket(rows, columns, ticket_array);
		
	}
	
	private static boolean get_row_count(int a, int[][] ticket_array2) {
		
		int filled_counter=0;
		
		for(int i=0; i<rows; i++){
			
			for(int j=a; j<(a+1); j++) {
				if(ticket_array2[i][j]!=0) {
					filled_counter++;
				}
			}
		}
		
		if(filled_counter>=2)
			return false;
		else
			return true;
	}

	private static int generate_random_column_number(int columns) {
		Random random = new Random();
		int random_column_number;
		
		random_column_number = random.nextInt(columns-0)+(0);
		return random_column_number;
		
	}

	private static int generate_random_ticket_number(int min, int max) {
		
		Random random = new Random();
		int random_ticket_number;
		
		random_ticket_number = random.nextInt(max-min)+(min);
		//System.out.print(random_ticket_number+",");
		return random_ticket_number;
	}

	private static int add_value_in_ticket_array(int i, int j, int[][] ticket_array2, int ticket_number, int c_counter) {
		
		while(check_duplicate_value(j, ticket_array, ticket_number)){	
			ticket_number = generate_random_ticket_number((j*10),(j*10+9));
			//System.out.println("in while");
			//System.out.println(check_duplicate_value(j, ticket_array, ticket_number));
		}
		
		if(ticket_array2[i][j]!=0)
			ticket_array[i][j] = ticket_array2[i][j];
		
		if(ticket_array2[i][j]==0) {
			ticket_array[i][j] = ticket_number;
			c_counter++;
		}
		
		return c_counter;
	}
	
	private static boolean check_duplicate_value(int col_number, int[][] ticket_array2, int ticket_number) {
		
		boolean flag=true;
		
		for(int i=0; i<rows; i++){
			
			for(int j=col_number; j<(col_number+1); j++) {
				if(ticket_array[i][j]==ticket_number) {
					flag = true;
				}
				else {
					flag = false;
				}
			}
		}
		//System.out.println(flag);
		return flag;
	}

	public static void display_ticket(int rows, int columns, int ticket_array[][]) {
		//System.out.println();
		System.out.println("---------------------------------");
		for(int i=0; i<rows;i++) {
			
			for(int j=0; j<columns;j++) {
				System.out.print(ticket_array[i][j]+", ");					
				}
				
				System.out.println();	
			}
		}
}