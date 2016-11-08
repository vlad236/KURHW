import java.util.Scanner;

public class RUB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Ââåäèòå ñóììó â ğóáëÿõ îò 0 äî 999: ");
		int rub = sc.nextInt(); // Ñîçäàåì îáúåêò rub òèïà int, â êîòîğîì çíà÷åíèå ââîäèòñÿ ñ êëàâèàòóğû 
		if (rub >= 0 && rub < 1000){ //Ïğîâåğÿåì ÷òîáû ÷èñëî áûëî ââåäåíî â çàäàííîì äèîïàçîíå îò 0 äî 999
			if (rub % 10 == 1 && rub % 100 != 11) // Óñëîâèÿ äëÿ "Ğóáëü"
				System.out.println(rub + " Ğóáëü");
			else 
				if (rub % 10 > 1 && rub % 10 < 5 && rub % 100 !=12 && rub % 100 !=13 && rub % 100 !=14)
					System.out.println(rub + " Ğóáëÿ"); //Óñëîâèå äëÿ "Ğóáëÿ"
				else
					System.out.println(rub + " Ğóáëåé"); //Âî âñåõ îñòàëüíûé ñëó÷àÿõ Ğóáëåé
		}
		else
			System.out.println("×èñëî ââåäåíî íå êîğğåêòíî!");
	}

}
