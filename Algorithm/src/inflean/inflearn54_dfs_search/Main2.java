package inflearn54_dfs_search;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
	
	static int n;			// 정점의 수 + 목적지
	static int m;			// 간선의 수
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch;		// 체크배열
	static int answer;		// n번까지 갈 수 있는 경우의 수
	
	public void DFS(int v) {
		
		if(v == n) answer++;
		else {
			
			for(int nv : graph.get(v)) {
				
				if(ch[nv] == 0) {
					ch[nv] = 1;
					DFS(nv);
					ch[nv] = 0;
				}
		
			} // enhanced for
			
		} // if-else
	
	} // DFS
	
	
	public static void main(String[] args) {
		
		Main2 T = new Main2();
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		graph = new ArrayList<>();
		ch = new int[n+1];
		
		for(int i=0; i<n; i++) {
			
			graph.add(new ArrayList<>());
			
		} // for
		
		for(int i=0; i<m; i++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			graph.get(a).add(b);
			
		} // for
		
		ch[1] = 1;
		T.DFS(1);
		System.out.println(answer);
		
	} // main

} // end class
