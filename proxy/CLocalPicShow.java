package proxy;

public class CLocalPicShow implements IShowPic, Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		pic.ShowPic(picname);
		System.out.println(picname+"ͼƬ�������");
	}
	
	private IShowPic pic;
	private String picname;
	@Override
	public void ShowPic(String picname) {
		// TODO Auto-generated method stub
		pic=new CRemoPic();
		this.picname=picname;
		System.out.println("׼������ͼƬ"+picname);
		Thread th=new Thread(this);
		th.start();
	}

}
