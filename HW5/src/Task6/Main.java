package Task6;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		House[] houses = new House[10];
		houses[0] = new House(1, 46, 100, 10, 4, "Плеханова", "Кирпичный", 110);
		houses[1] = new House(2, 234, 90, 1, 3, "Рокосовского", "Панельный", 50);
		houses[2] = new House(3, 213, 80, 2, 2, "Якубова", "Кирпичный", 110);
		houses[3] = new House(4, 448, 70, 9, 1, "Малинина", "Монолитный", 100);
		houses[4] = new House(5, 23, 60, 8, 1, "Богдановича", "Панельный", 50);
		houses[5] = new House(6, 4, 50, 7, 2, "Центральная", "Панельный", 50);
		houses[6] = new House(7, 8, 40, 6, 3, "Рокосовского", "Монолитный", 100);
		houses[7] = new House(8, 148, 50, 5, 4, "Малинина", "Панельный", 50);
		houses[8] = new House(9, 118, 60, 4, 2, "Богдановича", "Панельный", 50);
		houses[9] = new House(10, 111, 70, 3, 1, "Якубова", "Монолитный", 100);
		do {
			System.out.println("Выберите критерий поиска:\n1-По числу комнат.\n2-По числу комнат и диопазону этажей.\n3-По площади превосходящей заданную.\n0-Выход");
			int criterion = sc.nextInt();
			switch(criterion) {
			case 1:
				System.out.println("Введите желаемое число комнат:");
				int countRooms = sc.nextInt();
				System.out.println("Список квартир с данным числом комнат:");
				int flag = 0;
				for(int i = 0; i < 10; i++) {
					if( houses[i].getCountRooms() == countRooms) {
						flag = 1;
						System.out.println("Id: " + houses[i].getId() + "; номер квартиры: " + houses[i].getFlatNumber() + "; площадь: " + houses[i].getSquare() + " метров квадратных" + "; этаж: " + houses[i].getFloor() + "; количество комнат: " + houses[i].getCountRooms() + "; улица: " + houses[i].getStreet() + "; тип здания: " + houses[i].getBuildType() + "; срок эксплуатации: " + houses[i].getLifetime() + "лет");
					}		
				}
				if (flag == 0) {
					System.out.println("Нет квартир удовлетворяющих критерию");
				}
				System.out.println("");
				break;
			case 2:
				System.out.println("Введите число комнат: ");
				int countRoom = sc.nextInt();
				System.out.println("Введите диопазон этажей:\nот: ");
				int floor = sc.nextInt();
				System.out.println("до: ");
				int floorTo = sc.nextInt();
				System.out.println("Список квартир подходящие под критерии поиска: ");
				int flagTwo= 0;
				for( int i = 0; i< 10; i++){
					if (houses[i].getCountRooms() == countRoom && houses[i].getFloor() >= floor && houses[i].getFloor() <= floorTo){
						System.out.println("Id: " + houses[i].getId() + "; номер квартиры: " + houses[i].getFlatNumber() + "; площадь: " + houses[i].getSquare() + " метров квадратных" + "; этаж: " + houses[i].getFloor() + "; количество комнат: " + houses[i].getCountRooms() + "; улица: " + houses[i].getStreet() + "; тип здания: " + houses[i].getBuildType() + "; срок эксплуатации: " + houses[i].getLifetime() + "лет");
						flagTwo = 1;
					}
				}
				if (flagTwo == 0) {
					System.out.println("Нет квартир удовлетворяющих критерию");
				}
				System.out.println("");
				break;
			case 3:
				System.out.println("Введите площадь в метрах квадратных: ");
				int square = sc.nextInt();
				System.out.println("Список квартир имеющих площадь больше заданной: ");
				int flagOne = 0;
				for (int i = 0; i< 10; i++){
					if (houses[i].getSquare() > square){
						System.out.println("Id: " + houses[i].getId() + "; номер квартиры: " + houses[i].getFlatNumber() + "; площадь: " + houses[i].getSquare() + " метров квадратных" + "; этаж: " + houses[i].getFloor() + "; количество комнат: " + houses[i].getCountRooms() + "; улица: " + houses[i].getStreet() + "; тип здания: " + houses[i].getBuildType() + "; срок эксплуатации: " + houses[i].getLifetime() + "лет");
						flagOne = 1;
					}
				}
				if (flagOne == 0) {
					System.out.println("Нет квартир удовлетворяющих критерию");
				}
				System.out.println("");
				break;
			case 0:
				System.out.println("Программа завершена");
				sc.close();
				return;
			default:
				System.out.println("Нет такого пункта меню");
				break;	
			}
		}while(true);
	}
}
