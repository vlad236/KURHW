
public class Task4 {

	public static void main(String[] args) {
		String str = "qwert";
		int count = 0;
		char[] charArray = str.toCharArray();//��������� ������ �� ������ �����
		//���������� ���������� � �������
		for (int i = 0; i < charArray.length; i++){
		 for (int j = 0; j < charArray.length; j++){
			 if (charArray[i] == charArray[j])
			 count++;
		 }
		}
		//���������� �������� � �������� � ������ ������
		if (count > charArray.length)
			System.out.println("� ������ ���� �������, ������� ����������� ������ ������ ����");
		else
			System.out.println("��� ������� � ������, ����������� ���� ���");
	}

}
