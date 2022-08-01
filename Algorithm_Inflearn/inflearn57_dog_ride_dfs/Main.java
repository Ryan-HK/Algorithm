package inflearn57_dog_ride_dfs;

import java.util.Scanner;

public class Main {
	
	static int n;
	static int m;
	static int[] arr;
	static int max;
	static int tmp;		
	
	public void DFS(int L, int tmp) {
		if(tmp > n) {
			tmp -= arr[L-1];
			max = Math.max(max, tmp);
			return;
		}
		
		if(L == m) {
			max = Math.max(max, tmp);
		} else {
			
	
			DFS(L+1, tmp+arr[L]);
			DFS(L+1, tmp);
			
		}
			
	} // DFS
		
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		arr = new int[m];
		
		for(int i=0; i<m; i++) {
			arr[i] = sc.nextInt();
		} // for
		
		T.DFS(0, tmp);
				
		System.out.println(max);
				
	} // main

} // end class
 