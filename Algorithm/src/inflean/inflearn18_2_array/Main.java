package inflearn18_2_array;


import java.util.Scanner;


public class Main {
	

	public static int solution(int[][] nArr) {
		int answer = 0;
		int temp = 0;
		int temp2 = 0;
		
		for(int i=0; i<nArr.length; i++) {
			answer += nArr[i][i];
		}
			
		for(int i=0; i<nArr.length; i++) {
			temp += nArr[nArr.length-i-1][i];
		}
					
		if(temp > answer) {
			answer = temp;
			temp = 0;
		}
		
		
		for(int i=0; i<nArr.length; i++) {
			temp = 0;
			temp2 = 0;
			
			for(int j=0; j<nArr.length; j++) {
				
				temp += nArr[i][j];
				temp2 += nArr[j][i];
				
			} // inner-for
			
			if(temp > answer) {
				answer = temp;
			}
			
			if(temp2 > answer) {
				answer = temp2;
			}
			
		} // for
		

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
			
		}
		
		System.out.println(solution(nArr));
		
		
		sc.close();
	} // main

} // end class