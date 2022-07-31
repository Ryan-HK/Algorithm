package inflearn52_basic_bfs;

import java.util.LinkedList;
import java.util.Queue;

public class Exam2_DFS_2 {
	Node root;
	

	public int BFS (Node root) {
		Queue<Node> Q = new LinkedList<>();
		
		Q.offer(root);
		int L = 0;
		
		while(!Q.isEmpty()) {
			int len = Q.size();
			
			for(int i=0; i<len; i++) {
				Node cur = Q.poll();
				
				// 말단 노드가 최초 발견 될 때! 
				if(cur.lt == null && cur.rt == null) return L;
				
				// else
				// 말단 노드가 있다면 Q에 저장
				if(cur.lt != null) Q.offer(cur.lt);
				if(cur.rt != null) Q.offer(cur.rt);
				 
			} // for
			L++;
			
		} // while
		
		return L;
	} // DFS
	
	public static void main(String[] args) {
		Exam2_DFS_2  tree = new Exam2_DFS_2();
		
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		
		System.out.println(tree.BFS(tree.root));
		
	} // main

} // end class

