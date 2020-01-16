package _1260;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s1 = br.readLine().split(" ");
		int v_size = Integer.parseInt(s1[0]);
		int e_size = Integer.parseInt(s1[1]);
		int f_search = Integer.parseInt(s1[2]);
		
		
		ArrayList<Node> nodeList = new ArrayList(v_size);
		for(int i=0; i<v_size; i++) {
			nodeList.add(new Node(i));
			}
		for(int i=0; i<e_size; i++) {
			String[] s = br.readLine().split(" ");
			//int node1 = Integer.parseInt(br.readLine())-1;
			//int node2 = Integer.parseInt(br.readLine())-1;
			nodeList.get(Integer.parseInt(s[1])-1).addEdge(Integer.parseInt(s[0])-1);
			nodeList.get(Integer.parseInt(s[0])-1).addEdge(Integer.parseInt(s[1])-1);
		}
		br.close();
		
		
		Stack<Integer> stack = new Stack();
		stack.push(f_search-1);
		while(!stack.isEmpty()) {
			int index = stack.pop();
			 Node temp = nodeList.get(index);
			 if(temp.search!=0) continue;
			 System.out.print(index+1+" ");
			 temp.search = 1;
			 for(int i = temp.edge.size()-1; i>=0; i--)
				 stack.push(temp.edge.get(i));
		}
		System.out.println();
		Queue<Integer> queue = new LinkedList();
		queue.add(f_search-1);
		while(!queue.isEmpty()) {
			int index = queue.poll();
			Node temp = nodeList.get(index);
			 if(temp.search!=1) continue;
			 System.out.print(index+1+" ");
			 temp.search = 2;
			 for(int i = 0; i<temp.edge.size(); i++)
				 queue.add(temp.edge.get(i));
		}
	}
	
}
class Node{
		int vertex;
		int search = 0;
		ArrayList<Integer> edge;
		public Node(int i) {
			this.vertex = i;
			this.edge = new ArrayList();
		}
		public void addEdge(int index) {
			int success = 0;
			for(int i=0; i<edge.size(); i++) {
				if(edge.get(i)<=index) continue;
				edge.add(i, index);
				success++;
				break;
			}
			if(success==0) edge.add(index);
		}
	}