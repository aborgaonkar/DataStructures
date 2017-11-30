package Strings;

public class ReverseStringInPlace {
	public static String reverseArray(String str) {
		char[] charArray = str.toCharArray();
		for(int i = 0 ; i < charArray.length/2; i++) {
			char temp = charArray[i];
			charArray[i] = charArray[charArray.length-i-1];
			charArray[charArray.length-i-1] = temp;
		}
		return String.valueOf(charArray);
	}
	public static void main(String[] args) {
		System.out.println(reverseArray("1234"));
	}
}
