package inflearn02_string_to_upper_lower_case;

import java.util.Scanner;

public class Main {
	
	public static int solution(String str, char c) {
		
		char[] strArr = str.toLowerCase().toCharArray();
		
		char ch = Character.toLowerCase(c);
		int count = 0;
		
		for(int i=0; i<strArr.length; i++) {
			
			if(ch == strArr[i]) {
				count++;
			} // if
			
		} // for
		
		return count;
		
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String input1 = in.next();
		char input2 = in.next().charAt(0);
		
		System.out.println(solution(input1, input2));
		
	} // main

}