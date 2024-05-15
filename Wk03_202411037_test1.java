import java.util.Scanner;

public class Wk03_202411037_test1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int kor, eng, mat;
		
		System.out.print("국어점수를 입력하세요:");
		kor = scanner.nextInt();
		
		System.out.print("영어점수를 입력하세요:");
		eng = scanner.nextInt();
		
		System.out.print("수학점수를 입력하세요:");
		mat = scanner.nextInt();
		
		int hap = kor+eng+mat;
		double ave = (double)hap / 3.0;
		
		System.out.println("국어점수:"+kor);
		System.out.println("영어점수:"+eng);
		System.out.println("수학점수:"+mat);
		System.out.println("총합:"+hap);
		System.out.printf("평균:%.2f",ave);
		scanner.close();

	}

}