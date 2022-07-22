package inflearn51_basic_dfs;

public class Exam6_DFS_2 {
	static int n;
	static int[] ch;

	public void DFS (int L) {
		
		if(L==n+1) {
			
			for(int i=1; i<ch.length; i++) {
				
				if(ch[i] == 1) {
					System.out.print(i + " ");
				}
			}		
			System.out.println();		
		} else {
			ch[L] = 1;
			DFS(L+1);
			ch[L] = 0;
			DFS(L+1);
			
		}
	
	} // DFS
	
	public static void main(String[] args) {
		Exam6_DFS_2  tree = new Exam6_DFS_2();
		
		n = 3;
		ch = new int[n+1];
		
		tree.DFS(1); 
		
	} // main

} // end class

