package inflearn28_hashmap;

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
	
	public static char solution(int n, String s) {
		char answer = ' ';
		
		HashMap<Character, Integer> map = new HashMap<>();
	
		
//		1. 반 학생 수를 map 객체에 넣는 법
		for(char i ='A'; i<='E'; i++) {
			map.put(i, 0);
		}
		
//		2. map을 순회하여, 카운트 ++
		
		for(int i=0; i<s.length(); i++) {
			if(map.containsKey(s.charAt(i))) {
				Integer value = (Integer)map.get(s.charAt(i));
				map.put(s.charAt(i), value + 1);
			}
		}
		
		
//		3. map 을 탐색하여, 최댓 값 구하기
		Set<Character> keySet = map.keySet();
		
		
		int max = 0;
		
		for(char key : keySet) {

			
			if(Math.max(map.get(key), max) == map.get(key)) {
				max = map.get(key);
				
				answer = key;
			}
		}
	
		return answer;
	}	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String s = sc.next();
		

		System.out.println(solution(n, s));
	
	} // main

} // end class
