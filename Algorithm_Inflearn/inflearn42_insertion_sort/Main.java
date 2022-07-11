package inflearn42_insertion_sort;

import java.util.Scanner;

public class Main {

	public static int[] solution(int n, int[] arr) {

		
		
		// 버블정렬 (Bubble Sort)
		// 서로 인접한 두 원소를 비교해서 
		// 조건에 따라 자리를 바꿔주는 정렬이다.
		
		// 정렬하고자 하는 배열안에서, 교환하는 재자리 정렬이다.
		// 안정 정렬(Stable Sort) : 중복된 값은, 입력 순서와 동일하게 정렬
		for(int i=0; i<n-1; i++) {
			
			
			for(int j=0; j<n-i-1; j++) {
				
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = tmp;
				}
				
			} // for
			
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
