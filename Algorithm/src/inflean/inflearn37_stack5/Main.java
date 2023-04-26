package inflearn37_stack5;

import java.util.Scanner;
import java.util.Stack;


public class Main {

	public static int solution(String s) {
		Stack<Character> stack = new Stack<>();
		int answer = 0;
		
		char prex = '0';

		for(char x : s.toCharArray()) {
			
			if(x == '(') {
				
				stack.push(x);
				
			} else {
				
				if(prex == '(') {
					stack.pop();
					
					answer += stack.size();
				} else if (prex == ')') {
					stack.pop();
					
					answer += 1;
				}
				
			}
			
			prex = x;
			
		}
		
		return answer;
	} // solution	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		System.out.println(solution(s));
	
	} // main

} // end class
