package SessionTask;

import java.util.Scanner;

class Project{
	String project_id, project_name, project_location;
	
	Project(){}
	
	Project(String pid, String pname, String plocation){
		this.project_id=pid;
		this.project_name=pname;
		this.project_location=plocation;
	}
	
	public boolean checkProjectName() {
		if(this.project_name.equals("a"))
			return true;
		else
			return false;
	}
	public void showProject() {
        System.out.println("Project Name: " + project_name);
		System.out.println("Project ID: " + project_id);
		System.out.println("Project Location: " + project_location);
	}
}

class Employee extends Project{
	int emp_id,emp_sal;
	public String emp_name,emp_project;
	
	Employee(){}
	
	Employee(int eid, String ename, int esalary, String eproject){
		this.emp_id=eid;
		this.emp_name=ename;
		this.emp_sal=esalary;
		this.emp_project=eproject;
	}
	
	public boolean checkSalary() {
		if(this.emp_sal>25000)
			return true;
		else
			return false;
	}
	
	public void showEmployee() {
		System.out.println("-------------------------------");
		System.out.println("Employee ID: " + this.emp_id);
        System.out.println("Employee Name: " + this.emp_name);
        System.out.println("Employee Salary: " + this.emp_sal);		
	}
}

public class Program05 {

	public static void main(String[] args) {
		int array_length = 1;
		
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		
		int em_id, em_sal;
		String em_name, pr_id, pr_location, projectName;
				
		Employee[] employee = new Employee[array_length];
		Project[] project = new Project[array_length];
		
		for(int i=0; i<array_length; i++) {
			System.out.println("---------------------------");
			System.out.println("Enter details of employee "+(i+1));
			
			System.out.println("Enter employee id: ");
			em_id = sc.nextInt();
			
			System.out.println("Enter employee name: ");
			em_name = sc1.nextLine();
			
			System.out.println("Enter employee salary: ");
			em_sal = sc.nextInt();
			
			System.out.println("Enter employee porject: ");
			projectName = sc1.nextLine();
			
			System.out.println("Enter porject id: ");
			pr_id = sc1.nextLine();
			
			System.out.println("Enter porject location: ");
			pr_location = sc1.nextLine();
			
			System.out.println(projectName);
			employee[i] = new Employee(em_id, em_name, em_sal, projectName);
			project[i] = new Project(pr_id, projectName, pr_location);
		}
		
		Employee emp = new Employee();
		
		for(int i=0; i<array_length;i++)
		{
			if(!emp.checkSalary())
				employee[i].showEmployee();
			
			project[i].showProject();
		}		
	}

}
