package inflearn13_array_minnum;

import java.util.Scanner;


public class Main {
	
	public static int solution(int[] nArr) {
		int answer=1;
		int tmp =nArr[0];
		
		for(int i=1; i<nArr.length; i++) {
			
			if(nArr[i] > tmp) {
				answer++;
				tmp = nArr[i];
			} 
	
		} // for
		
		return answer;
	
	} // solution

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] nArr = new int[n];
		
		for(int i=0; i<n; i++) {
			nArr[i] = sc.nextInt();
		}
		

		System.out.print(solution(nArr));
		
		
		sc.close();
	} // main

} // end class