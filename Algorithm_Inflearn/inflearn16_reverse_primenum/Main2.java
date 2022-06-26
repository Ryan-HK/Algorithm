package inflearn16_reverse_primenum;


import java.util.ArrayList;
import java.util.Scanner;


public class Main2 {
	
	public static ArrayList<Integer> solution(int[] nArr) {
		
		
		// 입력받은 수를 reverse한 수를 저장
		int[] reverseArr = new int[nArr.length];
		
		// reverser한 소수를 저장
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<nArr.length;  i++) {
			int num = nArr[i];
			int reverse = 0;
			
			while(num != 0) {
				int digit = num % 10;
				reverse = reverse*10 + digit;
				num /= 10;
			} // while
			
			reverseArr[i] = reverse;
			
		} // outer-for
		
		
		
		for(int i=0; i<reverseArr.length; i++) {
			int flag = 0;
			
			if(reverseArr[i] == 2) {
				list.add(reverseArr[i]);
				continue;
			}
			
			if(reverseArr[i]%2 == 0 || reverseArr[i] == 1) {
				continue;
			}
			
			for(int j=3; j*j<=reverseArr[i]; j+=2) {
				
				if(reverseArr[i]%j == 0) {
					flag = 1;
					break;
	
				} // if
			} // inner-for
			
			if(flag == 0) {
				list.add(reverseArr[i]);
			}
			
		} // outer-for
		
		return list;
		

	} // solution

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] nArr = new int[n];
		
		for(int i=0; i<n; i++) {
			nArr[i] = sc.nextInt();
		}
		
		solution(nArr)
			.forEach(s -> System.out.print(s + " "));
		
		sc.close();
	} // main

} // end class