import java.util.Scanner;

public class Week {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in); //������� ������ sc ���� Scanner
		System.out.println("������� ����� ��� ������: ");
		Byte dayOfWeek = sc.nextByte(); //���������� ������� ��� ������ 
		switch(dayOfWeek){ //���������� ������� ��� ������ ����� ������������� ��������� Switch
			case 1:
				System.out.println("�����������");
				break;
			case 2:
				System.out.println("�������");
				break;
			case 3:
				System.out.println("�����");
				break;
			case 4:
				System.out.println("�������");
				break;
			case 5:
				System.out.println("�������");
				break;
			case 6:
				System.out.println("�������");
				break;
			case 7:
				System.out.println("�����������");
				break;
			default:
				System.out.println("������� �� ������ �����, ��� ������ � ����� ������� ���");
		}	
	}

}
