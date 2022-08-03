package inflearn60_change_coin;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	
	static int n, m;
	static Integer[] arr;
	static int min = Integer.MAX_VALUE;
	
	public static void DFS(int L, int sum) {
		if(sum > m) {		// 동전의 합이  
			return;
		}
		
		if(L >= min) {
			return;
		}
		
		if(sum == m) {
			min = Math.min(L, min);
		} 
		
		else {
			
			for(int x : arr) {
				
				DFS(L+1, sum+x);
				
			}		
		}	
	} // DFS

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		arr = new Integer[n];
		
		for(int i=0; i<n; i++) {
			
			arr[i] = sc.nextInt();
			
		} // for
		
//		Arrays.sort(arr, Collections.reverseOrder());
		
		m = sc.nextInt();
		
		DFS(0, 0);
		System.out.println(min);
		
		
	} // main

} // end class
