import java.util.Scanner;

public class Wk04_202411037_test1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("과일을 맞추시오: ");
		String fru = scanner.next();
		
		if (fru.equals("바나나")) {
			System.out.print("정답입니다.");
		}
		else {
			System.out.print("틀렸습니다.");
		}
		scanner.close();
				

	}

}
