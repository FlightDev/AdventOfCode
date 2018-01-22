import java.io.*;
import java.util.Scanner;
import java.lang.Math;

public class DayTwo {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(new File("DayTwoInput"));
		int[][] nums = new int[16][16];
		int counter = 0;
		for (int i = 0; i < 16; i++)	{
			for (int j = 0; j < 16; j++) {
				nums[i][j] = scanner.nextInt();
			}
		}
		for (int n = 0; n < nums.length; n++) {
			counter += divider(nums[n]);
		}
		System.out.println(counter);
	}
	public static int maxArray(int [] a) {
		int returnInt = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > returnInt) {
				returnInt = a[i];
			}
		}
		return returnInt;
	}
	public static int minArray(int [] a) {
		int returnInt = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < returnInt) {
				returnInt = a[i];
			}
		}
		return returnInt;
	}
	public static int divider(int [] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if ((Math.max(a[i], a[j]) % Math.min(a[i], a[j])) == 0){
					return Math.max(a[i], a[j]) / Math.min(a[i], a[j]);
				}
			}
		}
		return 0;
	}
}
