/**
* Author: Patrick Kowalski
*Name: GraphDriverBFS
*Description: A driver that implements BFS algortithm to traverse in imported graph
*/
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.util.HashMap;
import java.util.Collections;


 public class GraphDriverBFS{

	public static void main(String[] args){
		//initialize input hashmap
		HashMap<Integer,Vertex> vertices = new HashMap<Integer,Vertex>();
		
		//assign values from text files to input arrays
		try{

			
			
			Scanner sc = new Scanner(new File("graph.txt"));
			while((sc.hasNextInt())){
				//grab both integers on each line
				Integer first = sc.nextInt();
				Integer second = sc.nextInt();
				
				Vertex v1 = new Vertex(first);
				Vertex v2 = new Vertex(second);

				//check this vertex exists
				if(!vertices.containsKey(first)){
					//add the vertext to the hashmap
					vertices.put(first,v1);
				}
				else{
					//otherwise grab the exisiting vertex from the hashmap
					v1 = vertices.get(first);
				}

				//repeat above code for second integer input
				if(!vertices.containsKey(second)){

					
					vertices.put(second,v2);
				}
				else{
					v2 = vertices.get(second);
				}

				v1.addToNeighbors(v2);
				v2.addToNeighbors(v1);


			}
		}
		catch(FileNotFoundException e){
			
		}

		//init an array lsit to store the results
		ArrayList<Integer> results = new ArrayList<Integer>();


		//loop through the hasmap
		for(Integer key: vertices.keySet()){
			//skip the call if the current vertex has already been marked(checked)
			if(vertices.get(key).marked == false){
				//else run it through BFS
				results.add(BFS.BFSInit(vertices.get(key)));

				
			}
		}

		//sort the results array
		Collections.sort(results);
		//grab the last index
		int last = results.size();

		//print out the 5 largest results
		System.out.println("Highest BFS 5: " + results.get(last-1) + "," + results.get(last-2) + "," + results.get(last-3) + 
			"," + results.get(last-4) + "," + results.get(last-5));
		
	
	}



	


}
