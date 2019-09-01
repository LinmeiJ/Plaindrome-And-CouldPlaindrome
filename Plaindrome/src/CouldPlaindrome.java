import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CouldPlaindrome {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string:");
		String str = sc.nextLine();
		System.out.println("Adam:" + couldFormPalindrome(str));
		System.out.println("Linmei: "+couldFormP(str));
		System.out.println("rohit:"+ rohitSolution(str));
		sc.close();
	}
	
	public static boolean rohitSolution(String s) {
		int oddCounter = 0;
		  int counter = 0;
		  while (counter < s.length()) {
		     int counter2 = 0;
		     char curr = s.charAt(counter);
		     for (int i = 0; i < s.length(); i++) {
		         if (s.charAt(i) == curr) {
		             counter2++;
		         }
		    }
		    if (counter2 % 2 == 1) {
		        oddCounter++;
		    }
		    if (oddCounter > 1) {
		       return false;
		    }
		    counter++;
		 }
		 return true;
		}
		
	//test fail on :aaabbccdd
		public static boolean couldFormP(String str) {
			List<Character> ch = new ArrayList<Character>();
			
			for(char c: str.toCharArray()) {
				ch.add(c);
			}
			Collections.sort(ch);
			
			int num=0;
			int i=0;
			while(i < ch.size()-1) {
				if(ch.get(i)==(ch.get(i+1))) {
					i = i + 2;
				}
				else{
					i++;
					num++;
					if(num > 1) {
						return false;
					}
				}
			}
			return true;
		}
		
		
		
		
		public static boolean couldFormPalindrome(String string) {
			Map<Character, Integer> map = new HashMap<>();
			for(int i = 0; i < string.length(); i++) {
				if(map.containsKey(string.charAt(i))) {
					int tempNum = map.get(string.charAt(i));
					map.put(string.charAt(i), (tempNum + 1));
				}else {
					map.put(string.charAt(i), 1);
				}
			}
			int counter = 0;
			for(int i = 0; i < string.length(); i++) {
				if(map.get(string.charAt(i)) %2 != 0) {
					counter++;
				}
			}
			if(string.length() % 2 == 0 && counter == 0 || (string.length() % 2 == 1 && counter >= 1)) {
				return true;
			}else {
				return false;
			}
		}
		

}
