package assignment6;

public class ReverseSentence {
	public static void main(String[] args) {
		 String reversedString = reverseWord("Welcome to java world");
	     System.out.println("After reverse: " + reversedString);
	}
	public static  String reverseWord(String str) {
		if(str==null||str.isEmpty()) {
			return str;
		}
		String reverse=" ";
		for(int i=str.length()-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);
		}
	return reverse;
	}
	}
