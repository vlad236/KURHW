package Task1;
/**Вывод массива и подсчет среднего арифметического */
public class Task1 {

	public static void main(String[] args) {
		float mass[] = {4.5f,6.7f,3.0f,7f,4.0f,1.4f,5.6f,3.4f,6.7f,9.0f};
		float n = 0;
		//Выводим значение массива
		for (int i = 0; i<10; i++){
			System.out.print(mass[i] + " | ");
		}
		//Считаем сумму элементов массива
		for (int i = 0; i<10; i++){
			n+= mass[i];
		}
		System.out.println("\naverage value = " + n/mass.length); //Выводим среднее арифметическоое 
	}

}
