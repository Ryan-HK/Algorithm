package inflearn54_dfs_search;

import java.util.Scanner;

public class Main {
	
	static int n;			// 정점의 수 + 목적지
	static int m;			// 간선의 수
	static int[][] graph;
	static int[] ch;		// 체크배열
	static int answer;		// n번까지 갈 수 있는 경우의 수
	
	public void DFS(int v) {
		if(v == n) answer++;
		else {
			for(int i=1; i<=n; i++) {
				
				if(graph[v][i] == 1 && ch[i] == 0) {
					
					ch[i] = 1;
					DFS(i);
					ch[i] = 0;
				} // if
			
			} // for
			
		} // if-else
		
		
	} // DFS
	
	
	public static void main(String[] args) {
	
		Main T = new Main();
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		graph = new int[n+1][n+1];
		ch = new int[n+1];
		
		for(int i=0; i<m; i++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			graph[a][b] = 1;
			
		} // for
		
		ch[1] = 1;
		T.DFS(1);
		System.out.println(answer);
		
	} // main

} // end class
