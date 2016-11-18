package Task6;
/** Перестановка всех нулей массива в конец, не меняя порядок остальных элементов */
public class Task6 {

	public static void main(String[] args) {
		int mass[] = new int[10];
		for (int i = 0; i < mass.length; i++){ //Цикл по рандомному заполнению массива
			mass[i] = (int)(Math.random()*10);
			System.out.print(mass[i] + " ");
		}
		System.out.println(" ");
		int countZero = 0; //Переменная , в котрой будет храниться количество перенесенных нулей
        for(int i = 0; i < mass.length - 1; i++) { //Цикл, в кором мы перебираем наши элементы массива
            if(mass[i] == 0) { //Находим ноль
                for (int j = i; j < mass.length - 1; j++) { //Выполняем его перемещение в конец
                    int temp = mass[j];
                    mass[j] = mass[j + 1];
                    mass[j + 1] = temp;
                }
                i--; //возвращаемся на одну позицию назад, чтобы исключить пропуск нулей, идущих друг за другом
                countZero++;
            }
            if (i == mass.length - countZero)// Выход, в случае, если все нули будут уже в конце, чтобы выполнение не зациклилось
                break;
        }
        for(int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }
	}

}
