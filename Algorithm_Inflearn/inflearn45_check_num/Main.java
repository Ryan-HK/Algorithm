package inflearn45_check_num;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static ArrayList<Integer> solution( int n, int[] arr) {
		
		ArrayList<Integer> answer = new ArrayList<>();
		
		int[] tempArr = Arrays.copyOf(arr, n);
		
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
		
		
		
		solution(n, arr)
			.forEach(s -> System.out.print(s + " "));

		
	} // main

} // end class
