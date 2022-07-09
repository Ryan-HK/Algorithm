package inflearn38_queue1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Main {

	public static int solution(int n, int k) {
		Queue<Integer> queue = new LinkedList<>();
		int answer = 0;
		
		// Step.1 : Queue에 왕자의 번호 저장 (1번부터~n번까지)
		for(int i=1; i<=n; i++) {
			queue.add(i);
		} // for
		
		while(queue.size() != 1) {
			
			for(int i=1; i<=k; i++) {
				
				if(i == k) {
					queue.poll();
				} else {
					Integer tmp = queue.poll();
					queue.add(tmp);
				}
			} // for
			
		} // while
		
		answer = queue.peek();
			
		return answer;
	} // solution	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		
		System.out.println(solution(n, k));
		
	} // main

} // end class
