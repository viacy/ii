package first;

public class testtwo {
	public static void main(String args[]) {
		int a = 4;
		int b = 0;
			try {
				System.out.println(a+" / "+b+" �� "+a/b);
			}
			catch (ArithmeticException e) {
				System.out.println("0����Ϊ��ĸ");
			}
			finally {
				System.out.println("���ֳ�����");
			}
		}
}
