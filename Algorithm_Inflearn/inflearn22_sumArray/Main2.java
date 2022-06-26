package inflearn22_sumArray;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


public class Main2 {
	

	

	public static ArrayList<Integer> solution(int m, int n, int[] mArr, int[]nArr) {


		
		ArrayList<Integer> list = new ArrayList<>();
		
		int p1 = 0;
		int p2 = 0;
		
		while(p1 < m && p2 < n) {
			
			if(mArr[p1] <= mArr[p2]) list.add(mArr[p1++]);
			else list.add(nArr[p2++]);
		}
		
		while(p1<m) list.add(mArr[p1++]);
		while(p2<n) list.add(nArr[p2++]);
		
		
		return list;
	} // solution

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int m = sc.nextInt();
		int[] mArr = new int[m];	
		
		for(int i=0; i<m; i++) {
			mArr[i] = sc.nextInt();
		}
		
		int n = sc.nextInt();
		

		int[] nArr = new int[n];
		

		for(int i=0; i<n; i++) {
			nArr[i] = sc.nextInt();
		}
		
		solution(m, n, mArr, nArr)
		.forEach(k -> System.out.print(k + " "));

	sc.close();
		

	} // main

} // end class