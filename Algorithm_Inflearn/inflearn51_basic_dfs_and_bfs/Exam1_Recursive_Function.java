package inflearn51_basic_dfs_and_bfs;

public class Exam1_Recursive_Function {

	public void DFS (int n) {
		if(n==0) return;
		
		else {
			// 메소드 내에서 자기 자신을 다시 호출
			DFS(n-1);	
			System.out.print(n + " ");
		}
		
	} // DFS
	
	
	public static void main(String[] args) {
		
		Exam1_Recursive_Function T = new Exam1_Recursive_Function();
		
		T.DFS(3);
	} // main

} // end class
