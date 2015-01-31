/**
* Author: Patrick Kowalski
*Name: SortDriver
*Description: BubbleSort and CocktailSort implementations in java. 
*/
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

 public class BubbleSortDriver{

	public static void main(String[] args){
		//initialize input arrays
		ArrayList<Integer> numbers1 = new ArrayList<Integer>();
		ArrayList<Integer> numbers2 = new ArrayList<Integer>();
		ArrayList<Integer> numbers3 = new ArrayList<Integer>();
		//assign values from text files to input arrays
		try{
			Scanner sc = new Scanner(new File("IntegerArray_1000.txt"));
			while (sc.hasNextInt()) {
			  numbers1.add(sc.nextInt());
			}
		}
		catch(FileNotFoundException e){
			
		}
		try{
			Scanner sc = new Scanner(new File("IntegerArray_10000.txt"));
			while (sc.hasNextInt()) {
			  numbers2.add(sc.nextInt());
			}
		}
		catch(FileNotFoundException e){
			
		}
		try{
			Scanner sc = new Scanner(new File("IntegerArray_100000.txt"));
			while (sc.hasNextInt()) {
			  numbers3.add(sc.nextInt());
			}
		}
		catch(FileNotFoundException e){
			
		}

		//initialize Bubble and Cocktail sort objects
		BubbleSort bsort = new BubbleSort();
		CocktailSort csort = new CocktailSort();
		
		//Assign ouputs of each sort and txt file combination
		String result = bsort.sort(numbers1);
		String result2 = bsort.sort(numbers2);
		String result3 = bsort.sort(numbers3);

		String cresult = csort.sort(numbers1);
		String cresult2 = csort.sort(numbers2);
		String cresult3 = csort.sort(numbers3);

		//print out results
		System.out.println("Bubble Sort Results");
		System.out.println("IntegerArray_1000.txt: " + result);
		System.out.println("IntegerArray_10000.txt: " + result2);
		System.out.println("IntegerArray_10000.txt: " + result3);

		System.out.println("Cocktail Sort Results");
		System.out.println("IntegerArray_1000.txt: " + cresult);
		System.out.println("IntegerArray_10000.txt: " + cresult2);
		System.out.println("IntegerArray_10000.txt: " + cresult3);

	
	}


}
