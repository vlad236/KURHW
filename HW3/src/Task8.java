
public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mass[][] = new int[5][5];
		System.out.println("Исходный массив:");
		for (int i = 0; i < mass.length; i++){
			for (int j = 0; j < mass.length; j++){
				mass[i][j] = (int)(Math.random()*10);
				System.out.print(mass[i][j] + "  ");
			}
			System.out.print("\n");
		}
		for (int i = 0; i < mass.length; i++){
			for (int j = 0; j < mass.length; j++){
			if (i == j)
				mass[i][j] = ;
			}
		}	
	}

}
