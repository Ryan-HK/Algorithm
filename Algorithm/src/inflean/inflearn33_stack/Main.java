package inflearn33_stack;

import java.util.Scanner;
import java.util.Stack;


public class Main {
	
	public static String solution(String s) {
		Stack<Character> stack = new Stack<>();
		

		
//		for(int i=0; i<s.length(); i++) {
//			
//			try {
//				if(stack.peek() == '(' && s.charAt(i) == ')' ) {
//					stack.pop();
//				} else {
//					stack.push(s.charAt(i));
//				}
//			} catch (Exception e) {
//				stack.push(s.charAt(i));
//			}	
//			
//		} // for
		
		
//		1. '(' 이면 push 한다.
//		2. 아닐 경우, 만약 비어있다면 -> return "NO";
//		3. 아니라면! 이전 요소를 뺀다!
		for(char x : s.toCharArray()) {
			if(x=='(') stack.push(x);
			
			else {
				if(stack.isEmpty()) return "NO";
				stack.pop();
			}
		}
		
		if(stack.isEmpty()) {
			return "YES";
		} else {
			return "NO";
		} // if-else
		
		
	} // solution	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		System.out.println(solution(s));
	
	} // main

} // end class
