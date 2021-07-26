package SessionTask;

class Thread1 extends Thread{
	@Override
	public void run() {
		try {
			StringBuilder s1 = new StringBuilder("Java is nice");
			String str = s1.reverse().toString();
			
			for(int i=0; i<str.length();i++) {
				Thread.sleep(2000);
				System.out.print(str.charAt(i));
			}
		}
		catch (Exception e) {
			System.out.println("Eexception occured: "+e.getClass()+" "+e.getMessage());
		}
	}
}

class Thread2 extends Thread{
	@Override
	public void run() {
		try {
			StringBuilder s1 = new StringBuilder("Java is nice");
			System.out.println();
			for(int i=0; i<s1.length();i++) {
				if(i%2==0) {
					Thread.sleep(1000);
					System.out.print(s1.charAt(i)+" ");
				}
			}
		}
		catch (Exception e) {
			System.out.println("Eexception occured: "+e.getClass()+" "+e.getMessage());
		}
	}
}

public class Program8 extends Thread {
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
		t1.join();
		t2.start();
		t2.join();
	}

}
