package inflearn22_sumArray;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


public class Main {
	

	

	public static ArrayList<Integer> solution(int[] mArr, int[]nArr) {


		
		ArrayList<Integer> list = new ArrayList<>();
		
		
		for(int i=0; i<mArr.length; i++) {
			list.add(mArr[i]);
		}
		
		for(int i=0; i<nArr.length; i++) {
			list.add(nArr[i]);
		}
		
		list.sort(Comparator.naturalOrder());


		return list
				;
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
		

		
		solution(mArr, nArr)
			.forEach(k -> System.out.print(k + " "));

		sc.close();
	} // main

} // end class