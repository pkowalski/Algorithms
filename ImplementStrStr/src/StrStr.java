
public class StrStr {
	
	public static void main(String[] args){
		String haystack = "does this work";
		String needle = "work";
		String secondNeedle = "not";
		
		System.out.println(findIndex(haystack,needle));
		System.out.println(findIndex(haystack,secondNeedle));
	}

	
	public static int findIndex(String haystack, String needle){
		
		if(haystack == null || needle == null){
			return 0;
		}
		
		if(needle.length() == 0){
			return 0;
		}
		
		for(int i = 0; i<haystack.length();i++){
			
			if(needle.length() > haystack.length()){
				return -1;
			}
			
			int m = i;
			
			for(int j = 0;j<needle.length();j++){
				if(needle.charAt(j) == haystack.charAt(m)){
					if(needle.length() - 1 == j){
						return i;
					}
					m++;
				}
				else{
					break;
				}
			}
			
		}
		
		return -1;
	}
}
