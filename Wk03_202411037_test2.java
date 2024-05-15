import java.util.Scanner;

public class Wk03_202411037_test2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nam, gkr;
		double wja;
		
		System.out.print("이름을 입력하세요:");
		nam = scanner.next();
		
		System.out.print("학과를 입력하세요:");
		gkr = scanner.next();
		
		System.out.print("학점을 입력하세요:");
		wja = scanner.nextDouble();
		
		System.out.println("이름 : "+nam);
		System.out.println("학과 : "+gkr);
		System.out.println("학점 : "+wja);
		
		System.out.print(nam+" 학우 소속은 "+gkr+"이며 학점은 "+wja+"점 입니다.");
		
		scanner.close();

	}

}