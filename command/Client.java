package command;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order order1=new Order();
		order1.setId(1);
		order1.setFruitmap("³È×Ó", 1);
		order1.setFruitmap("Àæ×Ó", 2);
		order1.setFruitmap("Æ»¹û", 3);
		
		Order order2=new Order();
		order2.setId(2);
		order2.setFruitmap("Ïã½¶", 4);
		order2.setFruitmap("ÆÏÌÑ", 2);
		order2.setFruitmap("èÖ×Ó", 3);
		
		Operator op=new Operator();
		OrderCommand cmd1=new OrderCommand(op,order1);
		OrderCommand cmd2=new OrderCommand(op,order2);
		
		WaitorInvoker waitor=new WaitorInvoker();
		waitor.SetCommand(cmd1);
		waitor.SetCommand(cmd2);
		
		waitor.OrderUp(); 
	}

}
