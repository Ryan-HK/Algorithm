package inflearn44_hashset;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static String solution( int n, int[] arr) {
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int x : arr) {
			
			if(set.add(x)) continue;
			else return "D";
			
		}
		
		return "U";
	} // solution	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		

		System.out.print(solution(n, arr));

		
	} // main

} // end class
