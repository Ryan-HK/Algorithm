package inflearn51_basic_dfs;

public class Exam7_DFS_3 {
	Node root;
	

	public int DFS (int L, Node root) {
		
		
		return 0;
	} // DFS
	
	public static void main(String[] args) {
		Exam7_DFS_3  tree = new Exam7_DFS_3();
		
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		tree.root.rt.lt = new Node(6);
		tree.root.rt.rt = new Node(7);
		
		System.out.println(tree.DFS(0, tree.root));
		
	} // main

} // end class

