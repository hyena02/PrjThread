package ex01;
// class 안 만들고 override 해서 실행
import java.awt.Toolkit;

public class BeepTaskThread2 {
	public static void main(String[] args) {
		Thread thread1 = new Thread( new Runnable() {

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
			}} );
		thread1.start();
		
		
		Thread thread2 = new Thread( new Runnable() {

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
				}
		});
		thread2.start();
		
	}//main
}//class
