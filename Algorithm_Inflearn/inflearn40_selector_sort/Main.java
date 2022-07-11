package inflearn40_selector_sort;

import java.util.Scanner;

public class Main {

	public static int[] solution(int n, int[] arr) {

		int indexMin, temp;
		
		// 선택정렬 (Selction Sort)
		// 해당 순서에 원소를 넣을 위치는 이미 정해져 있고,
		// 어떤 원소를 넣을지 선택하는 알고리즘
		
		// 배열에서, 해당 자리(index)를 선택하고,
		// 그 자리에 오는 값을 선택하는 것 이다.
		for(int i=0; i<n-1; i++) {
			indexMin = i;
			
			for(int j=i+1; j<n; j++) {
				if(arr[j] < arr[indexMin]) {
					indexMin = j;
				} // if
				
			} // for
			
			// swap
			temp = arr[indexMin];
			arr[indexMin] = arr[i];
			arr[i] = temp;
		} // for

		
		return arr;
	} // solution	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int s : solution(n, arr)) {
			System.out.print(s + " ");
		}
		
	} // main

} // end class
