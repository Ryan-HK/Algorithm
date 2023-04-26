package inflearn06_string_deduplication;

import java.util.Scanner;

public class Main {
	
	public static String solution(String str) {
		
		String answer = "YES";
		
		char[] cArr = str.toLowerCase().toCharArray();
		
		int lt=0, rt=cArr.length-1;
		
		for(int i=0; i<cArr.length/2; i++) {
			
			if(cArr[lt] != cArr[rt]) {
				answer = "NO";
				break;
			} // if
			
			lt++;
			rt--;
		} // for
		
		return answer;

		
	} // solution

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		System.out.println(solution(str));
		
		sc.close();
	} // main

} // end class