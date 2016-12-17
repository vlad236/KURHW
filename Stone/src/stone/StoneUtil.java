package stone;
import java.text.NumberFormat;
import java.util.*;

import stone.model.*;

public class StoneUtil {
	NumberFormat rubFormat = NumberFormat.getCurrencyInstance(Main.res.getLocale());
    public List<Stone> stones = new ArrayList<>();

    /**
     * Вывод в консоль списка камней, которые есть в ожерелье
     */
    public void show() {
        int index = 1;
        if(stones.isEmpty()) {
            System.out.println("\n" + Main.res.getString("16"));
            return;
        }
        System.out.println("\n" + Main.res.getString("17") + ":" );
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
        System.out.println("\n" + Main.res.getString("18"));
        while (true) {
            String response = sc.nextLine();
            if (response.equalsIgnoreCase(Main.res.getString("yes"))) {
                processed = true;
                break;
            }
            else if (response.equalsIgnoreCase(Main.res.getString("no"))) {
                break;
            }
            else
                System.out.println(Main.res.getString("21"));
        }
        System.out.println("\n" + Main.res.getString("22"));
        double opacity, cost, weight;
        while (true) {
        	opacity = sc.nextDouble();
        	if (opacity <= 1 && opacity > 0) {
        		break;
        	}
        	else {
        		System.out.println(Main.res.getString("23"));
        	}
        }
        cost = sc.nextDouble();
        weight = sc.nextDouble();
        stones.add(new Amber(processed, weight, cost, opacity));
        System.out.println("\n" + Main.res.getString("24"));
    }
    
    /**
     * Здесь с помощью сканера вводим данные, создаем объект Malachite и добавляем в список
     */
    public void addMalachite() {
       
        Scanner sc = new Scanner(System.in);
        boolean processed = false;
        System.out.println("\n" + Main.res.getString("25"));
        while (true) {
            String response = sc.nextLine();
            if (response.equalsIgnoreCase(Main.res.getString("yes"))) {
                processed = true;
                break;
            }
            else if (response.equalsIgnoreCase(Main.res.getString("no"))) {
                break;
            }
            else
                System.out.println(Main.res.getString("21"));
        }
        System.out.println("\n" + Main.res.getString("22"));
        double opacity, cost, weight;
        while (true) {
        	opacity = sc.nextDouble();
        	if (opacity <= 1 && opacity > 0) {
        		break;
        	}
        	else {
        		System.out.println(Main.res.getString("23"));
        	}
        }
        cost = sc.nextDouble();
        weight = sc.nextDouble();
        stones.add(new Malachite(processed, weight, cost, opacity));
        System.out.println("\n" + Main.res.getString("26"));
    }
    
    /**
     * Здесь с помощью сканера вводим данные, создаем объект Diamond и добавляем в список
     */
    public void addDiamond() {
    	int flag = 0;
    	String color = "";
    	Scanner sc = new Scanner(System.in);
    	while(flag == 0){
	        System.out.println(Main.res.getString("27"));
	        int choiceColor = sc.nextInt();
	        switch (choiceColor) {
		        case 1:
		            color = Main.res.getString("28");
		            flag = 1;
		            break;
		        case 2:
		        	color = Main.res.getString("29");
		            flag = 1;
		            break;
		        case 3:
		        	color = Main.res.getString("30");
		            flag = 1;
		            break;
				case 4:
					color = Main.res.getString("31");
		            flag = 1;
		            break;
				case 5:
					color = Main.res.getString("32");
		            flag = 1;
		            break;
		        default:
		            System.out.println(Main.res.getString("12"));
		            break;
	        }
    	}
        System.out.println("\n" + Main.res.getString("33"));
        double opacity, cost, weight;
        while (true) {
        	opacity = sc.nextDouble();
        	if (opacity <= 1 && opacity > 0) {
        		break;
        	}
        	else {
        		System.out.println(Main.res.getString("23"));
        	}
        }
        cost = sc.nextDouble();
        weight = sc.nextDouble();
        stones.add(new Diamond(color, opacity, cost, weight));
        System.out.println("\n" + Main.res.getString("34"));
    }
    
    /**
     * Здесь с помощью сканера вводим данные, создаем объект Ruby и добавляем в список
     */
    public void addRuby() {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\n" + Main.res.getString("35"));
        int hardness = sc.nextInt();
        System.out.println("\n" + Main.res.getString("33"));
        double opacity, cost, weight;
        while (true) {
        	opacity = sc.nextDouble();
        	if (opacity <= 1 && opacity > 0) {
        		break;
        	}
        	else {
        		System.out.println(Main.res.getString("23"));
        	}
        }
        cost = sc.nextDouble();
        weight = sc.nextDouble();
        stones.add(new Ruby(hardness, opacity, cost, weight));
        System.out.println("\n" + Main.res.getString("36"));
    }

    public void delete() {
        show();
        if(stones.isEmpty())
            return;
        System.out.println(Main.res.getString("37") + ": ");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        if(index > stones.size())
            System.out.println(Main.res.getString("38"));
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
        System.out.println(Main.res.getString("39") + " " + rubFormat.format(sumCost));
    }

    public void totalWeigth() {
    	double sumWeigth = 0;
    	for (Stone stone:stones){
    		sumWeigth += stone.getWeight();
    	}
        System.out.println(Main.res.getString("40") + " " + sumWeigth + Main.res.getString("19"));
    }

    public void opacityChoice() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println(Main.res.getString("41") + " ");
    	double from = sc.nextDouble();
    	System.out.println("\n" + Main.res.getString("42") + " ");
    	double to = sc.nextDouble();
    	
    	for (Stone stone:stones){
    		if(from < stone.getOpacity() && to > stone.getOpacity()){
    			stone.show();
    		}
    	}
    	if(stones.isEmpty()) {
        System.out.println("\n" + Main.res.getString("43"));
        return;
    	}
    }
    

}