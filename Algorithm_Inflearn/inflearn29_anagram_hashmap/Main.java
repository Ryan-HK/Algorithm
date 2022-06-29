package inflearn29_anagram_hashmap;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/*
	[설명]
	
	Anagram이란 두 문자열이 알파벳의 나열 순서를 다르지만 그 구성이 일치하면 두 단어는 아나그램이라고 합니다.
	
	예를 들면 AbaAeCe 와 baeeACA 는 알파벳을 나열 순서는 다르지만 그 구성을 살펴보면 A(2), a(1), b(1), C(1), e(2)로
	
	알파벳과 그 개수가 모두 일치합니다. 즉 어느 한 단어를 재 배열하면 상대편 단어가 될 수 있는 것을 아나그램이라 합니다.
	
	길이가 같은 두 개의 단어가 주어지면 두 단어가 아나그램인지 판별하는 프로그램을 작성하세요. 아나그램 판별시 대소문자가 구분됩니다.
	
	
	[입력]
	첫 줄에 첫 번째 단어가 입력되고, 두 번째 줄에 두 번째 단어가 입력됩니다.
	
	단어의 길이는 100을 넘지 않습니다.
	
	AbaAeCe
	baeeACA
	
	abaCC
	Caaab
	
	
	[출력]
	YES
	
	NO


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
		
		System.out.println(map1 == map2);
		
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
