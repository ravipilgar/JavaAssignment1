package SessionTask;

import java.util.Scanner;

public class Program04{

	public static void main(String[] args) {
		
		int array_length = 1;
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		
		int id, marks;
		String name,course;
		
		Student[] stud = new Student[array_length];
		
		System.out.println("Enter details of 5 students");
		
		for(int i=0; i<array_length; i++) {
			System.out.println("---------------------------");
			System.out.println("Enter details of student "+(i+1));
			System.out.println("Enter student id: ");
			id = sc.nextInt();
			
			System.out.println("Enter student name: ");
			name = sc1.nextLine();
			
			System.out.println("Enter student course: ");
			course = sc1.nextLine();
			
			System.out.println("Enter student marks: ");
			marks = sc.nextInt();
			
			stud[i] = new Student(id, name, course, marks);
		}
		
		for(int i=0; i<array_length;i++)
		{
			stud[i].Show();
		}
	}
}

class Student {
	int id,marks;
	String name,course;
	
	Student(int id, String name, String course, int marks){
		this.id=id;
		this.name=name;
		this.course=course;
		this.marks=marks;
	}
	
	public void Show() {
		if(marks>60) {
			System.out.println("-------------------------------");
			System.out.println("Student ID: " + this.id);
	        System.out.println("Student Name: " + this.name);
	        System.out.println("Student course: " + this.course);
	        System.out.println("Student marks: " + this.marks);
		}

	}
}
