import java.util.Scanner;

public class ChuviDT {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập chiều dài: ");
		double dai = scanner.nextDouble();
		System.out.print("Nhập chiều rộng: ");
		double rong = scanner.nextDouble();
		System.out.printf("Chu vi = %.2f", (dai + rong)*2);
		System.out.println();
		System.out.printf("Diện tích = %.2f", dai*rong);
		System.out.println();
		System.out.printf("Cạnh nhỏ nhất = %.2f", Math.min(dai, rong));

	}

}
