package main;

import java.util.List;
import java.util.ArrayList;

public class OfflineExercises {

	// Given a string, return a string where
	// for every char in the original string,
	// there are three chars.

	// multChar("The") → "TTThhheee"
	// multChar("AAbb") → "AAAAAAbbbbbb"
	// multChar("Hi-There") → "HHHiii---TTThhheeerrreee"

	public String multChar(String input) {
		String outString = "";
		for (String subString : input.split("")) {
			for (int i = 0; i != 3; i++) {

				outString = (outString + subString);
			}

		}
		return outString;

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
		int first= 0;
		int last =0 ;
		String out = "";
		String string = input.toLowerCase();
		for(int i =0;i!=string.length()-4;i++) {
			if(string.substring(i,i+4).contains("bert")) {
				//System.out.println(string.substring(i,i+4));
				//System.out.println(i+4);
				first = i+4;
				break;
			}
		}
		for(int i = string.length();i!=4;i--) {
			if(string.substring(i-4,i).contains("bert")) {
				//System.out.println(string.substring(i-4,i));
				//System.out.println(i-1);
				last = i-4;
				break;
			
				
			}
			
			
		}
		if (last>first) {
		String[] midChar = input.substring(first,last).split("");
		//System.out.println();
		//System.out.println(midChar.length);
		
		for(int i = midChar.length-1;i!=-1;i--) {
			out = out + midChar[i];
			//System.out.println(out);
			
		}
		}
		return out;

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
		int[] nums = { a, b, c };
		if (c > a) {
			if (c > b) {
				nums[2] = c;
			} else {
				nums[1] = c;
			}
		}

		if (b - a == c - b) {
			return true;
		} else {
			return false;
		}
//		
//		int[] nums = {,,};
//		if(a>b) {
//			if (a>c) {
//				nums[2] = a;
//			}
//			else {
//				nums[1]= a;
//			}
//			

	}

	// Given a string and an int n, return a string that removes n letters from the
	// 'middle' of the string.
	// The string length will be at least n, and be odd when the length of the input
	// is odd.

	// nMid("Hello", 3) → "Ho"
	// nMid("Chocolate", 3) → "Choate"
	// nMid("Chocolate", 1) → "Choclate"

	public String nMid(String input, int a) {
		int left = input.length() - a;
		int end = left / 2;
		String outString = "";
		outString = input.substring(0, end) + input.substring(input.length() - end, input.length());
		// System.out.println(outString);
		return outString;
	}

	// Given a string, return true if it ends in "dev". Ignore Case

	// endsDev("ihatedev") → true
	// endsDev("wehateDev") → true
	// endsDev("everoyonehatesdevforreal") → false
	// endsDev("devisnotcool") → false

	public boolean endsDev(String input) {
		int length = input.length();
		if (length < 3) {
			return false;
		}
		String string = input.toLowerCase();
		if ((string.substring(length - 3, length).contains("dev")) == true) {
			return true;
		} else {
			return false;
		}

	}

	// Given a string, return the length of the largest "block" in the string.
	// A block is a run of adjacent chars that are the same.
	//
	// superBlock("hoopplla") → 2
	// superBlock("abbCCCddDDDeeEEE") → 3
	// superBlock("") → 0

	public int superBlock(String input) {
		String[] chars = input.split("");
		int out = 0;
		int count = 0;
		for (int i = 0; i != chars.length - 1; i++) {

			// System.out.println(chars[i] + chars[i + 1]);
			if (chars[i].equals(chars[i + 1]) == true) {
				count++;
				// System.out.println(count);
			}
			if (count > out) {
				out = count;
				count = 0;
			}

		}

		return out;

	}

	// given a string - return the number of times "am" appears in the String
	// ignoring case -
	// BUT ONLY WHEN the word "am" appears without being followed or proceeded by
	// other letters
	//
	// amISearch("Am I in Amsterdam") → 1
	// amISearch("I am in Amsterdam am I?") → 2
	// amISearch("I have been in Amsterdam") → 0

	public int amISearch(String arg1) {
		int count = 0;
		String string = arg1.toLowerCase();
		// System.out.println(string);
		for (String subString : string.split(" ")) {
			if (subString.equals("am")) {
				count++;
			}

		}

		return count;

	}

	// given a number
	// if this number is divisible by 3 return "fizz"
	// if this number is divisible by 5 return "buzz"
	// if this number is divisible by both 3 and 5return "fizzbuzz"
	//
	// fizzBuzz(3) → "fizz"
	// fizzBuzz(10) → "buzz"
	// fizzBuzz(15) → "fizzbuzz"

	public String fizzBuzz(int arg1) {
		String out = "";

		if (arg1 % 3 == 0 && arg1 % 5 == 0) {
			out = "fizzbuzz";
		} else {
			if (arg1 % 3 == 0) {
				out = "fizz";
			} else {
				if (arg1 % 5 == 0) {
					out = "buzz";
				}
			}

		}
		return out;
	}

	// Given a string split the string into the individual numbers present
	// then add each digit of each number to get a final value for each number
	// String example = "55 72 86"
	//
	// "55" will = the integer 10
	// "72" will = the integer 9
	// "86" will = the integer 14
	//
	// You then need to return the highest vale
	//
	// largest("55 72 86") → 14
	// largest("15 72 80 164") → 11
	// largest("555 72 86 45 10") → 15

	public int largest(String arg1) {

		int finalTotal = 0;

		for (String numString : arg1.split(" ")) {
			int total = 0;
			for (String num : numString.split("")) {

				if (num == "0") {
					total += 0;

				}
				if (num.contentEquals("1")) {
					total += 1;

				}
				if (num.contentEquals("2")) {
					total += 2;

				}
				if (num.contentEquals("3")) {
					total += 3;

				}
				if (num.contentEquals("4")) {
					total += 4;

				}
				if (num.contentEquals("5")) {
					total += 5;

				}
				if (num.contentEquals("6")) {
					total += 6;

				}
				if (num.contentEquals("7")) {
					total += 7;

				}
				if (num.contentEquals("8")) {
					total += 8;

				}
				if (num.contentEquals("9")) {
					total += 9;

				}

				if (finalTotal < total) {
					finalTotal = total;
				}
			}
		}
		return finalTotal;
	}

}
