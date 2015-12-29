import java.util.Arrays;

public class MergeSort {
	
	
	public static void main(String[] args){
		
		int[] numbers = new int[] {9,8,7,6,5,4,3,2,1,0};

		mergeSort(numbers);
		
		System.out.println(Arrays.toString(numbers));
		
	}
	

	public static int[] mergeSort(int[] numbers){
		
		if(numbers.length <= 1){
			return numbers;
		}
		
		int[] first = new int[numbers.length/2];
		int [] second = new int[numbers.length - first.length];

		System.arraycopy(numbers,0,first,0,first.length);
		System.arraycopy(numbers,first.length,second,0,second.length);
		
		mergeSort(first);
		mergeSort(second);
		
		mergeParts(first,second,numbers);
		return numbers;
	}
	
	public static void mergeParts(int[] first, int[] second, int[] result){
		
		int indexFirst = 0;
		int indexSecond = 0;
		
		int j = 0;
		
		while(indexFirst < first.length && indexSecond < second.length){
			if(first[indexFirst] < second[indexSecond]){
				result[j] = first[indexFirst];
				indexFirst++;
			}
			else{
				result[j] = second[indexSecond];
				indexSecond++;
			}
			j++;
		}
		
		System.arraycopy(first,indexFirst,result,j,first.length - indexFirst);
		System.arraycopy(second,indexSecond,result,j,second.length - indexSecond);
		
	}
	

}
