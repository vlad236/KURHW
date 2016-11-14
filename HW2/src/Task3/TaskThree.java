import java.util.Scanner;
/** Вычисление частного двух чисел */
public class TaskThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //создаем объект sc типа scanner
		System.out.print("Введите делимое: ");
		double dividend = sc.nextDouble(); //создаем объект divident типа double, в который значение делимого будут заноситьс с клавиатуры 
		System.out.print("Введите делитель: ");
		int divider = sc.nextInt(); //создаем объект divider типа int, в который значение делимого будут заноситьс с клавиатуры
		if (divider == 0) //Проверка делителя на ноль
			System.out.println("На ноль делить нельзя!");
		else {
			double result = dividend / divider;
			System.out.println("Частное " + result);
		}
		sc.close();
	}

}
