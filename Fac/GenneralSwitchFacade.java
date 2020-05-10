package Fac;

public class GenneralSwitchFacade {
	private Light lights[]=new Light[4];
	private Fan fan;
	private AirConditioner ac;
	private Television tv;
	
	public GenneralSwitchFacade()
	{
		lights[0]=new Light("��ǰ");
		lights[1]=new Light("��ǰ");
		lights[2]=new Light("���");
		lights[3]=new Light("�Һ�");
		fan=new Fan();
		ac=new AirConditioner();
		tv=new Television();
	}
	
	public void on()
	{
		lights[0].on();
		lights[1].on();
		lights[2].on();
		lights[3].on();
		fan.on();
		ac.on();
		tv.on();
	}
}
