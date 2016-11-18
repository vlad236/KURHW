package Task4;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите год: ");
		int year = sc.nextInt(); // создаем объект year типа int, значение в который будет заносится с клавиатуры0
		if (year > 0){ //Проверяем чтобы число было введено больше 0
			if (year % 4 == 0){ //Проверяем является ли год високосным
				System.out.println(year + " " + "год является високосным");
			}
			else
				System.out.println(year + " " + "год не является високосным");
		}
		else
			System.out.println("Введите год правильно, значение не может быть меньше нуля");
		sc.close();
	}

}

