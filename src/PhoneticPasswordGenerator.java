import java.util.Random;

public class PhoneticPasswordGenerator{
	
	static String vowels = "aeiou";
	static String consonants = "bcdfghjklmnpqrstvwxyz";

	public static String str(int passlength){
		Random random = new Random();
		char a = consonants.charAt( random.nextInt(consonants.length()) );
		char b = vowels.charAt( random.nextInt(vowels.length()));
		char c = consonants.charAt( random.nextInt(consonants.length()) );
		
		char x = consonants.charAt( random.nextInt(consonants.length()) );
		char y = vowels.charAt( random.nextInt(vowels.length()));
		char z = consonants.charAt( random.nextInt(consonants.length()) );
				
		return a+""+b+""+c+""+x+""+y+""+z;
	}
	
	public static void main(String[] args){
		System.out.println(str(6));
	}
}