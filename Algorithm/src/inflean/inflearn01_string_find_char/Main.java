package src.inflean.inflearn01_string_find_char;

import java.util.Scanner;

public class Main {
	
	public static String solution(String str) {
		
//		char[] strArr = str.toCharArray();
		

		/*
		 * [아스키코드]
		 * 대문자 : 65 ~ 90
		 * 소문자 : 97 ~ 122
		 */
		
		String answer="";
		
		/*
		 * [아스키코드]
		 * 대문자 : 65 ~ 90
		 * 소문자 : 97 ~ 122
		 */
		
//		for(int i=0; i<strArr.length; i++) {
//			
//			if(strArr[i] > 91) {
//				strArr[i] = Character.toUpperCase(strArr[i]);
//			} else {
//				strArr[i] = Character.toLowerCase(strArr[i]);
//			}
//			
//		} // for
		
		for(char x : str.toCharArray()) {
			
			if(Character.isLowerCase(x)) {
				answer += Character.toUpperCase(x);
			} else {
				answer += Character.toLowerCase(x);
			}
			
		} // enhanced for
		
		return answer;
		
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String input1 = in.next();

		
		System.out.println(solution(input1));
		
	} // main

}