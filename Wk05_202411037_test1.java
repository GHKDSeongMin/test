import java.util.Scanner;

public class Wk05_202411037_test1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("수식을 입력 하시오:");
		
		int nu1 = scanner.nextInt();
		String ope = scanner.next();
		int nu2 = scanner.nextInt();
		
		int ejt = nu1 + nu2;
		int Qof = nu1 - nu2;
		int rhq = nu1 * nu2;
		int sks = nu1 / nu2;
		int ska = nu1 % nu2;
			
		switch (ope) {
			case "+" :
				System.out.print(nu1+"+"+nu2+"="+ejt);
				break;
			case "-" :
				System.out.print(nu1+"-"+nu2+"="+Qof);
				break;
			case "*" :
				System.out.print(nu1+"*"+nu2+"="+rhq);
				break;
			case "/" :
				System.out.print(nu1+"/"+nu2+"="+sks+" 나머지는..."+ska);
			break;
							
		}
		
		scanner.close();
		
	}

}