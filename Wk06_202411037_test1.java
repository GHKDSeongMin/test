import java.util.Scanner;

public class Wk06_202411037_test1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		boolean flag=true;
		
		System.out.print("원하는 숫자?");
		num = scanner.nextInt();
		
		for (int i=2; i<num; i++) {
			if (num % i == 0) {
				flag=false;
				break;
				
			}			
		}
		
		if (flag == true)
			System.out.print(num+"은(는) 소수입니다.");
		else
			System.out.print(num+"은(는) 소수가 아닙니다.");
		
		scanner.close();
	}

}