package inflearn51_basic_dfs_and_bfs;

public class Exam2_Recursive_Function2 {

	public void DFS (int n) {
		if(n==0) return;
		
		else {		
			DFS(n/2);
			System.out.print(n%2 + "");	
		} // else
		
	} // DFS
	
	public static void main(String[] args) {
		
		Exam2_Recursive_Function2 T = new Exam2_Recursive_Function2();
		
		T.DFS(11);
	} // main

} // end class
