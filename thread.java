public class thread{  
	public static void main(String[] args){
		Th1 th1 = new Th1();
		Th2 th2 = new Th2();
		th2.setPriority(7);

		System.out.println(th1.getPriority());
		System.out.println(th2.getPriority());

		th1.run();
		th2.run();
	}
}
class Th1 extends Thread{
	public void run(){
		for(int i=0; i<300; i++){
			System.out.print(new String("|"));
			for (int x=0; x<1000000000; x++){
			}
		}
	}
}

class Th2 extends Thread{
	public void run(){
		for(int i=0; i<300; i++){
			System.out.print(new String("-"));
			for (int x=0; x<1000000000; x++){
			}
		}
	}
}
