import java.util.Scanner;

public class TaskTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); //������� ������ sc ���� Scanner
		System.out.print("������ �����: ");
		int firstNumber = sc.nextInt(); //��������� ������ firstNumber , ���������� ��������, ����� ��������� � ����������
		System.out.print("������ �����: ");
		int secondNumber = sc.nextInt(); //��������� ������ secondNumber
		if (firstNumber > secondNumber) //�������� if, ������� ���������� ��� �����
			System.out.println("����� " + firstNumber + " ������, ��� " + secondNumber);
		else
			System.out.println("����� " + secondNumber + " ������, ��� " + firstNumber);
		sc.close();
	}

}
