package inflearn31_find_all_anagram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Main {
	
	public static int solution(String s, String t) {
		int answer = 0;
		
		HashMap<Character, Integer> sMap = new HashMap<>();
		HashMap<Character, Integer> tMap = new HashMap<>();
		
		char[] sArr = s.toCharArray();
		char[] tArr = t.toCharArray();
		
		
		int tt = tArr.length;
		int lt = 0;
		
		for(char x : tArr) {
			tMap.put(x, tMap.getOrDefault(x, 0)+1);
		} // for
		
		
		for(int i=0; i<tt-1; i++) {
			sMap.put(sArr[i], sMap.getOrDefault(sArr[i], 0)+1);
		}
		
		for(int rt=tt-1; rt<sArr.length; rt++) {
//			boolean flag = true;
			sMap.put(sArr[rt], sMap.getOrDefault(sArr[rt], 0)+1);
			
			if(sMap.equals(tMap)) {
				answer++;
			}
			
			sMap.put(sArr[lt], sMap.get(sArr[lt])-1);
			
			if(sMap.get(sArr[lt]) == 0) {
				sMap.remove(sArr[lt]);
			}
			
			lt++;
			
		} // for
		
		return answer;
	}	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String t = sc.next();
		
		System.out.println(solution(s,t));
	
	} // main

} // end class
