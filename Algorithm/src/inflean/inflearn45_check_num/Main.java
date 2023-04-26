package inflearn45_check_num;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static ArrayList<Integer> solution( int n, int[] arr) {
		
		ArrayList<Integer> answer = new ArrayList<>();
		
		
		// 깊은 복사를 사용해야 한다.
		// 단순 대입연산자만 사용 할 경우, 얉은 복사로
		// 같은 객체배열을 참조하게 된다.
		// 같은 객체 배열을 참조할 때, 정렬을 사용한다면, 값이 같게 나온다.
		int[] tempArr = arr.clone();
	
		Arrays.sort(tempArr);
		
		
		for(int i=0; i<n; i++){

			if(arr[i] != tempArr[i]) answer.add(i+1);
			
		} // for
		
		
		return answer;
	} // solution	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int x : solution(n, arr)) {
			System.out.print(x + " ");
		}

		
	} // main

} // end class
