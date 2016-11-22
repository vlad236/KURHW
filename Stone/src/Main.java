import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    // TODO: 18.11.2016 Возможно изменить меню, добавить еще по одному камню в иерерахию
    public static void main(String[] args) {
        StoneUtil util = new StoneUtil();
        do {
        	try {
	            System.out.println("\n\tМеню");
	            System.out.println("\n1. Показать камни в ожерелье");
	            System.out.println("2. Добавить камень алмаз");
	            System.out.println("3. Добавить камень янтарь");
	            System.out.println("4. Удалить камень");
	            System.out.println("5. Отсортировать по ценности");
	            System.out.println("6. Посчитать общий вес и стоимость");
	            System.out.println("7. Найти камни в ожерелье, соответствующие заданному диапазону парметров прозрачности");
	            System.out.println("0. Выйти");
	            System.out.print("Ваш выбор: ");
	            Scanner sc = new Scanner(System.in);
	            int choice = sc.nextInt();
	            switch (choice) {
	                case 0:
	                    return;
	                case 1:
	                    util.show();
	                    break;
	                case 2:
	                    util.addDiamond();
	                    break;
	                case 3:
	                    util.addAmber();
	                    break;
	                case 4:
	                    util.delete();
	                    break;
	                case 5:
	                    util.sort();
	                case 6:
	                    util.totalCost();
	                    util.totalWeigth();
	                case 7:
	                    util.opacityChoice();
	                    break;
	                default:
	                    System.out.println("Неверный выбор пункта меню");
	                    break;
	            }
        	}
        	catch(InputMismatchException ex) {
        		System.out.println("Введите число!");
        	}
        } while (true);
    }

}