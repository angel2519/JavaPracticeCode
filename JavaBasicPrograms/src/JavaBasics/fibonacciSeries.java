package JavaBasics;

public class fibonacciSeries {

	public static void main(String[] args) {
		//secondOrder(10);
       ThirdOrder(10);
	}

	public static void secondOrder(int n) { // exp op: 0 1 1 2 3 5 8 13 21 34 ..

		int n1 = 0;
		int n2 = 1;
		int temp;
		System.out.print(n1 + " " + n2);
		for (int i = 2; i < n; i++) {
			temp = n1 + n2;
			System.out.print(" " + temp + " ");
			n1 = n2;
			n2 = temp;
		}
	}

	public static void ThirdOrder(int n) { // exp op: 0 1 1 2  4  7  13  24  44 ...
		int n1 = 0;
		int n2 = 1;
		int n3 = 1;
		int temp;
		System.out.print(n1 + " " + n2 + " " + n3);
		for (int i = 0; i < n; i++) {
			temp = n1 + n2 + n3;
			System.out.print(" " + temp + " ");
			n1 = n2;
			n2 = n3;
			n3 = temp;
		}
	}
}
