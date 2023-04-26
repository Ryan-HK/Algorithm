package inflearn19_mountain;


import java.util.Arrays;
import java.util.Scanner;


public class Main {
	
	public static boolean isMountain(int x, int y) {
		
		
		return true;
	}
	

	public static int solution(int[][] nArr) {
		int answer = 0;
		
		for(int i=1; i<nArr.length-1; i++) {
			
			for(int j=1; j<nArr[i].length-1; j++) {
				
				if(nArr[i][j] <= nArr[i-1][j]) continue;
				if(nArr[i][j] <= nArr[i][j-1]) continue;
				if(nArr[i][j] <= nArr[i][j+1]) continue;
				if(nArr[i][j] <= nArr[i+1][j]) continue;
				
				answer++;
					
			} // inner-for
		} // outer-for

		return answer;

	} // solution

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] nArr = new int[n+2][n+2]; 
		
		for(int i=0; i<n+2; i++) {
			
			for(int j=0; j<n+2; j++) {
				
				if(i == 0 || i == n+1 || j == 0 || j == n+1) nArr[i][j] = 0;
				else nArr[i][j] = sc.nextInt();
			}
			
		} // for
		
		System.out.println(solution(nArr));
		
//		System.out.println(Arrays.deepToString(nArr));
		
		sc.close();
	} // main

} // end class