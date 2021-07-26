package SessionTask;

import java.lang.annotation.Target;
import java.util.ArrayList;

public class Program10 {
	
	public static void main(String[] args) {
		
		Trainer t1 = new Trainer("1", "Ramesh", "java", 25000);
		Trainer t2 = new Trainer("2", "Mahesh", "python", 25000);
		Trainer t3 = new Trainer("3", "Suresh", "java", 19000);
		Trainer t4 = new Trainer("4", "Naresh", "jQuery", 25000);
		Trainer t5 = new Trainer("5", "Haresh", "java", 21000);
	}

}

class Trainer{
	
	String tr_id, name, course;
	int salary;
	
	public Trainer(){}
	
	public Trainer(String tr_id, String name, String course, int salary) {
		this.tr_id = tr_id;
		this.name = name;
		this.course = course;
		this.salary = salary;
		add_data_to_array_list();
	}
	
	void add_data_to_array_list() {

		ArrayList trainerList = new ArrayList();
		ArrayList arrayList2 = new ArrayList();
		
		trainerList.add(tr_id);
		trainerList.add(name);
		trainerList.add(course);
		trainerList.add(salary);
		
		if(this.salary>20000 && this.course.equals("java")) {
			arrayList2.add(trainerList);
			System.out.println(arrayList2);	
		}
		trainerList.clear();
	}
}