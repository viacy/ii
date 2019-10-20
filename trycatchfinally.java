package first;

public class test {
	public static void main(String args[])
	{
		String[]str= {"1"};
		try {
			System.out.println(str[3]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("数组越界");
		}
		finally {
			System.out.println("我出现了");
		}
	}
}
