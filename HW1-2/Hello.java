import java.io.UnsupportedEncodingException;
import java.util.Scanner;
public class Hello {

	public static void main(String[] args) throws UnsupportedEncodingException {
		Scanner sc = new Scanner(System.in, "Cp866");	//��������� ��������������� 
								//� ������������ � ���������� �������
		System.out.println("������� ���� ���: ");
		String name = sc.nextLine();
		System.out.println("������, " + name);
	}
}