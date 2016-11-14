
public class Task5 {

	public static void main(String[] args) {
		 String str1 = "asdzxcqwew";
	        String str2 = "zxcqweasdw";

	        char[] charArray1 = str1.toCharArray();
	        char[] charArray2 = str2.toCharArray();
	        //Проверям совпадает ли длинна
	        if (charArray1.length != charArray2.length) {
	            System.out.println("Не является");
	            return;
	            
	        }

	        for(int i = 0; i < charArray1.length; i++) {
	            int countStr1 = 0;
	            int countStr2 = 0;
	            for(int j = 0; j < charArray1.length; j++) {
	                if (charArray1[i] == charArray1[j]) {
	                    countStr1++;
	                }
	            }
	            for(int j = 0; j < charArray2.length; j++) {
	                if (charArray1[i] == charArray2[j]) {
	                    countStr2++;
	                }
	            }
	            if (countStr1 != countStr2) {
	                System.out.println("Не является");
	                return;
	                
	            }
	        }

	}

}
