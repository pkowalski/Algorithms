
public class Palindrome {
	
	
	public static void main(String[] args){
		String subject = "racecar";
		System.out.println(check(subject));
		String secondSubject = "abcdefg";
		System.out.println(check(secondSubject));
	}
	
	public static boolean check(String subject){
		
		int start = 0;
		
		while(start < subject.length() / 2){
			if(subject.charAt(start) != subject.charAt(subject.length() - start - 1) ){
				return false;
			}
			start++;
		}
		
		return true;
	}

}
