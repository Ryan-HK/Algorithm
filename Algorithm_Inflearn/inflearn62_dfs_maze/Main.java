package inflearn62_dfs_maze;

import java.util.Scanner;

public class Main {
	
	// -- X축 이동에 대한 (9시 6시 3시 12시)
	static int[] dx = {-1, 0, 1, 0};
	
	// -- Y 축 이동에 대한 (9시 6시 3시 12시)
	static int[] dy = {0, 1, 0, -1};
	
	// -- 미로를 저장할 2차원 배열 생성
	static int[][] board;
	
	// -- 미로를 탈출할 경우의 수
	static int answer = 0;
	
	
	
	// -- DFS 함수
	public static void DFS(int x, int y) {
		
		// -- 종착점에 도착했을 때, 경우의 수 +1
		if(x == 7 && y == 7) answer++;
		
		else {
			
			// -- X축과 Y축 이동에 대한 배열 접근을 위한 반복문
			// -- 9시, 6시, 3시, 12시를 순서대로 탐색한다.
			for(int i=0; i<4; i++) {
				
				// -- 각 방향으로 이동했을 경우의 위치
				int cx = x + dx[i];
				int cy = y + dy[i];
				
				// -- 미로의 경계선 밖을 지나지 않는가에 대한 Check
				// -- + 현재 위치가 미로 상에서 통로 인지 (즉! 0인지 확인)
				if(cx >= 1 && cx<=7 && cy >= 1 && cy <= 7 && board[cx][cy] == 0) {
					
					board[cx][cy] = 1;
					
					DFS(cx, cy);
					
					// -- 뒤로 Back 했을 때, 다시 Check를 풀어주어야 한다.
					board[cx][cy] = 0;
					
				} // if
				
			} // for
			
		} // if - else
		
	} // DFS
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// -- 7 * 7 격자판으로 index 1부터 저장
		board = new int[8][8];
	
		// -- 생성한 배열에, 숫자 입력 (미로 생성)
		for(int i=1; i<=7; i++) {
			
			for(int j=1; j<=7; j++) {
				
				board[i][j] = sc.nextInt();
				
			} // inner-for
			
		} // outer-for
		
		// -- 출발점에 대한 Check 
		board[1][1] = 1;
		
		// -- (1, 1)부터 Start
		DFS(1, 1);
		
		System.out.println(answer);
		
	} // main

	
}// end class
