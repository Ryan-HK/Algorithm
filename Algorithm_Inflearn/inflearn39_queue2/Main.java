package inflearn39_queue2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Main {

	public static String solution(String n, String k) {
		Queue<Character> nQueue = new LinkedList<>();
		Queue<Character> kQueue = new LinkedList<>();
		
		// Step.1 : Queue에 필수과목 / 수업설계 대입
		for(int i=0; i<n.length(); i++) {
			nQueue.add(n.charAt(i));
		} // for
		
		for(int i=0; i<k.length(); i++) {
			kQueue.add(k.charAt(i));
		} // for
		
		// Step.2 : kQueue(수업설계)를 하나씩 빼면서, nQueue와 비교
		// 
		while(!kQueue.isEmpty()) {
			
			if(nQueue.isEmpty()) break;
		
			if(kQueue.poll() == nQueue.peek()) {
				nQueue.poll();
			}
			
		} // while
		
		// Step.3 만약 nQueue(필수과목) 이 비어 있으면 true리턴
		if(nQueue.isEmpty()) {
			return "YES";
		} else {
			return "NO";
		}

	} // solution	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String n = sc.next();
		String k = sc.next();
		
		
		System.out.println(solution(n, k));
		
	} // main

} // end class
