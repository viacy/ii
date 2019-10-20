package first;

public class testtwo {
	public static void main(String args[]) {
		int a = 4;
		int b = 0;
			try {
				System.out.println(a+" / "+b+" 是 "+a/b);
			}
			catch (ArithmeticException e) {
				System.out.println("0不能为分母");
			}
			finally {
				System.out.println("我又出现了");
			}
		}
}
