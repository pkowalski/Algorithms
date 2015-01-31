/**
* Author: Patrick Kowalski
*Name: Cocktail
*Description: CocktailSort implementation in java. 
*/
import java.util.ArrayList;
public class CocktailSort{

	public CocktailSort(){

	}

	public String sort(ArrayList<Integer> numbers){
		//variables for logging number of comparisons and swapps
		int compare = 0;
		int swap = 0;

		//determines when to break loop. If no swapping occurs array is in order
		boolean swapped = false;
		//assigning end of array for easy readability later on
		int end = numbers.size()-1;
		//start of array for same reason as above
		int start = 0;

		//begin loop
		do{
			//incase swapped was set to true in previous iteration
			swapped = false;
			//loops from begining to end
			for(int i = start;i<end;i++){
				compare++;
				//check if index value is greater then the next value
				if(numbers.get(i) > numbers.get(i + 1)){
					//increase number of swapps
					swap++;
					//assign this value to a temporary variable
					int temp = numbers.get(i);
					//swap the two index values
					numbers.set(i,numbers.get(i+1));
					numbers.set(i+1,temp);
					//set swapped to true since values were swapped
					swapped = true;
				}
			}

			//if nothing was swapped the array is in order and we can break
			if(!swapped){
				break;
			}
			//lower the range of movement. The end of the array is order from the first iteration
			end--;

			//begin looping in the opposite direction
			for(int i = end--;i>=start;i--){
				compare++;
				if(numbers.get(i) > numbers.get(i + 1)){
					//increase number of swapps
					swap++;
					//assign this value to a temporary variable
					int temp = numbers.get(i);
					//swap the two index values
					numbers.set(i,numbers.get(i+1));
					numbers.set(i+1,temp);
					//set swapped to true since values were swapped
					swapped = true;
				}
			}

			//begining of array is now order so we can lower the range we loop through
			start++;

		}while(swapped);

		return "Cocktail Sort comparisons: " + compare + " swaps: " + swap;
	}
}