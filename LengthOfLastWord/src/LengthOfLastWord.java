public class LengthOfLastWord {
	
	public static void main(String[] args){
		
		String words = "abcefg 123%%^^asdsdsdasd word 23@#!@#!@#";
		
		System.out.println(lastWord(words));
	}

	
	public static int lastWord(String s){
		if(s == null || s.length() == 0){
			return 0;
		}
		
		int result = 0;
		int length = s.length();
		
		boolean flag = false;
		
		for(int i=length - 1; i>=0; i--){
			
			char k = s.charAt(i);
			
			if((k >= 'a' && k<= 'z')||(k >= 'A' && k <= 'Z')){
				flag = true;
				result++;
			}
			else{
				if(flag){
					return result;
				}
			}
			
		}
		
		return result;
	}
}
