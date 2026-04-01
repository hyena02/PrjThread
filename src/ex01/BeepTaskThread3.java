package ex01;
// override 안하고 람다식으로 실행
import java.awt.Toolkit;

public class BeepTaskThread3 {
	public static void main(String[] args) {

// 람다식	- interface 에 추상 method 1개일 때 사용가능 (implement 할 때)
//    =>  짧고 단순할 때만 쓰는게 좋다 !
// 익명클래스 1개이상 2개 - ex) IPO
		
		
		Thread thread1 = new Thread(() -> {

			for (int i = 0; i < 5; i++) {
				System.out.println("타앙");
				try {
					Thread.sleep(500); // try/catch 어쩌구
				} catch (InterruptedException e) {
					e.printStackTrace();
				} // catch
			} // for1
		});//Thread1

		Thread thread2 = new Thread(() -> {

			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for (int i = 0; i < 5; i++) {
				toolkit.beep();
				try {
					Thread.sleep(500); // try/catch 어쩌구
				} catch (InterruptedException e) {
					e.printStackTrace();
				} // catch
			} // for2
		});//Thread2
	}// main
}// class
