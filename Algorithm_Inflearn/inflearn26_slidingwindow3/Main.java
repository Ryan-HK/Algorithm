package inflearn26_slidingwindow3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static int solution(int n) {
		int answer = 0;
		
		int sum = 0;
		int p2 = 0;
		
		int[] arr = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}


		for(int p1=0; p1<=n/2; p1++) {
			  sum += arr[p1];
			  
			  if(sum == n) answer++;

			  
			  while(sum > n) {
				  sum -= arr[p2++];
				  
				  if(sum == n) answer++;		  
			  }
		}
		
		return answer;
	}	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(solution(n));
		
		
		
	} // main

} // end class
