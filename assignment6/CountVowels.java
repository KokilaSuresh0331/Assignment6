package assignment6;

public class CountVowels {
	 static int count = 0;

	    public static void main(String[] args) {
	        vowels("Kokila");
	        System.out.println("Count: " + count);
	    }

	    static void vowels(String str) {
	    	System.out.println("Present Vowel:" );
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            if (isVowel(ch)) {
	                System.out.println(ch);
	                count++;
	            }
	        }
	    }

	    static boolean isVowel(char ch) {
	        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
	    }
	}