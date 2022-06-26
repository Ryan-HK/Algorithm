package inflearn23_two_pointers_algorithm;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main {


	public static ArrayList<Integer> solution(int m, int n, int[] mArr, int[]nArr) {
	
		ArrayList<Integer> list = new ArrayList<>();
		Arrays.sort(mArr);
		Arrays.sort(nArr);
		

		
		int p1 = 0; int p2 = 0;
		
		while(p1 < m && p2 < n) {
			
			if (mArr[p1] == nArr[p2]) {
				p2++;
				list.add(mArr[p1++]);
			} else if (mArr[p1] < nArr[p2]) {
				p1++;
			} else {
				p2++;
			}
			
		} // while
		
		
		return list;
	}
	
	
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
		

		
		solution(m, n, mArr, nArr).stream().
		forEach( x -> System.out.print(x + " "));

	} // main

} // end class