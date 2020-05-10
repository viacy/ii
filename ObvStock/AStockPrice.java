package ObvStock;

import java.util.ArrayList;
import java.util.List;

public abstract class AStockPrice {
	protected float price,price2;
	protected String code;
	protected List<IStockHolder>stockHolderlist;
	
	public void Add(IStockHolder Ish)
	{
		stockHolderlist.add(Ish);
	}
	public void remove(IStockHolder Ish)
	{
		stockHolderlist.remove(Ish);
	}
	public AStockPrice(String code)
	{
		this.code=code;
		price=price2=0;
		stockHolderlist=new ArrayList<IStockHolder>();
	}
	public float getPrice()
	{
		return price;
	}
	public void setPrice(float price)
	{
		this.price=price;
		notifyHolder();
	}
	abstract protected void notifyHolder();

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + Float.floatToIntBits(price);
		result = prime * result + Float.floatToIntBits(price2);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AStockPrice other = (AStockPrice) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
			return false;
		if (Float.floatToIntBits(price2) != Float.floatToIntBits(other.price2))
			return false;
		return true;
	}
	public float getPrice2()
	{
		return price2;
	}
	public void setPrice2(float price2)
	{
		this.price2=price2;
	}
}

