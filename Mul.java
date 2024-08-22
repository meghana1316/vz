import java.util.Scanner;
class Mul {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int maxNum = sc.nextInt();
		for ( int i = 1; i <= maxNum; i ++) {
			System.out.println("Multiplicationtable for " + i + ":");
			for ( int j = 1; j <= 10; j ++) {
				System.out.println(i + "x" + j + "=" + (i*j));
			}
			System.out.println();
		}
		sc.close();
	}
}