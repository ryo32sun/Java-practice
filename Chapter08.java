
public class Chapter08 {
	public static void main(String[] arge) {
		int num = 1;
		while (num < 5) {
			System.out.println("While = " + (num * num));
			num += 1;
		}
		int[] box = new int[] {1, 2, 3, 4};
		for (int i = 0; i < 4; i++) {
			System.out.println("For1 = " + box[i]);
		}

		for (int number : box) {
			if (number % 2 == 0) {
				continue;
			}
			System.out.println("For02 = " + number);
		}
	}
}
