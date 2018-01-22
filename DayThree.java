public class DayThree {
	public static void main(String[] args) {
		int endingInt = 312051;
		//int endingInt = 5;
		int[][] spiral = new int[20][20];
		int movingX = 10;
		int movingY = 10;
		int i = 1;
		int moveDist = 1;
		int direction = -1;
		spiral[movingY][movingX] = i;
		while (i <= endingInt) {
			for (int n = 0; n < 4; n++) {
				for (int k = 0; k < moveDist; k++) {
					movingX += 1;
					i = newValue(spiral, movingY, movingX);
					spiral[movingY][movingX] = i;
					if (i > endingInt) {
						break;
					}
				}
				for (int k = 0; k < moveDist; k++) {
					movingY -= 1;
					i = newValue(spiral, movingY, movingX);
					spiral[movingY][movingX] = i;
					if (i > endingInt) {
						break;
					}
				}
				moveDist += 1;
				for (int k = 0; k < moveDist; k++) {
					movingX -= 1;
					i = newValue(spiral, movingY, movingX);
					spiral[movingY][movingX] = i;
					if (i > endingInt) {
						break;
					}
				}
				for (int k = 0; k < moveDist; k++) {
					movingY += 1;
					i = newValue(spiral, movingY, movingX);
					spiral[movingY][movingX] = i;
					if (i > endingInt) {
						break;
					}
				}
				if (i > endingInt) {
					break;
				}
				moveDist += 1;
			}
		}
		
		for (int y = 0; y < spiral.length; y++) {
			for (int x = 0; x < spiral[0].length; x++) {
				System.out.print(spiral[y][x] + " \t" );
			}
			System.out.println();
		}
	}
		/*
		for (int y = 0; y < spiral.length; y++) {
			for (int x = 0; x < spiral[0].length; x++) {
				if (spiral[y][x] >= endingInt) {
					System.out.println((10 - x) + " " + (10 - y));
					break;
				}
			}
		}
	}
	*/
	public static int newValue(int[][] nums, int y, int x) {
		int counter = 0;
		for (int i = x - 1; i <= x + 1; i++) {
			for (int j = y - 1; j <= y + 1; j++) {
				counter += nums[j][i];
			}
		}
		return counter;
	}
}
