import java.util.Scanner;

public class Wk04_202411037_test2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력하시오:");
		int num = scanner.nextInt();
		
		if (100 <= num&&num < 1000) 
			System.out.print("100이상 1000미만.");
		
		else if ( num >= 1000) 
			System.out.print("1000이상.");
		
		else if ( num < 100) 
			System.out.print("100미만.");
		
		
		scanner.close();
			

	}

}
