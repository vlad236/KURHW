
public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mass[] = new int[10];
		for (int i = 0; i < mass.length; i++){ //���� �� ���������� ���������� �������
			mass[i] = (int)(Math.random()*10);
			System.out.print(mass[i] + " ");
		}
		System.out.println(" ");
		int countZero = 0; //���������� , � ������ ����� ��������� ���������� ������������ �����
        for(int i = 0; i < mass.length - 1; i++) { //����, � ����� �� ���������� ���� �������� �������
            if(mass[i] == 0) { //������� ����
                for (int j = i; j < mass.length - 1; j++) { //��������� ��� ����������� � �����
                    int temp = mass[j];
                    mass[j] = mass[j + 1];
                    mass[j + 1] = temp;
                }
                i--; //������������ �� ���� ������� �����, ����� ��������� ������� �����, ������ ���� �� ������
                countZero++;
            }
            if (i == mass.length - countZero)// �����, � ������, ���� ��� ���� ����� ��� � �����, ����� ���������� �� �����������
                break;
        }
        for(int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }
	}

}
