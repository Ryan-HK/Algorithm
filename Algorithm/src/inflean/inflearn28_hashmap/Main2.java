package inflearn28_hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class Main2 {
	
	public static char solution(int n, String s) {
		char answer = ' ';
		int max = 0;
		
		HashMap<Character, Integer> map = new HashMap<>();
	
//		getOrDefalut이용한 Counting 방법 (매우 중요!!)
		for(char x : s.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0)+1);
		} // for
		
		for(char key : map.keySet()) {
			if(map.get(key) > max) {
				max = map.get(key);
				answer = key;
			}
		} // for

		
		return answer;
	}	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String s = sc.next();
		

		System.out.println(solution(n, s));
	
	} // main

} // end class