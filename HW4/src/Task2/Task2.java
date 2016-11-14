
public class Task2 {

	public static void main(String[] args) {
		String str = "vnm,cxb    rtijh....\\\\h";
		String newstr = "";
		char[] charArray = str.toCharArray();//–азбиваем массив на строку чаров
		//«аписываем в новую строку только буквы и пробелы
		for (char ch: charArray){
			if (Character.isLetter(ch) || Character.isWhitespace(ch))
				newstr += ch;
		}
		System.out.print(newstr);
	}

}