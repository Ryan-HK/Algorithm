package inflearn13_array_rocks_scissors_paper;


import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	
	public static ArrayList<String> solution(int[] aArr, int[]bArr) {
		ArrayList<String> arrayList = new ArrayList<>();
		
		for(int i=0; i<aArr.length; i++) {
			
			int tmp = aArr[i] - bArr[i];
			
			if(tmp == 0) {
				arrayList.add("D");
			} else if (tmp == -1 || tmp == 2) {
				arrayList.add("B");
			} else {
				arrayList.add("A");
			} // else-if
			
		} // for
		
		
		return arrayList;
	
	} // solution

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] aArr = new int[n];
		int[] bArr = new int[n];
		
		for(int i=0; i<n; i++) {
			aArr[i] = sc.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			bArr[i] = sc.nextInt();
		}
		
		
		solution(aArr, bArr)
			.forEach( s->System.out.println(s) );
		
		
		sc.close();
	} // main

} // end class