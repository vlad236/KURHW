import java.util.Scanner;

public class Week {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in); //Создаем объект sc типа Scanner
		System.out.println("Введите номер дня недели: ");
		Byte dayOfWeek = sc.nextByte(); //Объявление объекта дня недели 
		switch(dayOfWeek){ //Нахождение нужного нам номера путем использование оператора Switch
			case 1:
				System.out.println("Понедельник");
				break;
			case 2:
				System.out.println("Вторник");
				break;
			case 3:
				System.out.println("Среда");
				break;
			case 4:
				System.out.println("Четверг");
				break;
			case 5:
				System.out.println("Пятница");
				break;
			case 6:
				System.out.println("Суббота");
				break;
			case 7:
				System.out.println("Воскресение");
				break;
			default:
				System.out.println("Введено не верное число, дня недели с таким номером нет");
		}	
	}

}
