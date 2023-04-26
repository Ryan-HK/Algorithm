package inflearn21_sum_Arr;


import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	

	

	public static int solution(int n, int m, int[][] arr) {


		int answer = 0;
		
		for(int i=1; i<=n; i++){
			
			for(int j=1; j<=n; j++){
				
				int cnt = 0;
				
				for(int k=0; k<m; k++) {
					int pi = 0; 
					int pj = 0;
					
					for(int s=0; s<n; s++) {

						if(arr[k][s] == i) pi=s;
						if(arr[k][s] == j) pj=s;
					}
					
					if(pi<pj) cnt++;
				}
				
				if(cnt == m) answer++;
			}
		}
		
		
		return answer;
	} // solution

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] nArr = new int[m][n]; 
		
		for(int i=0; i<m; i++) {
			
			for(int j=0; j<n; j++) {
				
				nArr[i][j] = sc.nextInt();
				
			}
			
		} // for
		
		System.out.println(solution(n, m, nArr));
		

		sc.close();
	} // main

} // end class