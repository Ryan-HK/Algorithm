package inflearn13_array_maxnumprint;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static List<Integer> solution(int[] nArr) {
		List<Integer> list = new ArrayList<>();
		
		list.add(nArr[0]);
		
		for(int i=1; i<nArr.length; i++) {
			
			if(nArr[i-1] < nArr[i]) {
				list.add(nArr[i]);
			}
			
		} // for
		
		
		return list;
	
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