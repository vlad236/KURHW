import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("¬ведите год: ");
		int year = sc.nextInt(); // создаем объект year типа int, значение в который будет заноситс€ с клавиатуры0
		if (year > 0){ //ѕровер€ем чтобы число было введено больше 0
			if (year % 4 == 0){ //ѕровер€ем €вл€етс€ ли год високосным
				System.out.println(year + " " + "год €вл€етс€ високосным");
			}
			else
				System.out.println(year + " " + "год не €вл€етс€ високосным");
		}
		else
			System.out.println("¬ведите год правильно, значение не может быть меньше нул€");
	}

}
