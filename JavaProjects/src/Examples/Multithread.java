package Examples;

/*public class Multithread extends Thread{

	public void run(){
	System.out.println("Thread is running..");
}
	public static void main(String args[]){  
		Multithread m=new Multithread();
		m.start();
	}
}
*/

//using runnable

public class Multithread implements Runnable{

	public void run(){
	System.out.println("Thread is running..");
}
	public static void main(String args[]){  
		Multithread m=new Multithread();
		Thread t=new Thread(m);
		t.start();
	}
}
