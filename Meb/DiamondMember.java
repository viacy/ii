package Meb;

public class DiamondMember extends Member {

	public DiamondMember(String name)
	{
		super(name);
	}
	@Override
	public void sendText(String to, String message) {
		// TODO Auto-generated method stub
		System.out.println("��ʯ��Ա������Ϣ��");
		chatroom.sendText(name,to,message);
	}

	@Override
	public void sendImage(String to,String image) {
		// TODO Auto-generated method stub
		System.out.println("��ʯ��Ա����ͼƬ��");
		chatroom.sendImage(name,to,image);
	}

}
