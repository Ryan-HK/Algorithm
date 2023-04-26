package inflearn57_dog_ride_dfs;

import java.util.Scanner;

public class Main {
	
	static int n;
	static int m;
	static int[] arr;

	
	public void DFS(int L) {
		
		if(L == m) {
			
			for(int x : arr) {
				System.out.print(x + " ");
			}
			
			System.out.println();
			
		} else {
			
			for(int i=1; i<=n; i++) {
				arr[L] = i;
				DFS(L+1);
			}
			
		}
			
	} // DFS
		
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		arr = new int[m];

		T.DFS(0);
				
	} // main

} // end class
 