package inflearn43_LinkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static List<Integer> solution(int s, int n, int[] arr) {
		LinkedList<Integer> list = new LinkedList<>();
		
		
		for(int i=0; i<arr.length; i++) {
		
			if(list.contains(arr[i])) {
				list.remove((Integer)arr[i]);
				list.add(0, arr[i]);
			} else {
				list.add(0, arr[i]);
			}
			
			if(list.size() > s) {
				list.remove(s);
			} // if
				
		} // for
	
		return list;
	} // solution	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int x : solution(s, n, arr)) {
			System.out.print(x + " ");
		}
		
	} // main

} // end class
