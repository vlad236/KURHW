
public class Task4 {

	public static void main(String[] args) {
		String str = "qwert";
		int count = 0;
		char[] charArray = str.toCharArray();//Разбиваем строку на массив чаров
		//Записываем повторения в счетчик
		for (int i = 0; i < charArray.length; i++){
		 for (int j = 0; j < charArray.length; j++){
			 if (charArray[i] == charArray[j])
			 count++;
		 }
		}
		//Сравниваем значение в счетчике и длинну строки
		if (count > charArray.length)
			System.out.println("В строке есть символы, которые встречаются больше одного раза");
		else
			System.out.println("Все символы в строке, встречаются один раз");
	}

}
