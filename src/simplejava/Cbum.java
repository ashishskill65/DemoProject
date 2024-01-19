package simplejava;

public class Cbum extends Ronicoleman {//child class

	public void olmpia()
	{
		System.out.println("heavy weight babe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cbum obj=new Cbum();//object created
		obj.olmpia();//obj reference helps to call the method//it is calling his own(child class) method above
		obj.mrolymoia();////this will call the parent class method
	}

}
