
public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mass[] = new int[10];
		int max = 0;
		int min = 99999999;
		for (int i = 0; i < mass.length; i++){
			mass[i] = (int)(Math.random()* 10 + 1);
			System.out.print(mass[i] + " | ");
		}
		//������� ���������� �������� �������
		for (int i = 0; i < mass.length; i++){
			if (max < mass[i])
			max = mass[i];
		}
		//������� ���������� �������� �������
		for (int i = 0; i < mass.length; i++){
			if (min > mass[i])
			min = mass[i];	
		}
		//������� ���������� � ���������� ��������
		System.out.println("\nmin value: " + min);
		System.out.println("max value: " + max);
	}

}
