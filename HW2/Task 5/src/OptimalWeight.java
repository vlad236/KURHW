import java.util.Scanner;

public class OptimalWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ��� ����(��.): "); 
		int height = sc.nextInt(); //������� ������ height ���� int, � ������� � ���������� ����� ��������� ������ � �����
		System.out.println("������� ��� ���(��.): ");
		int weight = sc.nextInt(); //������� ������ weigth ���� int, � ������� � ���������� ����� ��������� ������ � ����
		if (weight > height - 100) //��������� �������� �� ��� ������ ������������
			System.out.println("��� ��� ������ ������������. ��� ���������� ��������");
		else
			if (weight < height - 100) //��������� �������� �� ��� ������ ������������
				System.out.println("��� ��� ������ ������������. ��� ���������� �����������");
			else 
				System.out.println("�����������! ��� ��� �������� �����������");
	}

}
