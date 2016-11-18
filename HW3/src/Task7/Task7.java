package Task7;
/** Вывод массива и элементов главной и побочной диагонали */
public class Task7 {

	public static void main(String[] args) {
		int mass[][] = new int[5][5];
		System.out.print("Исходный массив nхn:");
		System.out.print("\n");
		//Заполнение массива случайнымиэлементами
		for (int i = 0; i < mass.length; i++){
			 for(int j = 0; j < mass.length; j++){
				mass[i][j] = (int)(Math.random()*10);
				System.out.print(mass[i][j] +  "  ");
			 }
			 System.out.print("\n");
		}
		System.out.println("Последовательность элементов побочной диагонали: ");
		// Поиск и вывод элементов побочной диагонали
		for (int i = 0; i < mass.length; i++){
			 for(int j = 0; j < mass.length; j++){
				 if(Math.abs(mass.length - i - 1) == j)
					 System.out.print(mass[i][j] + " "); 
			 }
		}
		System.out.println("\nПоследовательность элементов главной диагонали: ");
		// Поиск и вывод элементов главной диагонали
		for (int i = 0; i < mass.length; i++){
			 for(int j = 0; j < mass.length; j++){
				 if (i == j)
					 System.out.print(mass[i][j] + " ");
			 }
		}
	}

}
