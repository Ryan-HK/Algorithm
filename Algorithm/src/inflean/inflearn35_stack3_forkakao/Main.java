package inflearn35_stack3_forkakao;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;


public class Main {
	
	public static int solution(int n, int[][] arr, int m, int[] movesArr) {
		ArrayList<Stack<Integer>> list = new ArrayList<>();
		Stack<Integer> answerStack = new Stack<>();
		int cnt = 0;
		
		for(int i=0; i<n; i++) {
			Stack<Integer> stack = new Stack<>();
			for(int j=n-1; j>=0; j--) {	
				if(arr[j][i] != 0)
				stack.push(arr[j][i]);		
			}
			
			list.add(i, stack);
			
		} // outer-for

		for(int i : movesArr) {

			int index = i-1;
			int temp = 0;
			
			if(!list.get(index).isEmpty()) {
				temp = list.get(index).pop();
			} else {
				continue;
			}
			
			if(answerStack.isEmpty()) {
				answerStack.push(temp);
			} else {
				
				if(answerStack.peek() == temp) {
					answerStack.pop();
					cnt += 2;
				} else {
					answerStack.push(temp);
				}
				
			}
				
		} // enhanced-for


		return cnt;
	} // solution	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] arr = new int[n][n];
		
		for(int i=0; i<n; i++) {
			
			for(int j=0; j<n; j++) {
				
				arr[i][j] = sc.nextInt();
			}
			
		} // for
		
		int m = sc.nextInt();
		
		int[] movesArr = new int[m];
		
		for(int i=0; i<m; i++) {
			movesArr[i] = sc.nextInt();
		}
		
		System.out.println(solution(n, arr, m, movesArr));
	
	} // main

} // end class
