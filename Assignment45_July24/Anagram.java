package Assignment45_July24;
import java.util.Arrays;
public class Anagram {
	public static void main(String[] args) {
		String name1 = "listen";
		String name2 = "silent";
		
		if(name1.length()!=name2.length()) {
			System.out.println("Not ANAGRAM");
		}else {
			char [] c1 = name1.toCharArray();
			char [] c2 = name2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));
			
			boolean ans = Arrays.equals(c1, c2);
			System.out.println(ans);
		
			if(ans==true) {
				System.out.println("Given String are ANAGRAM");
			}else {
				System.out.println("Given string are not ANAGRAM");
			}
		}
	}
}
