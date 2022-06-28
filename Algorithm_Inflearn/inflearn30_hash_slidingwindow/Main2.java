package inflearn30_hash_slidingwindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main2 {
	
	public static ArrayList<Integer> solution(int n, int s, int[] arr) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		HashMap<Integer, Integer> map = new HashMap<>();

		int lt = 0;
		
	
		for(int i=0; i<s-1; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		} // for
		
		
		for(int rt=s-1; rt<n; rt++) {
			map.put(arr[rt], map.getOrDefault(arr[rt], 0)+1);
			list.add(map.size());
			
			map.put(arr[lt], map.get(arr[lt])-1);
			 
			if(map.get(arr[lt]) == 0) {
				map.remove(arr[lt]);
			} // if : 만약 map에서 해당 key의 value값이 0이라면 HashMap에서 삭제
			
			lt++;
					
		} // for
		
		
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