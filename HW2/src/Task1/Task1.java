package Task1;

public class Task1 {

	public static void main(String[] args) {
		String str = "Проверка"; //Создание переменной типа String
		System.out.println("Исходное слово: " + str);
		System.out.println("Длинна слова: " + str.length());
		String strFirst = str.substring(0, str.length()/2); //Создаем переменную, в которой хранится первая часть слова
		String strSecond = str.substring(str.length()/2, str.length()); //Создаем переменную, в которой хранится вторя часть слова
		System.out.println("Первая половина слова: " + strFirst);
		System.out.println("Вторая половина слова: " + strSecond);
	}

}
