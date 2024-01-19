package simplejava;

public class Samsulek extends Cbum {
	public void Choclateshake()
	{
		System.out.println("Beast");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Samsulek obj=new Samsulek();
		obj.Choclateshake();//calling his own method
		obj.olmpia();//calling child class
	
		obj.mrolymoia();//calling parent class
		

	}

}
