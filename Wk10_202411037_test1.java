import java.util.Scanner;

public class Wk10_202411037_test1 {
	static boolean IsAlpha(String p, int len) {
		for (int i = 0; i <= len-1; i++) {
			char k = p.charAt(i);
			if ( Character.isAlphabetic(k))
				continue;
			else
				return false;		
		}
		return true;		
	}	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String pas;		
		while (true) {
			System.out.print("새로운 비밀번호 입력 : ");
			pas = scanner.next();
		
			int len = pas.length();		
			if (len >= 8) {
			
				if (IsAlpha(pas, len)) {
					System.out.print("비밀번호가 성공적으로 생성되었습니다!");
				break;
				}
				else
					System.out.println("비밀번호 생성 규칙이 맞지 않습니다!");
			}
			else
				System.out.println("비밀번호 생성 규칙이 맞지 않습니다!");						
		}
		scanner.close();
	}		
}