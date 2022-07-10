package inflearn39_queue2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


class Person {
	int id;
	int priority;
	
	public Person(int id, int priority) {
		this.id = id;
		this.priority = priority;
	} // Constructor
	
} // Person


public class Main {

	public static int solution(int n, int k, int[] arr) {
		Queue<Person> queue = new LinkedList<>();
		int answer = 1;
		
		// Step.1 : queue에 Person 객체 생성
		for(int i=0; i<n; i++) {
			queue.add(new Person(i, arr[i]));
		} // for
		
		while(!queue.isEmpty()) {
			Person tmp = queue.poll();
			
			for(Person x : queue) {
				if(x.priority > tmp.priority) {
					queue.add(tmp);
					tmp = null;
					break;
				}
					
			} // enhanced-for
			
			if(tmp != null) {
				if(tmp.id == k) return answer;
				else answer++;
			}
	
		} // while
		
		return answer;
	} // solution	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(solution(n, k, arr));
		
	} // main

} // end class
