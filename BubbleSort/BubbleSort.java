/**
* Author: Patrick Kowalski
*Name: BubbleSort
*Description: BubbleSort implementation in java. 
*/
import java.util.ArrayList;
public class BubbleSort{

	public BubbleSort(){

	}

	public String sort(ArrayList<Integer> numbers){

		//for logging the number of comparisons and swaps
		int compare = 0;
		int swap = 0;

		//loop through the input array
		for(int i = 1;i<numbers.size();i++){
			//nested loop for comparing each number with the number to its right
			for(int j = 0;j<numbers.size()-1;j++){
				//increase compare count
				compare++;
				//is the current number larger than the number that comes after it
				if(numbers.get(j) > numbers.get(j + 1)){
					//increase number of swapps
					swap++;
					//assign this value to a temporary variable
					int temp = numbers.get(j);
					//swap the two index values
					numbers.set(j,numbers.get(j+1));
					numbers.set(j+1,temp);
				}
			}
		}

		return "Bubble sort comparisons: " + compare + " swaps: " + swap;
	}
}