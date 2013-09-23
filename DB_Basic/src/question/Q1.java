package question;

public class Q1 {
	public static void main(String args[]) {
		int result;
		result = function(4);
		System.out.println(result);
	}

	static int function(int n) {
		if (n == 1)
			return 2;
		else if (n == 2)
			return 3;
		else
			return function(n - 1) * function(n - 2);
	}
}
