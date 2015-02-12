/**
*Author: Patrick Kowalski
*Name: DFS.java
*Description: An implementation of the Depth First Search lgorithm used to traversing through a graph
* attempting to find the largest chain of connected nodes
**/
import java.util.Stack;

public class DFS{

	public static int DFSInit(Vertex vertex){
		//init a stakc
		Stack<Vertex> stack = new Stack<Vertex>();
		
		//push the vertext onto the stack
		stack.push(vertex);
		//init leapcount, will keep track of how many connected nodes we have	
		int leapCount = 0;
		
		//while the stack isn't empty
		while(!stack.empty()){
			//pop a vertex off the stack
			vertex = stack.pop();
			//check to see if it has been marked as traversed
			if(vertex.marked == false){
				//mark it as traversed
				vertex.marked = true;
				//loop through its neighbors
				for(Vertex v:vertex.neighbors){
					//push each neighbor onto the stack if it not already been traversed
					if(v.marked == false){
						stack.push(v);
					

						leapCount++;
					}


				}
			}
		}

		return leapCount;

	}

}