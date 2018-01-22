
import java.util.Arrays;
import java.util.Collections;

public class DaySix {
	public static void main(String[] args) {
		int[] distro = {11, 11, 13, 7, 0, 15, 5, 5, 4, 4, 1, 1, 7, 1, 15, 11};
		//int[] distro = {0, 2, 7, 0};
		int counter = 0;
		int[] newDistro = distro;
		String[] seen = new String[10000];
		int i = 1;
		seen[0] = toString(distro);
		while (true) {
			rearrange(newDistro);
			
			seen[i] = toString(newDistro);
			if (newEquals(seen, toString(newDistro), i)) {
				break;
			}
			i++;
		}
		System.out.println(i);
	}
	public static void rearrange(int[] newDistro) {
		int maxInt = 0;
		int maxIndex = 0;
		for (int i = 0; i < newDistro.length; i++) {
			if (newDistro[i] > maxInt) {
				maxInt = newDistro[i];
				maxIndex = i;
			}
		}
		newDistro[maxIndex] = 0;
		for (int j = maxIndex + 1; j <= maxIndex + maxInt; j++) {
			newDistro[j % newDistro.length] += 1;
		}
	}

	public static boolean newEquals(String[] a, String b, int i) {
		for (int k = 0; k < i; k++) {
			if (a[k].equals(b)) {
				System.out.println(i - k);
				return true;
			}
		}
		return false;
	}
	public static String toString(int[] a) {
		String returnString = "";
		for (int i = 0; i < a.length; i++) {
			returnString += a[i];
		}
		return returnString;
	}
}