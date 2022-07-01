package inflearn34_stack_2;

import java.util.Scanner;
import java.util.Stack;


public class Main {
	
	public static String solution(String s) {
		Stack<Character> stack = new Stack<>();
		String answer = "";

		for(char x : s.toCharArray()) {		
			if( x == ')') {
				
				while(stack.pop() != '(') {}	
			} else stack.push(x);		
		}
		
		for(int i=0; i<stack.size(); i++) {
			answer += stack.get(i);
		}
		return answer;
	} // solution	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		System.out.println(solution(s));
	
	} // main

} // end class
