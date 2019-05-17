package main;

public class OfflineExercises {

	// Given a string, return a string where
	// for every char in the original string,
	// there are three chars.

	// multChar("The") → "TTThhheee"
	// multChar("AAbb") → "AAAAAAbbbbbb"
	// multChar("Hi-There") → "HHHiii---TTThhheeerrreee"

	public String multChar(String input) {
		
		input = "The";
		String out = "";
		int length = input.length();
		int x = 0;
		int y = 1;
		for (int i = 0; i < length; i++) {
			input.substring(x, y);
			out =(input.substring(x,y));
			out =(input.substring(x,y));
			out =(input.substring(x,y));
			x++;
			y++;
		}
		
		return out;
	}
	
	// Return the string (backwards) that is between the first and last appearance
	// of "bert"
	// in the given string, or return the empty string "" if there is not 2
	// occurances of "bert" - Ignore Case

	// getBert("bertclivebert") → "evilc"
	// getBert("xxbertfridgebertyy") → "egdirf"
	// getBert("xxBertfridgebERtyy") → "egdirf"
	// getBert("xxbertyy") → ""
	// getBert("xxbeRTyy") → ""

	public String getBert(String input) {
	
		
		return "";
	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large. Do not assume the ints will come to you in a reasonable
	// order.

	// evenlySpaced(2, 4, 6) → true
	// evenlySpaced(4, 6, 2) → true
	// evenlySpaced(4, 6, 3) → false
	// evenlySpaced(4, 60, 9) → false

	public boolean evenlySpaced(int a, int b, int c) {
		a = 2;
		b = 4;
		c = 6;
		
		Boolean agreed = true;
		if(a > b && a > c)  {
			int large = a;
			if(b > c ) {
				int medium = b;
				int small = c;
				int differenceLarMed = large - medium;
				int differenceMedSmall = medium - small;
				
				if(differenceLarMed == differenceMedSmall) {
					System.out.println("true");
					return agreed = true;
					
				}
				else
					System.out.println("false");
					return agreed = false;
				
			}
			else if(c > b) {
				int medium = c;
				int small = b;
				
				
				int differenceLarMed = large - medium;
				int differenceMedSmall = medium - small;
				
				if(differenceLarMed == differenceMedSmall) {
					System.out.println("true");
					return agreed = true;
					
				}
				else
					System.out.println("false");
					return agreed = false;
			}
			
		}
		
		
		else if (b > a && b > c) {
			int large = b;
			if(a > c ) {
				int medium = a;
				int small = c;
				int differenceLarMed = large - medium;
				int differenceMedSmall = medium - small;
				
				if(differenceLarMed == differenceMedSmall) {
					System.out.println("true");
					return agreed = true;
					
				}
				else
					System.out.println("false");
					return agreed = false;
			}
			else if(c > a) {
				int medium = c;
				int small = a;
				int differenceLarMed = large - medium;
				int differenceMedSmall = medium - small;
				
				if(differenceLarMed == differenceMedSmall) {
					System.out.println("true");
					return agreed= true;
					
				}
				else
					System.out.println("false");
					return agreed = false;
			}
		}
		
		
		else if (c > a && c > b) {
			int large = c;
			if(a > b ) {
				int medium = a;
				int small = b;
				int differenceLarMed = large - medium;
				int differenceMedSmall = medium - small;
				
				if(differenceLarMed == differenceMedSmall) {
					System.out.println("true");
					return agreed = true;
					
				}
				else
					System.out.println("false");
					return agreed = false;
			}
			else if(b > a) {
				int medium = b;
				int small = a;
				int differenceLarMed = large - medium;
				int differenceMedSmall = medium - small;
				
				if(differenceLarMed == differenceMedSmall) {

					return agreed = true;
					
				}
				else

					return agreed = false;
		}}
		return agreed;
	}



	// Given a string and an int n, return a string that removes n letters from the 'middle' of the string.
	// The string length will be at least n, and be odd when the length of the input is odd.

	// nMid("Hello", 3) → "Ho"
	// nMid("Chocolate", 3) → "Choate"
	// nMid("Chocolate", 1) → "Choclate"

	public String nMid(String input, int a) {
		input = "Hello";
		a = 3;
		int length = input.length();
		int midpoint = length;
	
		return "";
	}

	// Given a string, return true if it ends in "dev". Ignore Case

	// endsDev("ihatedev") → true
	// endsDev("wehateDev") → true
	// endsDev("jh") → false
	// endsDev("everoyonehatesdevforreal") → false
	// endsDev("devisnotcool") → false

	public boolean endsDev(String input) {
		
		input ="ihatedev";
		int s = input.length();
		boolean dev = false;
		for (int i = 0; i < input.length(); i++) {
		String sub = input.substring(s - 3);
		 if (sub.equals("dev"))
		 {
			 dev = true;
		 }
		 else dev = false;
		}
		return dev;
	}



	// Given a string, return the length of the largest "block" in the string.
	// A block is a run of adjacent chars that are the same.
	//
	// superBlock("hoopplla") → 2
	// superBlock("abbCCCddDDDeeEEE") → 3
	// superBlock("") → 0

	public int superBlock(String input) {
		return -1;

	}
	
	//given a string - return the number of times "am" appears in the String ignoring case -
	// BUT ONLY WHEN the word "am" appears without being followed or proceeded by other letters
	//
	//amISearch("Am I in Amsterdam") → 1
	//amISearch("I am in Amsterdam am I?") → 2
	//amISearch("I have been in Amsterdam") → 0

	public int amISearch(String arg1) {
		arg1 = "I am in Amsterdam am I?";
		int counter = 0;

		for (int i = 0; i < arg1.length(); i++) {
			String sub = arg1.substring(i, i+4).toLowerCase();
			if (sub.equals(" am ") || sub.equals("am ")|| sub.equals(" am "))
			{
				
				counter++;
				System.out.println(counter);	
		}
			
		}
		return counter;
		
	}
	
	//given a number 
	// if this number is divisible by 3 return "fizz"
	// if this number is divisible by 5 return "buzz"
	// if this number is divisible by both 3  and 5return "fizzbuzz"
	//
	//fizzBuzz(3) → "fizz"
	//fizzBuzz(10) → "buzz"
	//fizzBuzz(15) → "fizzbuzz"
	
	public String fizzBuzz(int arg1) {
		arg1 = 9;
		
		String out = "";
		if (arg1 % 3 == 0 && arg1 % 5 == 0) {
			out = "fizzbuzz";
		}
		else if (arg1 % 3 == 0) {
			out = "fizz";
		}
		else if (arg1 % 5 == 0) {
			out = "buzz";
		}
		System.out.println(out);
		return out;
		
	}
	
	//Given a string split the string into the individual numbers present
	//then add each digit of each number to get a final value for each number
	// String example = "55 72 86"
	//
	// "55" will = the integer 10
	// "72" will = the integer 9
	// "86" will = the integer 14
	//
	// You then need to return the highest vale
	//
	//largest("55 72 86") → 14
	//largest("15 72 80 164") → 11
	//largest("555 72 86 45 10") → 15
	
	public int largest(String arg1) {
		
		arg1 ="55 72 86" ;
		String[] split = arg1.split(" ");

	for (String numbers: split) {
			System.out.println(numbers);
		}
		
//		int num2 = addition % 10;
//		int num1 = addition / 10 % 10;
//		int sum = num2 + num1;
//		System.out.println(sum);
		
	return 0;
	}
	
		
}

