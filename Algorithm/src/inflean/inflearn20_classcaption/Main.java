package inflearn20_classcaption;


import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	
	public static boolean isMountain(int x, int y) {
		
		
		return true;
	}
	

	public static int solution(int[][] nArr) {

		int max = 0;
		int answer = 0;
		
		for(int i=0; i<nArr.length; i++) {
			int count = 0;

			
			for(int j=0; j<nArr.length; j++) {
				
				
				for(int k=0; k<5; k++ ) {
					
					if(nArr[i][k] == nArr[j][k]) {
						count++;
						break;
					}
					
				}
				
			} // inner-for
			
			if(count > max) {
				max = count;
				answer = i+1;
			}
			
		} // outer-for

		return answer;

	} // solution

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] nArr = new int[n][n]; 
		
		for(int i=0; i<n; i++) {
			
			for(int j=0; j<n; j++) {
				
				nArr[i][j] = sc.nextInt();
				
			}
			
		} // for
		
		System.out.println(solution(nArr));
		

		sc.close();
	} // main

} // end class