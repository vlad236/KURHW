import java.util.Scanner;

public class RUB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ����� � ������ �� 0 �� 999: ");
		int rub = sc.nextInt(); // ������� ������ rub ���� int, � ������� �������� �������� � ���������� 
		if (rub >= 0 && rub < 1000){ //��������� ����� ����� ���� ������� � �������� ��������� �� 0 �� 999
			if (rub % 10 == 1 && rub % 100 != 11) // ������� ��� "�����"
				System.out.println(rub + " �����");
			else 
				if (rub % 10 > 1 && rub % 10 < 5 && rub % 100 !=12 && rub % 100 !=13 && rub % 100 !=14)
					System.out.println(rub + " �����"); //������� ��� "�����"
				else
					System.out.println(rub + " ������"); //�� ���� ��������� ������� ������
		}
		else
			System.out.println("����� ������� �� ���������!");
	}

}
