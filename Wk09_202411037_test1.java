import java.util.Scanner;

public class Wk09_202411037_test1 {
	static String fruits(String fru) {
		return fru.toUpperCase();
	}
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String fru;
		
		do {
			System.out.print("과일 이름:");
			fru = scanner.next();
			
			System.out.println(fruits(fru)+"....."+fru.length());
			
		} while (!fru.equals("end") || !fru.equals("END"));
		
		
		scanner.close();
		
		System.out.print("프로그램 종료");

	}

}