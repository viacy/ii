package ObvStock;

import java.util.ArrayList;
import java.util.List;

public class BuyHolder implements IStockHolder {

	private List<AStockPrice>attentionlist;
	private String name;
	public BuyHolder(String name)
	{
		attentionlist=new ArrayList<AStockPrice>();
		this.name=name;
	}
	public void AddHolder(AStockPrice asp)
	{
		attentionlist.add(asp);
		asp.Add(this);
	}
	@Override
	public void update(AStockPrice asp) {
		// TODO Auto-generated method stub
		if(attentionlist.contains(asp))
		{
			System.out.println(name);
			
			if(asp.getPrice()-asp.getPrice2()>0)
			{
				System.out.print(asp.code+"");
				System.out.println("原价:"+asp.price2+"-现价：");
				System.out.println("涨了！好");
			}
			else
			{
				System.out.print(asp.code+"");
				System.out.println("原价:"+asp.price2+"-现价：");
				System.out.println("跌了！哭");
			}
		}
	}
}
