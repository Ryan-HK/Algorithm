package inflearn08_string_pallindrome2;

import java.util.Scanner;

public class Main {
	
	public static String solution(String str) {	
		
		str = str.toUpperCase().replaceAll("[^A-Z]", "");
		
		String tmp = new StringBuilder(str).reverse().toString();
		
		if(str.equals(tmp)) return "YES";
		else return "NO";
		
		
	} // solution

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		System.out.println(solution(str));
		
		sc.close();
	} // main

} // end class