package inflearn49_decision_algorithm;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;


public class Main {
	
	public static int count(int[] arr, int capacity) {
		int cnt = 1, sum = 0;
		
		for(int x : arr) {
			if(sum+x>capacity) {
				cnt++;
				sum = x;
			}
			else sum += x;
		} // enhanced for
		
		return cnt;
		
	} // count 
	

	public static int solution( int n, int m, int[] arr) {
		
		int result = 0;
		
		int lt = Arrays.stream(arr).max().getAsInt();
		int rt = Arrays.stream(arr).sum();
		
		while(lt <= rt) {
			int mid = (lt + rt)/2;
			
			if(count(arr, mid)<=m) {
				result = mid;
				rt=mid-1;
			}
			else lt=mid+1;
			
			
		} // while
		
		
		return result;
	} // solution	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

		int n = sc.nextInt();
		int[] arr = new int[n];
		int m = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			
			arr[i] = sc.nextInt();
			
		}
		
		System.out.println(solution(n, m, arr));
		
		
	} // main

} // end class
