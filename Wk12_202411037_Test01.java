
public class Wk12_202411037_Test01 {

	public static void main(String[] args) {
		int jumsu[][] = {{90, 90, 80}, {80, 95, 80,}, {80, 80, 90}, {90, 70, 95}, {60, 65, 70}};
				
		for (int i = 0; i<jumsu.length; i++) {
			double ave = 0;
			int total = 0;
			for (int j = 0; j<jumsu[i].length; j++) {							
				System.out.print(jumsu[i][j]+" ");
				total += jumsu[i][j];				
			}
			ave = total/3.0;
			System.out.printf("%d %.2f%n",total,ave);
		}
	}

}