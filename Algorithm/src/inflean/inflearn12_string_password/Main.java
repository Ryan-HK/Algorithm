package inflearn12_string_password;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static String solution(String str, int n) {	
		
		List<String> list = new ArrayList<>();
		
		str = str.replace('*','0').replace('#', '1');
		
		
		for(int i=0; i<n; i++) {
			
			String tmp = "";
			
			for(int j=0 + (7*i); j<7+(7*i); j++) {
				
				tmp += str.charAt(j);
			
			} // inner-for
			
			list.add(tmp);
			
		} // outer-for
		
		char[] cArr = new char[n];
		
		for(int i=0; i<n; i++) {
			
			cArr[i] = (char) Integer.parseInt(list.get(i), 2);
	
		} // for
		
		return String.valueOf(cArr);
		
	} // solution

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String str = sc.next();
		
		System.out.println(solution(str, n));

		sc.close();
	} // main

} // end class