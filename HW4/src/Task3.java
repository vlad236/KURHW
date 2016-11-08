import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "sdgfbh gfsdhj afg gfg fdgff";
		System.out.println(str);
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите длинну слова: ");
		StringBuilder sb = new StringBuilder();
		int lengthWord = sc.nextInt();
		String[] charArray = str.split(" "); //разбиваем текст на массив слов
		for (int i = 0; i < charArray.length; i++){
			char first = charArray[i].charAt(0); //Первая буква слова
			//Исключаем слова не подходящие по нашим параметрам
			if(!((charArray[i].length() == lengthWord) && ((first == 'a')||(first == 'e')||(first == 'i')||(first == 'o')||(first == 'u')||(first == 'y')))){
				sb.append(charArray[i]).append(" ");
			}
		}	
		String outText = sb.toString().trim();
		System.out.print(outText+" "+"\n\n");
		sc.close();
	}

}
