
public class Task5 {

	public static void main(String[] args) {
		int mass [] = new int[10];//Создаем массив из 10 элементов
		int symma = 0;
		//Заполняем массив случайными числами
		for (int i = 0; i < mass.length; i++){
			mass[i] = (int)(Math.random()*10);
			System.out.print(mass[i] + " ");
		}
		//Вычисляем сумму до первого нуля
		for (int i = 0; i < mass.length; i++){
			if (mass[i] == 0)
			break;	
			symma += mass[i];
		}
		//Выводим сумму
		System.out.println("Сумма элементов массива до первого нулевого элемента = " + symma);
	}

}
