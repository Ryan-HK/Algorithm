package inflearn42_insertion_sort;

import java.util.Scanner;

public class Main {

	public static int[] solution(int n, int[] arr) {

		
		
		// 삽입 정렬 (Insertion Sort)
		// 두번째 원소부터 시작해서, 앞쪽(왼쪽)의 원소들의 비교하여, 삽입할 위치를 지정합니다.
		// 그 후, 원소를 뒤로 옮기고 지정한 자리에 자료를 삽입합니다.
		
		
		// 정렬하고자 하는 배열안에서, 교환하는 재자리 정렬이다.
		// 안정 정렬(Stable Sort) : 중복된 값은, 입력 순서와 동일하게 정렬
		for(int i=1; i<n; i++) {
			
			int tmp = arr[i];
			int prev = i-1;
			
			while( prev >= 0 && arr[prev] > tmp) {
				arr[prev+1] = arr[prev];
				prev--;
			} // for
			
			arr[prev+1] = tmp;
			
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
