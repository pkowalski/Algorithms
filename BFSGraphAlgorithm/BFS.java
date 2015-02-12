/**
*Author: Patrick Kowalski
*Name: BFS.java
*Description: An implementation of the Breadth First Search lgorithm used to traversing through a graph
* attempting to find the largest chain of connected nodes
**/
import java.util.Queue;
import java.util.LinkedList;

public class BFS{

	public static int BFSInit(Vertex vertex){
		//init a queue
		Queue<Vertex> queue = new LinkedList<Vertex>();
		
		//add the current vertex to the queue
		queue.add(vertex);
		
		//init leapcount, will keep track of how many connected nodes we have
		int leapCount = 0;
		
		//while queue is not empty
		while(queue.peek() != null){
			//remove the top entry
			vertex = queue.remove();

			//check if it was already been traversed
			if(vertex.marked == false){
				//makr it as being traversed
				vertex.marked = true;
				//loop through its neighbors
				for(Vertex v:vertex.neighbors){
					//add each neighbor to the queue if it has not been already traversed
					if(v.marked == false){
						queue.add(v);

					
						leapCount++;
					}


				}
			}
		}

		return leapCount;

	}

}