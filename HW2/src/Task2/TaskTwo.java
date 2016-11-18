package Task2;
import java.util.Scanner;

public class TaskTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //Создаем объект sc типа Scanner
		System.out.print("Первое число: ");
		int firstNumber = sc.nextInt(); //Объявляем объект firstNumber , содержимое которого, будет вводиться с клавиатуры
		System.out.print("Второе число: ");
		int secondNumber = sc.nextInt(); //Объявляем объект secondNumber
		if (firstNumber > secondNumber) //Оператор if, который сравнивает два числа
			System.out.println("Число" + firstNumber + " больше, чем " + secondNumber);
		else
			System.out.println("Число" + secondNumber + " больше, чем " + firstNumber);
		sc.close();
	}

}
