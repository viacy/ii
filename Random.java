package aa;
public class Random
{
	public static void main(String[]args) 
	{
		String a ;String b;String c;
		{
		String[]doc= {"Rosy","Jack","Watson","White","Marry","Amy","Petter"};
		int index=(int)(Math.random()*doc.length);
		a=doc[index];
		}
		{
		String[]doc= {"wash","push","rush","hit","wear","pick","touch"};
		int index=(int)(Math.random()*doc.length);
		b=doc[index];
		}
		{
		String[]doc= {"bed","bottle","pen","phone","book","bag","shoes"};
		int index=(int)(Math.random()*doc.length);
		c=doc[index];
		}
		System.out.printf("%s,%s,%s",a,b,c);
	}
}