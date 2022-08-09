package inflearn61_comination;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	

	public static int DFS(int n, int r) {
		
		if(n == r || r == 0) return 1;
		
		else return DFS(n-1, r-1) + DFS(n-1, r);
		
	} // DFS

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int r = sc.nextInt();
		
		System.out.println(DFS(n, r));
		
	} // main

} // end class
