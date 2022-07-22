package inflearn51_basic_dfs_and_bfs;

public class Exam3_Recursive_Function3 {

	public int DFS (int n) {
		if(n==1) return 1;
		
		else return n*DFS(n-1);
		
	} // DFS
	
	public static void main(String[] args) {
		
		Exam3_Recursive_Function3 T = new Exam3_Recursive_Function3();
		
	
		System.out.println(T.DFS(5));
	} // main

} // end class
