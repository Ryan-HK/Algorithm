package inflearn04_string_stringbuilder;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static List<StringBuilder> solution(String...string) {
		
		List<StringBuilder> list = new ArrayList<>();
	
		
		for(String str : string) {
			StringBuilder sb = new StringBuilder();
			sb.append(str).reverse();
			
			list.add(sb);
		}

		return list;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		String[] strArr = new String[a];
		
		for(int i=0; i<a; i++) {
			strArr[i] = sc.next();
		}
		
		for(StringBuilder str : solution(strArr)) {
			System.out.println(str);
		}
		
	} // main

}