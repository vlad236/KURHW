package Task1;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		while(true){
			Scanner sc = new Scanner(System.in);
			System.out.println("Введите start для запуска потоков");
			String action = sc.nextLine();
			if(action.equals("start")){
				Threadd thread1 = new Threadd("Thread 1");
				Threadd thread2 = new Threadd("Thread 2");
				thread1.start();
				Thread.sleep(1000);
				thread2.start();
				sc.close();
				return;	
			}
			
		}
		
	}

}
