package aa;
public class AA 
{
		public static void main(String args[])
		{
			int i=99;
			{
			for(i=99;i>0;i--)
			{if(i>2) 
				System.out.printf("%d bottlees of beer on the wall,%d bottles of beer.\n"
						+ "Take one down.\n"
						+ "Pass it around.\n"
						+ "%d bottles of beer on the wall.\n",i,i,i-1);
			}
			{if(i<=1)  
				System.out.println("1 bottle of beer on the wall,1 bottle of beer."
						+ "Take one down."
						+ "Pass it around."
						+ "0 bottle of beer on the wall.");
				}
			{if(i==0)
				System.out.println("No more bottles of beer on the wall");
			}
			}
		}
}
