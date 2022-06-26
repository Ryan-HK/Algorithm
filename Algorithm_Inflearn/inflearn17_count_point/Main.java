package inflearn17_count_point;


import java.util.Scanner;


public class Main {
	

	public static int[] solution(int[] nArr) {
		
		int[] answer = new int[nArr.length];
		
		int point = 0;
		
		for(int i=0; i<nArr.length; i++) {
			int count = 1;
			
			for(int j=0; j<nArr.length; j++) {
			 	if(nArr[i] < nArr[j]) count++;
			} // inner-for
			
			answer[i] = count;
			
		} // outer-for
		
		return answer;

	} // solution

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] nArr = new int[n]; 
		
		for(int i=0; i<n; i++) {
			nArr[i] = sc.nextInt();
		}
		
		for(int i : solution(nArr)) {
			System.out.print(i + " ");
			
		}
		
		sc.close();
	} // main

} // end class