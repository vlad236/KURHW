import java.util.Scanner;

public class TaskTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); //—оздаем объект sc типа Scanner
		System.out.print("ѕервое число: ");
		int firstNumber = sc.nextInt(); //ќбъ€вл€ем объект firstNumber , содержимое которого, будет вводитьс€ с клавиатуры
		System.out.print("¬торое число: ");
		int secondNumber = sc.nextInt(); //ќбъ€вл€ем объект secondNumber
		if (firstNumber > secondNumber) //ќператор if, который сравнивает два числа
			System.out.println("„исло " + firstNumber + " больше, чем " + secondNumber);
		else
			System.out.println("„исло " + secondNumber + " больше, чем " + firstNumber);
		sc.close();
	}

}
