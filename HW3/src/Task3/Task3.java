
public class Task3 {

	public static void main(String[] args) {
		int [] mass = new int[15];// ������� ������ �� 15 ���������
		int index = 0;
		//��������� ������ ���������� �������
		for (int i = 0; i < mass.length; i++){
			mass[i] = (int)(Math.random()*10 + 1);
			System.out.print(mass[i] + " ");
		}
		int min = mass[0];
		//������� ����������� ������� � ��� ������
		for (int i = 1; i < mass.length; i++){
			if (min > mass[i]){
			min = mass[i];
			index = i+1;
			}
		}
		//������� ������ ���������� ��������
		System.out.println("\n������ ������������ �������� �������: " + index);
	}

}
