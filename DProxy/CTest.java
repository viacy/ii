package DProxy;

public class CTest implements ITestInterface {

	@Override
	public void SendMessage(String mes) {
		// TODO Auto-generated method stub
		for(int i=5;i>=0;i--)
		{
			System.out.println(mes+"����ĳ��ֻ���"+i+"��");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(mes+"���������");
	}

}
