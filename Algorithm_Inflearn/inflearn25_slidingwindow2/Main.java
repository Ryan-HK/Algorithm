package inflearn25_slidingwindow2;

import java.util.Scanner;

public class Main {
	
	public static int solution(int n, int m, int[] arr) {
		int answer = 0;
		int sum = 0;
		int p2 = 0;

		for(int p1=0; p1<n; p1++) {
			  sum += arr[p1];
			  
			  if(sum == m) answer++;
			  
			  while(sum >=m) {
				  sum -= arr[p2++];
				  
				  if(sum == m) answer++;		  
			  }
		}
		
		return answer;
	}	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(solution(n, m, arr));
		
		
	} // main

} // end class
