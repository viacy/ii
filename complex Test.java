package test;

public class Test {
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("���û������һ��������ʵ�����鲿:");
        complex data1 = new complex();
        System.out.println("���û�����ڶ���������ʵ�����鲿:");
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