package Meb;

public class CommonMember extends Member {

	public CommonMember(String name)
	{
		super(name);
	}
	@Override
	public void sendText(String to,String message) {
		// TODO Auto-generated method stub
		System.out.println("��ͨ��Ա������Ϣ��");
		chatroom.sendText(name, to, message);
	}

	@Override
	public void sendImage(String to,String image) {
		// TODO Auto-generated method stub
		System.out.println("��ͨ��Ա���ܷ���ͼƬ��");
	}

}
