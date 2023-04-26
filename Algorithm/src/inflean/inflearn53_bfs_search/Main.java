package inflearn53_bfs_search;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	int answer = 0;
	int[] dis = {1, -1, 5};
	int[] ch;
	Queue<Integer> Q = new LinkedList<>();
	
	public int BFS (int s, int e) {
		ch = new int[10001];
		ch[s] = 1;
		
		Q.offer(s);
		int L = 0;
		
		while(!Q.isEmpty()) {
			int len = Q.size();
			
			for(int i=0; i<len; i++) {
				int x = Q.poll();
	
				for(int j : dis) {
					int nx = x + j;
					if(nx == e) return L+1;
					
					if(nx>= 1 && nx <= 10000 && ch[nx] == 0) {
						ch[nx] = 1;
						Q.offer(nx);
					} // if
				} // inner - for
			} // outer - for
			
			L++;
			
		} // while
			
		return L;
		
	} // BFS
	
	public static void main(String[] args) {
		Main  T = new Main();
		
		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();
		int e = sc.nextInt();
		
		System.out.println(T.BFS(s, e));
		
		
		
	} // main

} // end class