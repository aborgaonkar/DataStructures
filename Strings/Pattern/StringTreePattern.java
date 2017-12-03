package Strings.Pattern;


public class StringTreePattern {
	
	public static void buildPattern(String[] val) {
		
		for(int i = 0 ; i <= val.length; i++){
			
			for(int j = 0; j < i ; j++) {
				System.out.print(" "+ val[j]);
			}
			
			System.out.println(" ");
		}
	}
	
	public static void main(String[] args) {
		String[] val = {"a","b","c","d","e"};
		buildPattern(val);
	}
}
