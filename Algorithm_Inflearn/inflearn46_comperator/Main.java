package inflearn46_comperator;


import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;


class Point {
	int x;
	int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	} // Constructor

} // end class

class NewCompare implements Comparator<Point> {

	@Override
	public int compare(Point o1, Point o2) {
		
		if(o1.x < o2.x) {
			return -1;
		} else if(o1.x == o2.x) {
			
			if(o1.y <= o2.y) return -1;
			else return 1;
		} else {
			return 1;
		}

	}
	
} // end class


public class Main {
	
	public static TreeSet<Point> solution( int n, int[][] arr) {
		
		
		TreeSet<Point> set = new TreeSet<>(new NewCompare());
		
		for(int i=0; i<n; i++) {
			
				set.add(new Point(arr[i][0], arr[i][1]));
				
		} // inner-for

		return set;
	} // solution	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

		int n = sc.nextInt();
		int[][] arr = new int[n][2];
		
		for(int i=0; i<n; i++) {
			
			for(int j=0; j<2; j++) {
				arr[i][j] = sc.nextInt();
			}
			
		}
		
		for(Point i : solution(n, arr)) {
			
			System.out.println(i.x + " " + i.y);
			
		}

		
	} // main

} // end class
