package assignment6;

public class FirstLetterCapitalize {
	public static void main(String[] args) {    
	    String message = "welcome to java world";
	    System.out.println("Before message:"+message);
	    char[] charArray = message.toCharArray();
	    boolean space = true;

	    for(int i = 0; i < charArray.length; i++) {
	      if(Character.isLetter(charArray[i])) {
	        if(space) {
	          charArray[i] = Character.toUpperCase(charArray[i]);
	          space = false;
	        }
	      }

	      else {
	        space = true;
	      }
	    }
	    message = String.valueOf(charArray);
	    System.out.println("Message: " + message);
	  }
	}

