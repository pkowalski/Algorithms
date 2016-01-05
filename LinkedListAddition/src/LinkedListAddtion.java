import java.util.LinkedList;
import java.util.Scanner;

/**
 * Adds two LinkedList objects(java.util.LinkedList) containing integers
 * @author patrick
 *
 */
public class LinkedListAddtion {

	public static void main(String[] args){
		
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();

		// creating one list with the value 111
		list1.add(1);
		list1.add(1);
		list1.add(1);
		
		// creating another list with the value 7111
		list2.add(1);
		list2.add(1);
		list2.add(1);
		list2.add(7);
		
		// printing the result
		System.out.println(addTwoNumbers(list1,list2).toString());
		
	}
	
	/**
	 * Adds two lists with numbers in reverse order. Returns their sum.
	 * @param list1 list containing a number in reverse order
	 * @param list2 list containing a number in reverse order
	 * @return The sum of the two lists in reverse order
	 */
	public static LinkedList<Integer> addTwoNumbers(LinkedList<Integer> list1, LinkedList<Integer> list2){
		
		LinkedList<Integer> result = new LinkedList<Integer>();
		int i = 0;
		int carry = 0;
		
		while( i < list1.size() || i < list2.size()){
			
			if(i < list1.size()){
				carry += list1.get(i);
			}
			
			if(i < list2.size()){
				carry += list2.get(i);
			}
			
			result.add(carry%10);
			carry = carry/10;
			i++;
		}
		
		if(carry == 1){
			result.add(carry);
		}
		
		return result;
	}
}
