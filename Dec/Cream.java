package Dec;

public class Cream extends Dec.Decorating {

    public void Show(){
        
    }

    public void PutCream(){
    	System.out.println("Add Cream...");
    }

    public Cream(IBirthdayCake birthdayCake){
    	super(birthdayCake);
    }

}
