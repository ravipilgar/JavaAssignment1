package SessionTask;

public class Program09 {

	public static void main(String[] args) {
		SharedResource s = new SharedResource();
		
		MyThread t1 = new MyThread(s,2,8);
		MyThread t2 = new MyThread(s,100,9);
		t1.start();
		t2.start();

	}

}

class SharedResource{
	void doPrint(int num_1, int num_2) {
		
		synchronized (this) {
			for(int i=num_1; i<=(num_1 + num_2);i++) {
				System.out.print(i+" ");
				try {
					Thread.sleep(1000);
				}
				catch (Exception e) {
					System.out.println("Error: "+e.getMessage());
				}
			}	
		}
		System.out.println("");
	}
}

class MyThread extends Thread{
	
	SharedResource s;
	int n1, n2;
	
	public MyThread(SharedResource s, int n1, int n2) {
		this.s = s;
		this.n1 = n1;
		this.n2 = n2;
	}
	
	@Override
	public void run() {
		s.doPrint(n1, n2);
	}
}
