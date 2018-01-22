import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;


public class DayFour {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(new File("DayFourInput"));
		int counter = 0;
		for (int i = 0; i < 512; i++) {
			String s = scanner.nextLine();
			counter += valid(s);
		}
		System.out.println(counter);
	}
	public static int valid(String s) {
		String[] words = s.split(" ");
		for (int i = 0; i < words.length - 1; i++) {
			for (int j = i + 1; j < words.length; j++){
				if (isAnagram(words[i], words[j])) {
					return 0;
				}
			}
		}
		return 1;
	}
	public static boolean isAnagram(String firstWord, String secondWord) {
	     char[] word1 = firstWord.replaceAll("[\\s]", "").toCharArray();
	     char[] word2 = secondWord.replaceAll("[\\s]", "").toCharArray();
	     Arrays.sort(word1);
	     Arrays.sort(word2);
	     return Arrays.equals(word1, word2);
	}

}