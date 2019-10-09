package test;

public class Test {
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("请用户输入第一个复数的实部和虚部:");
        complex data1 = new complex();
        System.out.println("请用户输入第二个复数的实部和虚部:");
        complex data2 = new complex();
        
        complex result_add = data1.add(data2);
        complex result_sub = data1.sub(data2);
        complex result_mul = data1.mul(data2);
        complex result_div = data1.div(data2);
        
        result_add.print();
        result_sub.print();
        result_mul.print();
        result_div.print();
	}
}