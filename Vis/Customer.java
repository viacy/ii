package Vis;

public class Customer extends AVisitor {
	public void visit(Apple apple)
	{
		System.out.println("�˿�"+name+"ѡƻ��");
	}
	
	public void visit(Book book)
	{
		System.out.println("�˿�"+name+"����");
	}
}
