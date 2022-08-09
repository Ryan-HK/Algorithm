package inflearn60_change_coin;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	
	static int n, m;
	static Integer[] arr;
	static int min = Integer.MAX_VALUE;
	
	public static void DFS(int L, int sum) {
		// 동전 금액의 합이 m보다 클 때 return
		if(sum > m) {		
			return;
		}
		
		// 동전의 갯수가 동전개수 최솟값 (min)보다 클때 호출중지
		if(L >= min) {		
			return;
		}
		
		// 동전 금액의 합이 지정한 금액 (m) 과 같을 때,
		// 동전개수 최솟값과 비교
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
		
		// 문제 풀시 속도 개선을 위한 내림차수 정렬
		// 금액이 큰 동전이 먼저 고려되어야 알고리즘이 더욱 더 빨리풀어진다.
		Arrays.sort(arr, Collections.reverseOrder());
		
		m = sc.nextInt();
		
		DFS(0, 0);
		System.out.println(min);
		
		
	} // main

} // end class
