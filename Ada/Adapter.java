package Ada;

import pro.MyFruit;

public class Adapter implements INewJuicer {

	private OldJuicer oldJuicer;
    public String newPort(MyFruit fruit1, MyFruit fruit2){
    	oldJuicer=new OldJuicer();
    	String str="»ìºÏ¹ûÖ­"+oldJuicer.oldPort(fruit1);
    	str+=oldJuicer.oldPort(fruit2);
        return str;
    }

}
