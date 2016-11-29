import model.*;

import java.util.*;

// TODO: 18.11.2016 Добавить оставшиейся методы, изменить добавление, возможно изменить вывод на экран(ну тут уже как душе угодно), разобраться с исключениями.
public class StoneUtil {

    public List<Stone> stones = new ArrayList<>();

    /**
     * Этот метод выводит на консоль список камней, которые есть в ожерелье
     */
    public void show() {
        int index = 1;
        if(stones.isEmpty()) {
            System.out.println("\nНет камней в ожерелье");
            return;
        }
        System.out.println("\nСостав вашего ожерелья:\n");
        for(Stone stone:stones) {
            System.out.print(index + ". ");
            stone.show();
            index++;
        }
    }

    /**
     * Здесь с помощью сканера вводим данные, создаем объект Amber и добавляем в список
     */
    public void addAmber() {
        
        Scanner sc = new Scanner(System.in);
        boolean processed = false;
        System.out.println("\nКамень обработан(Да/Нет)?");
        while (true) {
            String response = sc.nextLine();
            if (response.equalsIgnoreCase("Да")) {
                processed = true;
                break;
            }
            else if (response.equalsIgnoreCase("Нет")) {
                break;
            }
            else
                System.out.println("Повторите ввод");
        }
        System.out.println("\nВведите прозрачность, цену и вес:");
        double opacity, cost, weight;
        while (true) {
        	opacity = sc.nextDouble();
        	if (opacity <= 1 && opacity > 0) {
        		break;
        	}
        	else {
        		System.out.println("Прозрачность должна находится в диапозоне от 0 до 1");
        	}
        }
        cost = sc.nextDouble();
        weight = sc.nextDouble();
        stones.add(new Amber(processed, weight, cost, opacity));
        System.out.println("\nЯнтарный камень добавлен");
    }
    
    /**
     * Здесь с помощью сканера вводим данные, создаем объект Malachite и добавляем в список
     */
    public void addMalachite() {
       
        Scanner sc = new Scanner(System.in);
        boolean processed = false;
        System.out.println("\nКамень обработан(Да/Нет)?");
        while (true) {
            String response = sc.nextLine();
            if (response.equalsIgnoreCase("Да")) {
                processed = true;
                break;
            }
            else if (response.equalsIgnoreCase("Нет")) {
                break;
            }
            else
                System.out.println("Повторите ввод");
        }
        System.out.println("\nВведите прозрачность, цену и вес:");
        double opacity, cost, weight;
        while (true) {
        	opacity = sc.nextDouble();
        	if (opacity <= 1 && opacity > 0) {
        		break;
        	}
        	else {
        		System.out.println("Прозрачность должна находится в диапозоне от 0 до 1");
        	}
        }
        cost = sc.nextDouble();
        weight = sc.nextDouble();
        stones.add(new Malachite(processed, weight, cost, opacity));
        System.out.println("\nКамень малахит добавлен");
    }
    
    /**
     * Здесь с помощью сканера вводим данные, создаем объект Diamond и добавляем в список
     */
    public void addDiamond() {
    	int flag = 0;
    	String color = "";
    	Scanner sc = new Scanner(System.in);
    	while(flag == 0){
	        System.out.println("\nВыберите цвет алмаза:\n1.Бесцветный\n2.Желтый\n3.Коричневый\n4.Синий\n5.Черный");
	        int choiceColor = sc.nextInt();
	        switch (choiceColor) {
		        case 1:
		            color = "бесцветный";
		            flag = 1;
		            break;
		        case 2:
		        	color = "желтый";
		            flag = 1;
		            break;
		        case 3:
		        	color = "коричневый";
		            flag = 1;
		            break;
				case 4:
					color = "синий";
		            flag = 1;
		            break;
				case 5:
					color = "черный";
		            flag = 1;
		            break;
		        default:
		            System.out.println("Неверный выбор пункта");
		            break;
	        }
    	}
        System.out.println("\nВведите прозрачность, цену и вес(в каратах):");
        double opacity, cost, weight;
        while (true) {
        	opacity = sc.nextDouble();
        	if (opacity <= 1 && opacity > 0) {
        		break;
        	}
        	else {
        		System.out.println("Прозрачность должна находится в диапозоне от 0 до 1");
        	}
        }
        cost = sc.nextDouble();
        weight = sc.nextDouble();
        stones.add(new Diamond(color, opacity, cost, weight));
        System.out.println("\nАлмаз добавлен");
    }
    
    /**
     * Здесь с помощью сканера вводим данные, создаем объект Ruby и добавляем в список
     */
    public void addRuby() {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\nВведите твердость рубина:");
        int hardness = sc.nextInt();
        System.out.println("\nВведите прозрачность, цену и вес(в каратах):");
        double opacity, cost, weight;
        while (true) {
        	opacity = sc.nextDouble();
        	if (opacity <= 1 && opacity > 0) {
        		break;
        	}
        	else {
        		System.out.println("Прозрачность должна находится в диапозоне от 0 до 1");
        	}
        }
        cost = sc.nextDouble();
        weight = sc.nextDouble();
        stones.add(new Ruby(hardness, opacity, cost, weight));
        System.out.println("\nРубин добавлен");
    }

    public void delete() {
        show();
        if(stones.isEmpty())
            return;
        System.out.println("Выберите номер удаляемого камня: ");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        if(index > stones.size())
            System.out.println("Нет там такого");
        else
            stones.remove(index - 1);
    }

    public void sort() {
        show();
        Collections.sort(stones, new Comparator<Stone>() {
            public int compare(Stone o1, Stone o2) {
                return o1.compareTo(o2);
            }
        });
        show();
    }

    public void totalCost() {
    	double sumCost = 0;
    	for (Stone stone:stones){
    		sumCost += stone.getCost();
    	}
        System.out.println("Сумма стоимости камней в ожерелье: " + sumCost + " руб.");
    }

    public void totalWeigth() {
    	double sumWeigth = 0;
    	for (Stone stone:stones){
    		sumWeigth += stone.getWeight();
    	}
        System.out.println("Общий вес камней во жерелье в каратах: " + sumWeigth + " кар");
    }

    public void opacityChoice() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Введите диопазон прозрачности:\nот: ");
    	double from = sc.nextDouble();
    	System.out.println("\nдо: ");
    	double to = sc.nextDouble();
    	
    	for (Stone stone:stones){
    		if(from < stone.getOpacity() && to > stone.getOpacity()){
    			stone.show();
    		}
    	}
    	if(stones.isEmpty()) {
        System.out.println("\nНет камней в ожерелье, удовлетворяющих данному условию");
        return;
    	}
    }
    

}