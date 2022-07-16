package inflearn48_binary_search;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;


public class Main {
	
	public static int solution( int n, int m, int[] arr) {
		
		int result = 0;
		
		Arrays.sort(arr);
		
		int lt = 0;
		int mid = 0;
		int rt = n-1;
		
		while(lt <= rt) {
			
			mid = (lt + rt)/2;
			
			if(m == arr[mid]) {
				return mid+1;
			} 
			else if(m < arr[mid]) {
				rt = mid - 1;
			} 
			else if(m > arr[mid]) {
				lt = mid + 1;
			}

		} // while
		
		result = mid+1;
		
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
