package inflearn32_treeset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;


public class Main {
	
	public static int solution(int n, int k, int[] arr) {
		int answer = -1; // 초기값을 -1로 설정한다.
		
		TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
		
		for(int i=0; i<n; i++) {
			
			for(int j=i+1; j<n; j++) {
				
				for(int z=j+1; z<n; z++) {
					Tset.add(arr[i] + arr[j] + arr[z]);
				}
			}
		}
		
		int count = 1;
		
		for(int i: Tset) {
			
			if(count == k) {
				answer = i;
			} 
			
			count++;
			
		} // for
		
		return answer;
		
	} // solution	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		} // for
		
		System.out.println(solution(n, k, arr));
	
	} // main

} // end class
