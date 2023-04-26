package inflearn07_string_palindrome;

import java.util.Scanner;

public class Main {
	
	public static String solution(String str) {
		
		String answer = "";
		
		for(int i=0; i<str.length(); i++) {
			
			System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));
			
			if(str.indexOf(str.charAt(i)) == i) {
				answer += str.charAt(i);
			}
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