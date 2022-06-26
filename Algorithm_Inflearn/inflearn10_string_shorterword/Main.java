package inflearn10_string_shorterword;

import java.util.Scanner;

public class Main {
	
	public static int[] solution(String str, char c) {	
		
		int[] answer = new int[str.length()];
		
		int count = 1000;
		
		for(int i=0; i<str.length(); i++) {
		
			if(str.charAt(i) == c) {
				answer[i] = 0;
				count = 0;
			} else {
				count++;
				answer[i] = count;
			} // if-else

		} // for
		
		count = 1000; 
		for(int i=str.length()-1; i>=0; i--) {
			
			if(str.charAt(i) == c) {
				count = 0;
			}
			
			count ++;
		}
		
		return answer;
		
		
	} // solution

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		char c = sc.next().charAt(0);
		
		for(int s : solution(str, c)) {
			System.out.print(s + " ");
		}
		
		sc.close();
	} // main

} // end class