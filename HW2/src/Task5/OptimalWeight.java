import java.util.Scanner;
/** Проверка является ли вес оптимальным */
public class OptimalWeight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите ваш рост(см.): "); 
		int height = sc.nextInt(); //Создаем объект height типа int, в который с клавиатуры будут заносится данные о росте
		System.out.println("Введите ваш вес(кг.): ");
		int weight = sc.nextInt(); //Создаем объект weigth типа int, в который с клавиатуры будут заносится данные о весе
		if (weight > height - 100) //Проверяем является ли вес больше оптимального
			System.out.println("Ваш вес больше оптимального. Вам необходимо похудеть");
		else
			if (weight < height - 100) //Проверяем является ли вес меньше оптимального
				System.out.println("Ваш вес меньше оптимального. Вам необходимо поправиться");
			else 
				System.out.println("Поздравляем! Ваш вес является оптимальным");
		sc.close();
	}

}
