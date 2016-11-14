
public class Task3 {

	public static void main(String[] args) {
		int [] mass = new int[15];// Создаем массив из 15 элементов
		int index = 0;
		//Заполняем массив случайными числами
		for (int i = 0; i < mass.length; i++){
			mass[i] = (int)(Math.random()*10 + 1);
			System.out.print(mass[i] + " ");
		}
		int min = mass[0];
		//Находим минимальный элемент и его индекс
		for (int i = 1; i < mass.length; i++){
			if (min > mass[i]){
			min = mass[i];
			index = i+1;
			}
		}
		//Выводим индекс минимально элемента
		System.out.println("\nИндекс минимального элемента массива: " + index);
	}

}
