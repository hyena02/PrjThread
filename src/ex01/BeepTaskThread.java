package ex01;
//class , override 해서 실행
import java.awt.Toolkit;

class ShowTask implements Runnable{  // add unimplemented method

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("타앙");
			try {
				Thread.sleep(500);		//try/catch 어쩌구
			} catch (InterruptedException e) {
				e.printStackTrace();
			}//catch
		}//for1
	}//override1
}//classShow


class BeepTask implements Runnable{

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);		//try/catch 어쩌구
			} catch (InterruptedException e) {
				e.printStackTrace();
			}//catch
		}//for2
	}//override2
}//classBeep


//------------------------------------------------------------------------------
public class BeepTaskThread {

	public static void main(String[] args) {
		Runnable task1 = new ShowTask();			// Pet 으로 받아야함
		Thread thread1 = new Thread(task1);			//thread 가 2개라 2개 해야함
		thread1.start( );
		Runnable task2 = new BeepTask();
		Thread thread2 = new Thread(task2);
		thread2.start( );

	}//main
}//class
