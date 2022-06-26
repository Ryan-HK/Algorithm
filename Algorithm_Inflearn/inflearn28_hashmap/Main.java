package inflearn28_hashmap;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static int solution(int n, int k, int[] arr) {
		int answer = 0;

		return answer;
	}	
	
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
