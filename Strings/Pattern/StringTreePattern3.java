package Strings.Pattern;


public class StringTreePattern3 {
	
	public static void buildPattern() {
		System.out.println("@");
		for(int i = 1 ; i <= 5; i++) {
			System.out.print("@");
			for(int j = 0; j <=i ; j++) {
				System.out.print(" ");
			}
			System.out.print("@");
			System.out.println("");
		}
		System.out.println("@ @ @ @ @");
	}
	
	public static void main(String[] args) {
		buildPattern();
	}
}
