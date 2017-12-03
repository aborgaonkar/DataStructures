package Strings.Pattern;


public class StringTreePattern2 {
	
	public static void buildPattern(String[] val) {
		
		for(int i = 0 ; i <= val.length; i++){
			
			for(int j = 0; j < val.length ; j++) {
				if(j <= i) {
					System.out.print(" "+ val[j]);
				}else {
					System.out.print(" "+ "*");
				}
			}
			
			System.out.println(" ");
		}
	}
	
	public static void main(String[] args) {
		String[] val = {"a","b","c","d","e"};
		buildPattern(val);
	}
}
