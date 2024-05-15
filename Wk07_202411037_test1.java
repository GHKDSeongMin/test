
public class Wk07_202411037_test1 {

	public static void main(String[] args) {
		int num = 0;
		
		for (int i = 1; i<=5; i++) {
			for (int j = i; j<=5; j++) {
				System.out.print(j);
			}
			System.out.println();
			num++;
				for(int k = 1; k<=num; k++)
					System.out.print(" ");
		}

	}

}
