
public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "sdaDgfdgf";
		str = str.toLowerCase();
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		char[] charArray = str.toCharArray();//Разбиваем строку на массив чаров
		//Вывод строки 
		for (int i = 0; i < charArray.length; i++){
			System.out.print(charArray[i] + "  ");
		}
		System.out.println();
		//Вывод индексов элементов
		for (int i = 0; i < charArray.length; i++){
			if ((alphabet.indexOf(charArray[i]) + 1) > 9)
				System.out.print((alphabet.indexOf(charArray[i]) + 1) + " ");
			else
				System.out.print((alphabet.indexOf(charArray[i]) + 1) + "  ");
		}
		

	}

}
