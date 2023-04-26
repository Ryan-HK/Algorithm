package inflearn50_decision_algorithm2;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;


public class Main {
	
	public static int count(int[] arr, int capacity) {
//		System.out.println(capacity + "를 검사합니다.");
		int cnt = 1;
		int temp = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			
			if(arr[i] - temp >= capacity ) {
				cnt++;
				temp = arr[i];
			}
			
		}
		
//		System.out.println(cnt + "를 return 합니다");
		
		return cnt;
		
	} // count 
	

	public static int solution( int n, int m, int[] arr) {
		
		int result = 0;
		
		int lt = Arrays.stream(arr).min().getAsInt();
		int rt = Arrays.stream(arr).max().getAsInt();
		
		Arrays.sort(arr);
		
		while(lt <= rt) {
			int mid = (lt + rt)/2;
			
			if(count(arr, mid)>=m) {
				result = mid;
				lt=mid+1;
			}
			else rt=mid-1;
			
			
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
