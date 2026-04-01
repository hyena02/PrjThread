package ex01;

import java.awt.Toolkit;

public abstract class BeepTaskTest {

	public static void main(String[] args) throws InterruptedException {
		
		for (int i = 0; i < 5; i++) {	
			try {
				System.out.println("탕");
//				throw new Exception("야르");
				Thread.sleep(500);		//  0.5초 대기 // massage Interval // f2 - surround with try/catch
			} catch (InterruptedException e) {
				e.printStackTrace();
			} //catch			
		}//for1
		
		
//		Toolkit toolkit = Toolkit.getDefaultToolkit(); //.static 함수셔야행 or new 어쩌고
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();	//.default 어쩌고
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			Thread.sleep(500);			//add throw declaration => main 에 던지기 ->  try/catch 안해도 됨
		}//for2
		
		
		
	}//main
}//class
