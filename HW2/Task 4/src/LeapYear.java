import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("������� ���: ");
		int year = sc.nextInt(); // ������� ������ year ���� int, �������� � ������� ����� ��������� � ����������0
		if (year > 0){ //��������� ����� ����� ���� ������� ������ 0
			if (year % 4 == 0){ //��������� �������� �� ��� ����������
				System.out.println(year + " " + "��� �������� ����������");
			}
			else
				System.out.println(year + " " + "��� �� �������� ����������");
		}
		else
			System.out.println("������� ��� ���������, �������� �� ����� ���� ������ ����");
	}

}
