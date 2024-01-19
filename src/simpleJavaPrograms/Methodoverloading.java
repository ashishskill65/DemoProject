package simpleJavaPrograms;

public class Methodoverloading {
	
	public void add()
	{
		System.out.println("no arg method");
	}
	public void add(int x)
	{
		System.out.println("int arg method");
	}
	public void add(String s)
	{
		System.out.println("String arg method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Methodoverloading M=new Methodoverloading();
				M.add();
				M.add(10);
				M.add("hello");

	}

}
