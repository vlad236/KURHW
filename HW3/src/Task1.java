
public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float mass[] = {4.5f,6.7f,3.0f,7f,4.0f,1.4f,5.6f,3.4f,6.7f,9.0f};
		float n = 0;
		//������� �������� �������
		for (int i = 0; i<10; i++){
			System.out.print(mass[i] + " | ");
		}
		//������� ����� ��������� �������
		for (int i = 0; i<10; i++){
			n+= mass[i];
		}
		System.out.println("\naverage value = " + n/mass.length); //������� ������� ��������������� 
	}

}
