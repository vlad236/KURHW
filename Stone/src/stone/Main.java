package stone;
import java.sql.Date;
import java.text.DateFormat;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Main {
	public static ResourceBundle res;
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
	    Locale loc = new Locale ("en", "EN");
	    boolean isRu = false;
	    res = ResourceBundle.getBundle("Res", loc);
	    System.out.println(res.getString("14") + ": " + loc.getDisplayName());
	    Date now = new Date(1);
	    DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, loc);
	    System.out.println(res.getString("15") + ": " + df.format( now));
	    
	    StoneUtil util = new StoneUtil();
        do {
        	try {
	            System.out.println("\n\t"+ res.getString("0"));
	            System.out.println("\n0."+ res.getString("20"));
	            System.out.println("1." + res.getString("1"));
	            System.out.println("2." + res.getString("2"));
	            System.out.println("3."+ res.getString("3"));
				System.out.println("4."+ res.getString("4"));
	            System.out.println("5."+ res.getString("5"));
	            System.out.println("6."+ res.getString("6"));
	            System.out.println("7."+ res.getString("7"));
	            System.out.println("8."+ res.getString("8"));
	            System.out.println("9."+ res.getString("9"));
	            System.out.println("10."+ res.getString("10"));
	            System.out.print(res.getString("11") + ": ");
				int choice = sc.nextInt();
	            switch (choice) {
	            	case 0:
	            		res.clearCache();
	            		Locale locale;
	            		if (isRu) {
	            			locale = new Locale ("en", "EN");
	            			isRu = false;
	            		}
	            		else {
	            			locale = new Locale ("ru", "RU");
	            			isRu = true;
	            		}
	                    res = ResourceBundle.getBundle("Res", locale);
	            		break;
	                case 10:
	                	sc.close();
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
	                    util.addRuby();
	                    break;
	                case 5:
	                    util.addMalachite();
	                    break;
	                case 6:
	                    util.delete();
	                    break;
	                case 7:
	                    util.sort();
						break;
	                case 8:
	                    util.totalCost();
	                    util.totalWeigth();
						break;
	                case 9:
	                    util.opacityChoice();
	                    break;
	                default:
	                    System.out.println(res.getString("12"));
	                    break;
	            }
        	}
        	catch(InputMismatchException ex) {
        		System.out.println(res.getString("13"));
        	}
        } while (true);
    }

}