package inflearn56_subset_dfs;

import java.util.Scanner;

public class Main {
	
	static int n;
	static int[] ch;
	static int[] arr;
	static int sum = 0;
	static String answer = "NO";
	
	public void DFS(int L) {
		if(answer == "YES") return;
				
		if(L == n ) {
			int tmp = 0;
			for(int i=0; i<arr.length; i++) {
				
				if(ch[i] == 1) {
//					System.out.print(arr[i] + " ");
					tmp += arr[i];
				}
				
			}
			
//			System.out.println("현재 배열의 총합은 : " + tmp);
			
			if(tmp*2 == sum) {
				answer = "YES";
			}
			
		} else {
			ch[L] = 1;
			DFS(L+1);
			ch[L] = 0;
			DFS(L+1);
		}

	}
	
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		arr = new int[n];
		ch = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		} // for
		
//		System.out.println("총합 : " + sum);
		
		T.DFS(0);
		
		System.out.println(answer);
			
	} // main

} // end class
