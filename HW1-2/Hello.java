import java.io.UnsupportedEncodingException;
import java.util.Scanner;
public class Hello {

	public static void main(String[] args) throws UnsupportedEncodingException {
		Scanner sc = new Scanner(System.in, "Cp866");	//Кодировка устанавливается 
								//в соответствии с кодировкой консоли
		System.out.println("Введите ваше имя: ");
		String name = sc.nextLine();
		System.out.println("Привет, " + name);
	}
}