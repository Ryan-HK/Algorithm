package inflearn09_string_pallindrome_onlynum;

import java.util.Scanner;

public class Main {
	
	public static int solution(String str) {	
		
		str = str.replaceAll("[^\\d]", "");
		
		int answer = Integer.valueOf(str);
		
		return answer;
		
		
	} // solution

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		System.out.println(solution(str));
		
		sc.close();
	} // main

} // end class