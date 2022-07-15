package inflearn46_comperator;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


class Point2 {
	int x;
	int y;
	
	public Point2(int x, int y) {
		this.x = x;
		this.y = y;
	} // Constructor

} // end class

class NewCompare2 implements Comparator<Point2> {

	@Override
	public int compare(Point2 o1, Point2 o2) {
		
		if(o1.x < o2.x) {
			return -1;
		} else if(o1.x == o2.x) {
			
			if(o1.y <= o2.y) return -1;
			else return 1;
		} else {
			return 1;
		}
	} // compare

} // end class


public class Main2 {
	
	public static ArrayList<Point2> solution( int n, int[][] arr) {
		
		
		ArrayList<Point2> list = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			
				list.add(new Point2(arr[i][0], arr[i][1]));
				
		} // inner-for

		list.sort(new NewCompare2());
		
		return list;
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
		
		for(Point2 i : solution(n, arr)) {
			
			System.out.println(i.x + " " + i.y);
			
		}

		
	} // main

} // end class
