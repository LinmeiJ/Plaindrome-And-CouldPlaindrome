
public class PlaindromeNumber {

	public static void main(String args[]) {
		int reminder, tempNum;
		int sum = 0, num = 454;
		
		tempNum = num;
		while (num > 0) {
			reminder = num % 10; 
			sum = (sum * 10) + reminder;
			num = num / 10; 
		}
		
		if (tempNum == sum) {
			System.out.println("It is a palindrome number ");
		} else {
			System.out.println("It is not palindrome");
		}
	}
}
