
public class Task4 {

	public static void main(String[] args) {
		int mass[] = new int[10];//Создаем массив из 10 элементов
		int n = 0;
		//Заполяем массив случайными числами
		for (int i = 0; i < mass.length; i++){
			mass[i] = (int)(Math.random()*10 - 5);
			System.out.print(mass[i] + " ");
		}
		//Вычисляем сумму отрицательных элементов
		for (int i = 0; i < mass.length; i++){
			if (mass[i] < 0)
				n = n + mass[i];
		}
		//Выводим сумму
		System.out.println("\nСумма отрицательных чисел массива = " + n);
	}

}
