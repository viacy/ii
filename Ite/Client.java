package Ite;

public class Client {

	public static void display(Television tv) 
	{
		// TODO Auto-generated method stub
		TVIterator i=tv.createIterator();
		System.out.println("电视机频道：");
		while(!i.isLast())
		{
			System.out.println(i.currentChannel());
			i.next();
		}
	}

}
