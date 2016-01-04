import java.util.Arrays;
public class ReverseArray {
	
	
	public static void main(String[] args){
		int[] numbers = new int[]{1,2,3,4,5,6,7};
		
		// printing the result
		System.out.println(Arrays.toString(rotateArray(numbers,3)));
	}

	public static int[] withArray(int[] numbers, int steps){
		
		int[] temp = new int[numbers.length];
		int j=0;
		
		if(steps > numbers.length){
			steps = steps%numbers.length;
		}
		
		for(int i=0; i<steps; i++){
			temp[i] = numbers[numbers.length - steps + i];
		}
		
		for(int i=steps; i<numbers.length; i++){
			temp[i] = numbers[j];
			j++;
		}
	
		return temp;
	}
	
	public static int[] bubbleSortWay(int[] numbers, int steps){
		
		for(int i=0;i<steps;i++){
			for(int j=numbers.length - 1;j>0;j--){
				int temp = numbers[j];
				numbers[j] = numbers[j - 1];
				numbers[j-1] = temp;
			}
		}
		
		return numbers;
	}
	
	public static int[] rotateArray(int[] numbers, int split){
		
		int start = numbers.length - split;
		
		reverseArray(numbers,0,start-1);
		reverseArray(numbers,start,numbers.length-1);
		reverseArray(numbers,0,numbers.length-1);
		
		return numbers;
		
	}
	
	public static void reverseArray(int[] numbers, int left, int right){
		
		while(left < right){
			int temp = numbers[left];
			numbers[left] = numbers[right];
			numbers[right] = temp;
			left++;
			right--;	
		}
	}
}
