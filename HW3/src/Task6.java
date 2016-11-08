
public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mass[] = new int[10];
		for (int i = 0; i < mass.length; i++){ //÷икл по рандомному заполнению массива
			mass[i] = (int)(Math.random()*10);
			System.out.print(mass[i] + " ");
		}
		System.out.println(" ");
		int countZero = 0; //ѕеременна€ , в котрой будет хранитьс€ количество перенесенных нулей
        for(int i = 0; i < mass.length - 1; i++) { //÷икл, в кором мы перебираем наши элементы массива
            if(mass[i] == 0) { //Ќаходим ноль
                for (int j = i; j < mass.length - 1; j++) { //¬ыполн€ем его перемещение в конец
                    int temp = mass[j];
                    mass[j] = mass[j + 1];
                    mass[j + 1] = temp;
                }
                i--; //возвращаемс€ на одну позицию назад, чтобы исключить пропуск нулей, идущих друг за другом
                countZero++;
            }
            if (i == mass.length - countZero)// ¬ыход, в случае, если все нули будут уже в конце, чтобы выполнение не зациклилось
                break;
        }
        for(int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }
	}

}
