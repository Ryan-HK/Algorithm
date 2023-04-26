package inflearn51_basic_dfs;

public class Exam4_Recursive_Function4 {

	public void DFS (int n) {
		if(n==1) {
			System.out.print(n + " ");
			return;
		}
	
		else {
			DFS(n-1);
			System.out.print(n-1 + n-2 + " ");
		}
		
	} // DFS
	
	public static void main(String[] args) {
		
		Exam4_Recursive_Function4 T = new Exam4_Recursive_Function4();
	
		T.DFS(7);
	} // main

} // end class
