
public class Wk02_202411037_test2 {

	public static void main(String[] args) {
		int kor=90;
		int eng=80;
		int mat=100;
		int hap=kor + eng + mat;
		double ave=hap/3.0;
		
		System.out.println("국어"+"="+kor);
		System.out.println("영어"+"="+eng);
		System.out.println("수학"+"="+mat);
		System.out.println("총점"+"="+hap);
		System.out.printf("평균=%.2f",ave);
		
	}

}