
public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "vnm,cxb    rtijh....\\\\h";
		String newstr = "";
		char[] charArray = str.toCharArray();//��������� ������ �� ������ �����
		//���������� � ����� ������ ������ ����� � �������
		for (char ch: charArray){
			if (Character.isLetter(ch) || Character.isWhitespace(ch))
				newstr += ch;
		}
		System.out.print(newstr);
	}

}