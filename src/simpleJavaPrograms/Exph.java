package simpleJavaPrograms;

public class Exph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="rockstarr";
		
				try
				{
			System.out.println(name.charAt(10));
				}
				catch(StringIndexOutOfBoundsException e)
				{
					System.out.println(name.charAt(5));
				}

	}

}
