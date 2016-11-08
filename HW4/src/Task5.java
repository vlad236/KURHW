
public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strFirst = "qwerty";
		String strSecond = "twreqy";
		int count = 0;
		char[] charArrayFirst = strFirst.toCharArray();
		char[] charArraySecond = strSecond.toCharArray();
		if (charArrayFirst.length != charArraySecond.length)
			System.out.println("—трока не €вл€етс€ перестановкой другой строки");
		else
			for (int i = 0; i < charArrayFirst.length; i++){
				for (int j = 0; j < charArraySecond.length; j++){
					if (charArrayFirst[i] == charArraySecond[j])
					count++;
				}
			}
		if (count == charArrayFirst.length)
			System.out.println("—трока €вл€етс€ перестановкой другой строки");
		else 
			System.out.println("—трока не €вл€етс€ перестановкой другой строки");
		}

	}