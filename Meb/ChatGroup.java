package Meb;

import java.util.Hashtable;

public class ChatGroup extends AbstractChatroom 
{
	private Hashtable members=new Hashtable();
	
	public void register(Member member)
	{
		if(!members.contains(member))
		{
			members.put(member.getName(),member);
			member.setChatroom(this);
		}
	}
	@Override
	public void sendText(String from, String to,String message) {
		// TODO Auto-generated method stub
		Member member=(Member)members.get(to);
		String newMessage=message;
		newMessage=message.replaceAll("´ò", "*");
		member.reciveText(from, newMessage);
	}

	@Override
	public void sendImage(String from, String to,String image) {
		// TODO Auto-generated method stub
		Member member=(Member)members.get(to);
		if(image.length()>5)
		{
			System.out.println("Í¼Æ¬Ì«´ó£¬·¢ËÍÊ§°Ü£¡");
		}
		else
		{
			member.reciveImage(from, image);
		}
	}

}
