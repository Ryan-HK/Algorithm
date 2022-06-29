package inflearn30_hash_slidingwindow;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;


public class Main {
	
	public static ArrayList<Integer> solution(int n, int s, int[] arr) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		HashSet<Integer> set = new HashSet<>();
		
		int rt = s;
		int lt = 0;
		
		while(rt <= arr.length) {
			
			for(int i=lt; i<rt; i++) {
				set.add(arr[i]);
			} // for
			
			list.add(set.size());
			
			if(rt == arr.length) {
				break;
			}
			
			set.remove(arr[lt++]);
			set.add(arr[rt++]);
		} // while
		
		
		
		return list;
	}	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int s = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i: solution(n,s, arr)) {
			
			System.out.print(i + " ");
		}
	
	} // main

} // end class
