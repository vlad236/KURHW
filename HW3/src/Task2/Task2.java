package Task2;
/** Вывод массива, поиск максимального и минимального значений */
public class Task2 {

	public static void main(String[] args) {
		int mass[] = new int[10];
		int max = 0;
		int min = 99999999;
		for (int i = 0; i < mass.length; i++){
			mass[i] = (int)(Math.random()* 10 + 1);
			System.out.print(mass[i] + " | ");
		}
		//Находим наибольшее значение массива
		for (int i = 0; i < mass.length; i++){
			if (max < mass[i])
			max = mass[i];
		}
		//Находим наименьшее значение массива
		for (int i = 0; i < mass.length; i++){
			if (min > mass[i])
			min = mass[i];	
		}
		//Выыодим наибольшее и наименьшее значение
		System.out.println("\nmin value: " + min);
		System.out.println("max value: " + max);
	}

}
