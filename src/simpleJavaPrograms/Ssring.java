package simpleJavaPrograms;

public class Ssring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="    Mankuu kitu";
		String name1="ladu";
		String name2="mankuu kitu";
				
				System.out.println(name.length());
System.out.println(name.charAt(3));
System.out.println(name.concat( name1));
System.out.println(name.concat(" ladu "));
System.out.println(name.equals(name2));
System.out.println(name.equalsIgnoreCase(name2));
System.out.println(name.substring(2));
System.out.println(name.substring(1, 5));
System.out.println(name.startsWith("M"));
System.out.println(name.endsWith("u"));
System.out.println(name.trim());
System.out.println(name.replace('M', 'd'));
System.out.println(name1.charAt(1));
System.out.println(name1.substring(1));
	}

}
