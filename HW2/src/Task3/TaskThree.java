import java.util.Scanner;

public class TaskThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //������� ������ sc ���� scanner
		System.out.print("������� �������: ");
		double dividend = sc.nextDouble(); //������� ������ divident ���� double, � ������� �������� �������� ����� ��������� � ���������� 
		System.out.print("������� ��������: ");
		int divider = sc.nextInt(); //������� ������ divider ���� int, � ������� �������� �������� ����� ��������� � ����������
		if (divider == 0) //�������� �������� �� ����
			System.out.println("�� ���� ������ ������!");
		else {
			double result = dividend / divider;
			System.out.println("������� " + result);
		}
		sc.close();
	}

}
