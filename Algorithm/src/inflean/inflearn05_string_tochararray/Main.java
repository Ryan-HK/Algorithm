package inflearn05_string_tochararray;

import java.util.Scanner;

public class Main {
	
	public static String solution(String str) {
		
		char[] chArr = str.toCharArray();
		
		int lt = 0, rt = str.length()-1;
		
		while(lt<rt) {
			if(!Character.isAlphabetic(chArr[lt])) lt++;
			else if(!Character.isAlphabetic(chArr[rt])) rt--;
			
			else {
				char tmp = chArr[lt];
				chArr[lt] = chArr[rt];
				chArr[rt] = tmp;
				
				lt++;
				rt--;
			} // if-else
			
		} // while
		
		return String.valueOf(chArr);
		
	} // solution

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		System.out.println(solution(str));
		
		sc.close();
	} // main

} // end class