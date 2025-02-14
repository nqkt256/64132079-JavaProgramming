import java.util.Scanner;

public class Delta {

	public static void main(String[] args) {
		System.out.println("Nhập phương trình bậc 2 (ax^2 + bx + c = 0): ");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập a = ");
		Integer a = scanner.nextInt();
		System.out.print("Nhập b = ");
		Integer b = scanner.nextInt();
		System.out.print("Nhập c = ");
		Integer c = scanner.nextInt();
		Integer Delta = b*b - 4*a*c;
		System.out.printf("Căn delta = %.2f", Math.sqrt(Delta));

	}

}
