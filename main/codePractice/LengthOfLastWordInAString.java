package codePractice;

/*Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.

Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.*/
public class LengthOfLastWordInAString {
	 public int lengthOfLastWord(String s) {
		 String brokenString[] = s.split(" ");
		 return brokenString[brokenString.length-1].length();
	 }
 
	 public static void main(String[] args) {
		LengthOfLastWordInAString l = new LengthOfLastWordInAString();
		System.out.println(l.lengthOfLastWord("Hello World"));
	}
}
