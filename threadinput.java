import javax.swing.JOptionPane;

class threadinput{
	public static void main(String[] args){
		Th1 th1 = new Th1();
		th1.start();

		String input = JOptionPane.showInputDialog("input anything");
		System.out.println("input is"+input);

	}
}

class Th2 extends Thread{
	@Override
	public void run(){
		for(int i = 0; i<10; i++){
			System.out.println(i);
			try{
				sleep(1000);
			}catch(Exception e){

			}
		}
	}
}
