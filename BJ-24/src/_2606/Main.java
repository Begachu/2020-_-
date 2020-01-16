package _2606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;


public class Main {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int amount = Integer.parseInt(br.readLine());
		int edge = Integer.parseInt(br.readLine());
		ArrayList<Node> nodeList = new ArrayList(amount);
		for(int i=0; i<amount; i++) {
			nodeList.add(new Node(i));
		}
		for(int i=0; i<edge; i++) {
			String[] s = br.readLine().split(" ");
			nodeList.get(Integer.parseInt(s[1])-1).addEdge(Integer.parseInt(s[0])-1);
			nodeList.get(Integer.parseInt(s[0])-1).addEdge(Integer.parseInt(s[1])-1);
		}
		br.close();
		
		int v = -1;
		Stack<Integer> stack = new Stack();
		stack.push(0);
		while(!stack.isEmpty()) {
			int index = stack.pop();
			 Node temp = nodeList.get(index);
			 if(temp.search!=0) continue;
			 temp.search = 1;
			 v++;
			 for(int i = temp.edge.size()-1; i>=0; i--)
				 stack.push(temp.edge.get(i));
			}
		System.out.println(v);
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
