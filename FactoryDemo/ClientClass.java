package FactoryDemo;

import pro.MyFruit;
import pro.MyFruitStore;
import Ada.Adapter;
import Ada.INewJuicer;
import Dec.Cream;
import Dec.IBirthdayCake;
import pro.Apple;
import pro.Banana;

public class ClientClass {
	public static void main(String[] args) {
		//Factory factory=new BFactory();
		//Factory factor=(Factory)XMLUtil.getBean();
		//Fruit fruit=factor.CreateFruit();
		//Fruit fruit=factory.CreateFruit("B");
		//fruit.eat();
		
		/*MyFruit fru1=new Apple();
		MyFruit fru2=(Apple)fru1.clone();
		fru1.Display();
		fru2.Display();
		System.out.println("fru1:"+fru1.hashCode());
		System.out.println("fru2:"+fru2.hashCode());
		System.out.println("fru1:"+fru1.toString());
		System.out.println("fru2:"+fru2.toString());
		System.out.println(fru1==fru2);*/
		
		/*MyFruit fru1=new Apple();
		MyFruit fru2=new Banana();
		MyFruitStore.Add(1,fru1);
		MyFruitStore.Add(2,fru1);
		MyFruitStore.Add(3,new Apple());
		MyFruitStore.Add(4,new Banana());
		
		MyFruit fru=(MyFruit)MyFruitStore.Get(3);
		fru.Display();*/
		
		MyFruit fru1=new Apple();
		MyFruit fru2=new Banana();
		MyFruitStore mfs1=MyFruitStore.Getfruitstore();
		mfs1.Add(1, fru1);
		mfs1.Add(2, fru1);
		mfs1.Add(3, new Apple());
		mfs1.Add(4, new Banana());
		MyFruitStore mfs2=MyFruitStore.Getfruitstore();
		INewJuicer newJuicer=new Adapter();
		System.out.println(newJuicer.newPort(mfs1.Get(3), mfs1.Get(4)));
		
		//MyFruit fru=(MyFruit)mfs1.Get(3);
		//fru.Display();
		//System.out.println("mfs1:"+mfs1.toString());
		//System.out.println("mfs2:"+mfs2.toString());
		
		
	}
	public String factoty(String fruitname)
	{
		if(fruitname.contentEquals("Apple"))
			return  "Apple";
		if(fruitname.contentEquals("Banana"))
			return "Banana";
		return null;
	}
}
