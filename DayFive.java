import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class DayFive {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(new File("DayFiveInput"));
		int[] nums = new int[1074];
		for (int i = 0; i < 1074; i++) {
			nums[i] = Integer.parseInt(scanner.nextLine());
		}
		int counter = 0;
		int i = 0;
		int tempInt;
		while (i >= 0 && i < nums.length) {
			tempInt = i;
			i += nums[i];
			if (nums[tempInt] >= 3) {
				nums[tempInt] -= 1;
			}
			else {
				nums[tempInt] += 1;
			}
			counter += 1;
		}
		System.out.println(counter);
	}
}
