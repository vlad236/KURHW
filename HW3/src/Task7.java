
public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mass[][] = new int[5][5];
		int mainDiagonal = 0;
		int adverseDiagonal = 0;
		System.out.print("Исходный массив nхn:");
		System.out.print("\n");
		for (int i = 0; i < mass.length; i++){
			 for(int j = 0; j < mass.length; j++){
				mass[i][j] = (int)(Math.random()*10);
				System.out.print(mass[i][j] +  "  ");
			 }
			 System.out.print("\n");
		}
		for (int i = 0; i < mass.length; i++){
			 for(int j = 0; j < mass.length; j++){
				 if(Math.abs(mass.length - i - 1) == j)
					adverseDiagonal += mass[i][j];
				 if (i == j)
					mainDiagonal += mass[i][j]; 
			 }
		}
		System.out.println("Сумма элементов побочной диагонали = " + adverseDiagonal);
		System.out.println("Сумма элементов главной диагонали = " + mainDiagonal);
	}

}
