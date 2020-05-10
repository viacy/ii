package Com;

import java.util.ArrayList;

public class Plate extends MyElement
{
	private ArrayList list=new ArrayList();
	
	public void add(MyElement elment)
	{
		list.add(elment);
	}
	public void delete(MyElement elment)
	{
		list.remove(elment);
	}
	public void eat()
	{
		for(Object object:list)
		{
			((MyElement)object).eat();
		}
	}

}
