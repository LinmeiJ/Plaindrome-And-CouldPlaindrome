
public class RegularPlaindrome {
	public static void main(String[] args) {
		String str = "abcdedcb";
		str.toLowerCase();
		if(recursivePalindrome(str)){
			System.out.println("it is a plaindrome");
		}
		else{
			System.out.println("It is not a plaindrome");
		}
	}
	
	private static boolean recursivePalindrome(String str) {
		if(str.length() == 0 || str.length() == 1) {
			return true;
		}
		else if(str.charAt(0) == str.charAt(str.length() - 1)) {
			return recursivePalindrome(str.substring(1, str.length() - 1));
		}
		else{
			return false;
		}
	}

}
