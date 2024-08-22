class ForEach {
	public static void main (String[] args) {
		int[] num1 = {1, 2, 3, 4, 5};
		System.out.println("Using traditional for loop:");
		for ( int i = 0; i < num1.length; i ++) {
			System.out.println(num1[i]);
		}
		System.out.println("\n Using for-each loop:");
		for ( int num2: num1 ) {
			System.out.println(num2);
		}
	}
}