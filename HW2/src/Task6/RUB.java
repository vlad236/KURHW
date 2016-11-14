import java.util.Scanner;
/** Слово "рубль" в правильной форме */
public class RUB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите сумму в рублях от 0 до 999: ");
		int rub = sc.nextInt(); // Создаем объект rub типа int, в котором значение вводится с клавиатуры 
		if (rub >= 0 && rub < 1000){ //Проверяем чтобы число было введено в заданном диопазоне от 0 до 999
			if (rub % 10 == 1 && rub % 100 != 11) // Условия для "Рубль"
				System.out.println(rub + " Рубль");
			else 
				if (rub % 10 > 1 && rub % 10 < 5 && rub % 100 !=12 && rub % 100 !=13 && rub % 100 !=14)
					System.out.println(rub + " Рубля"); //Условие для "Рубля"
				else
					System.out.println(rub + " Рублей"); //Во всех остальный случаях Рублей
		}
		else
			System.out.println("Число введено не корректно!");
		sc.close();
	}

}
