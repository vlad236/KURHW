
public class Task5 {

	public static void main(String[] args) {
		int mass [] = new int[10];//������� ������ �� 10 ���������
		int symma = 0;
		//��������� ������ ���������� �������
		for (int i = 0; i < mass.length; i++){
			mass[i] = (int)(Math.random()*10);
			System.out.print(mass[i] + " ");
		}
		//��������� ����� �� ������� ����
		for (int i = 0; i < mass.length; i++){
			if (mass[i] == 0)
			break;	
			symma += mass[i];
		}
		//������� �����
		System.out.println("����� ��������� ������� �� ������� �������� �������� = " + symma);
	}

}
