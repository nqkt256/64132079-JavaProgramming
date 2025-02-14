import java.util.Scanner;

public class TheTich {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập cạnh của khối lập phương: ");
		Double canh = scanner.nextDouble();
		System.out.printf("Thể tích lập phương = %.2f", Math.pow(canh, 3));

	}

}
