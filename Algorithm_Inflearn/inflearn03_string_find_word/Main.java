package inflearn03_string_find_word;


import java.util.Scanner;

public class Main {
	
	public static String solution(String str) {
		
		String answer="";
		
		int m = Integer.MIN_VALUE, pos;
		
		
		// spilt()를 사용하는 방법
		
//		String[] strArr = str.split(" ");
//		
//		for(String temp : strArr) {
//			
//			if(temp.length() > answer.length()) {
//				answer = temp;
//			}
//		}
		
//		indexOf()와 substring()을 이용한 방법
		
		while( (pos = str.indexOf(' ')) != -1) {
			String tmp = str.substring(0, pos);
			
			if(tmp.length() > answer.length()) {
				answer = tmp;
			}
			
			str = str.substring(pos+1);
			
		} // while
		
		if(str.length() > answer.length()) {
			answer = str;
		}
		
		
		return answer;
		
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String input1 = in.nextLine();

		
		System.out.println(solution(input1));
		
	} // main

}