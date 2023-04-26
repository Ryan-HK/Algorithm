package inflearn36_stack4;

import java.util.Scanner;
import java.util.Stack;


public class Main {
	public static int math(int x, int y, char i) {
		int a = y;
		int b = x;
		if(i == '+') {
			return a+b;
		} else if ( i == '*') {
			return a*b;
		} else if ( i == '/') {
			return a*b;
		} else {
			return a-b;
		}
	}
	
	public static int solution(String s) {
		Stack<Integer> stack = new Stack<>();
		int answer = 0;

		for(char x : s.toCharArray()) {		
			
			if(Character.isDigit(x)) {
				int temp = x-'0';
				stack.add(temp);
//				System.out.println("현재 stack 재고" + stack);
			} else {
				int temp =  math(stack.pop(), stack.pop(), x);
//				System.out.println(x + "연산결과" + temp);
				stack.add(temp);
//				System.out.println("현재 stack 재고" + stack);
			}
			
		}
		
//		System.out.println("마지막 stack 재고"+stack);
		
		answer = stack.pop();
		
		return answer;
	} // solution	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		System.out.println(solution(s));
	
	} // main

} // end class
