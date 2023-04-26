package inflearn16_reverse_primenum;


import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	
	public static boolean isPrime(int num) {
		
		if(num == 2) return true;
		if(num==1 || num%2 == 0) return false;
		
		for(int i=3; i<=Math.sqrt(num); i+=2) {
			
			if(num%i == 0) {
				return false;
			} // if
		} // for
		
		return true;
	}
	
	public static ArrayList<Integer> solution(int n, int[] nArr) {
		
		ArrayList<Integer> answer = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			int tmp = nArr[i];
			int reverse = 0;
			
			while(tmp != 0) {
				int t = tmp % 10;
				reverse = reverse*10 + t;
				tmp /= 10;
			} // while
			
			if(isPrime(reverse)) answer.add(reverse);
		}
		
		return answer;

	} // solution

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] nArr = new int[n]; 
		
		for(int i=0; i<n; i++) {
			nArr[i] = sc.nextInt();
		}
		

		sc.close();
	} // main

} // end class