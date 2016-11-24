import model.*;

import java.util.*;

// TODO: 18.11.2016 Добавить оставшиейся методы, изменить добавление, возможно изменить вывод на экран(ну тут уже как душе угодно), разобраться с исключениями.
public class StoneUtil {

    public List<Stone> stones = new ArrayList<>();

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

    public void addAmber() {
        // TODO: 18.11.2016 Здесь с помощью сканера вводим данные, создаем объект Amber и добавляем в список
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
        opacity = sc.nextDouble();
        cost = sc.nextDouble();
        weight = sc.nextDouble();
        stones.add(new Amber(processed, weight, cost, opacity));
        System.out.println("\nЯнтарный камень добавлен");
    }

    public void addMalachite() {
        // TODO: 18.11.2016 Здесь с помощью сканера вводим данные, создаем объект Amber и добавляем в список
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
        opacity = sc.nextDouble();
        cost = sc.nextDouble();
        weight = sc.nextDouble();
        stones.add(new Malachite(processed, weight, cost, opacity));
        System.out.println("\nКамень малахит добавлен");
    }

    public void addDiamond() {
        // TODO: 18.11.2016 Здесь с помощью сканера вводим данные, создаем объект Diamond и добавляем в список
        Scanner sc = new Scanner(System.in);
        System.out.println("\nВведите форму алмаза:");
        String shape = sc.nextLine();
        System.out.println("\nВведите прозрачность, цену и вес(в каратах):");
        double opacity, cost, weight;
        opacity = sc.nextDouble();
        cost = sc.nextDouble();
        weight = sc.nextDouble();
        stones.add(new Diamond(shape, opacity, cost, weight));
        System.out.println("\nАлмаз добавлен");
    }

    public void addRuby() {
        // TODO: 18.11.2016 Здесь с помощью сканера вводим данные, создаем объект Ruby и добавляем в список
        Scanner sc = new Scanner(System.in);
        System.out.println("\nВведите твердость рубина:");
        int hardness = sc.nextInt();
        System.out.println("\nВведите прозрачность, цену и вес(в каратах):");
        double opacity, cost, weight;
        opacity = sc.nextDouble();
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
        System.out.println("Сумма стоимости камней в ожерелье: " + sumCost);
    }

    public void totalWeigth() {
    	double sumWeigth = 0;
    	for (Stone stone:stones){
    		sumWeigth += stone.getWeight() * 5;
    	}
        System.out.println("Общий вес камней в ожерелье: " + sumWeigth + " карат");
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
    }
    

}