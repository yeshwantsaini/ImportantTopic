package StringPalindrome;

public class StringPalindrome {
	
	public static void main(String args[]) {
		
		String str = "abcd"; 
	
		
		boolean isPalindorme = isPalindrome(str);
		
	   System.out.print(isPalindorme);
	}
	
	
	public static boolean isPalindrome(String str) {
		int start = 0;
		int end = str.length()-1;
		
		while(start < end) {
			if(str.charAt(start) != (str.charAt(end))) {
				return false;
			}
				
			start++;
			end--;
			
		
		}
		
		return true;
	}

}
