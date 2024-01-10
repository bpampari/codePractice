package stringfun;

import java.util.Arrays;

public class AnagramStrings {

	public static void main(String[] args) {
		String str1 = "Racer";
	    String str2 = "Carre";
	    
	    if(str1.length()!=str2.length()) {
	    	System.out.println("Strings are not Anagrams");
	    }else {
	    	str1 = str1.toLowerCase();
	    	str2 = str2.toLowerCase();
	    	char[] strArrayOne = str1.toCharArray();
	    	char[] strArrayTwo = str2.toCharArray();
	    	
	    	Arrays.sort(strArrayOne);
	    	Arrays.sort(strArrayTwo);
	    	
	    	// Method 1
	    	if(Arrays.equals(strArrayOne, strArrayTwo)) {
	    		System.out.println("Strings are Anagrams");
	    	} else {
	    		System.out.println("Strings are not anagrams");
	    	}
	    	
	    	// alternate method
	    	boolean isAnagram= true;
	    	for(int i=0;i<strArrayOne.length;i++) {
	    		if(strArrayOne[i]!=strArrayTwo[i]) {
	    			isAnagram=false;
	    		}
	    	}
	    	if(isAnagram) {
	    		System.out.println("Strings are Anagrams");
	    	} else {
	    		System.out.println("Strings are not anagrams");
	    	}	    	
	    }

	}

}
