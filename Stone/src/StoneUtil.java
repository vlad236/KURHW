import model.Amber;
import model.Diamond;
import model.Stone;

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
        stones.add(new Amber(true, 2.0, 150.0, 0.2));
        System.out.println("\nЯнтарный камень добавлен");
    }

    public void addDiamond() {
        // TODO: 18.11.2016 Здесь с помощью сканера вводим данные, создаем объект Diamond и добавляем в список
        stones.add(new Diamond("Круглый", 2.0, 50.0, 0.7));
        System.out.println("\nАлмаз добавлен");
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
        sc.close();
    }

    public void sort() {
        Collections.sort(stones, new Comparator<Stone>() {
            public int compare(Stone o1, Stone o2) {
                return o1.compareTo(o2);
            }
        });
    }
    public void totalCost() {
    	double sumCost = 0;
    	for (Stone stone:stones){
    		sumCost += stone.getCost();
    		System.out.println("Сумма стоимости камней в ожерелье: " + sumCost);
    	}
    	
    }
    public void totalWeigth() {
    	double sumWeigth = 0;
    	for (Stone stone:stones){
    		sumWeigth += precious.getWeigth()*0.2;
    		sumWeigth += stone.getWeigthCarat();
    		System.out.println("Общмй вес камней в ожерелье: " + sumWeigth + "карат");
    	}
    }
    public void opacityChoice() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Введите диопазон прозрачности:\nот: ");
    	double from = sc.nextDouble();
    	System.out.println("\nдо: ");
    	double to = sc.nextDouble();
    	for (Stone stone:stones){
    		if(from < stone.getOpacity() && to > stone.getOpacity()){
    			System.out.println(stone);
    		}
    	}
    }
    

}