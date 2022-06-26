package inflearn11_string_compression;

import java.util.Scanner;

public class Main {
	
	public static String solution(String str) {	
		
		String answer = "";
		
		str = str + " ";
		int pos = 1;
		
		for(int i=0; i<str.length()-1; i++) {
			
			if(str.charAt(i) == str.charAt(i+1)) {
				pos++;
			} else {
				answer += str.charAt(i);
				
				if(pos>1) {
					answer += String.valueOf(pos);
					pos = 1;
				} // if
				
				pos = 1;
			}
		}
		
		
		return answer;
		
		
		
	} // solution

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		System.out.println(solution(str));

		sc.close();
	} // main

} // end class