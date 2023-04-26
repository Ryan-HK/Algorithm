package inflearn58_maxnum_dfs;

import java.util.Scanner;

public class Main {
	
	static int n;
	static int m;
	static int[] num;
	static int[] time;
	static int max;
	static int tmpTime;
	static int tmpNum;
	
	public void DFS(int L, int tmpTime, int tmpNum) {
		if(tmpTime > m) {
			tmpNum -= num[L-1];
			max = Math.max(max, tmpNum);
			return;
		}
		
		if(L == n) {
			max = Math.max(max, tmpNum);
		} else {
			
	
			DFS(L+1, tmpTime+time[L], tmpNum+num[L]);
			DFS(L+1, tmpTime, tmpNum);
			
		}
			
	} // DFS
		
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		
		num = new int[n];
		time = new int[n];
		
		for(int i=0; i<n; i++) {

			num[i] = sc.nextInt();
			time[i] = sc.nextInt();
						
		} // for
		
		T.DFS(0, tmpTime, tmpNum);
				
		System.out.println(max);
				
	} // main

} // end class
 