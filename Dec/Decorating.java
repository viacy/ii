package Dec;

public class Decorating implements Dec.IBirthdayCake {
	
	private IBirthdayCake birthdayCake;
    public Decorating(IBirthdayCake birthdayCake){
    	this.birthdayCake=birthdayCake;
    }

    public void Show(){
        birthdayCake.Show();
        }

}
