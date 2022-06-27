package inflearn29_anagram_hashmap;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/*
[설명]

학급 회장을 뽑는데 후보로 기호 A, B, C, D, E 후보가 등록을 했습니다.

투표용지에는 반 학생들이 자기가 선택한 후보의 기호(알파벳)가 쓰여져 있으며 선생님은 그 기호를 발표하고 있습니다.

선생님의 발표가 끝난 후 어떤 기호의 후보가 학급 회장이 되었는지 출력하는 프로그램을 작성하세요.

반드시 한 명의 학급회장이 선출되도록 투표결과가 나왔다고 가정합니다.


[입력]
첫 줄에는 반 학생수 N(5<=N<=50)이 주어집니다.

두 번째 줄에 N개의 투표용지에 쓰여져 있던 각 후보의 기호가 선생님이 발표한 순서대로 문자열로 입력됩니다.

15
BACBACCACCBDEDE

[출력]
학급 회장으로 선택된 기호를 출력합니다.

C

*/

public class Main {
	
	public static String solution(String s1, String s2) {
		String answer = "YES";
		
		HashMap<Character, Integer> map1 = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();
		
		for(char x : s1.toCharArray()) {
			map1.put(x, map1.getOrDefault(x, 0) + 1);
		}
		
		for(char x : s2.toCharArray()) {
			map2.put(x,  map2.getOrDefault(x, 0) + 1);
		}
		
		for(char key : map1.keySet()) {
			
			if(map1.get(key) != map2.get(key)) {
				answer = "NO";
			}
		}
		
		
		return answer;
	}	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.next();
		String s2 = sc.next();
		
		System.out.println(solution(s1, s2));
	
	} // main

} // end class
