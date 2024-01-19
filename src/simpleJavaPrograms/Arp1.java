package simpleJavaPrograms;

import java.util.Arrays;

public class Arp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[]= {"ash","the","and","but"};
				System.out.println(s.length);
				System.out.println(s[0]);
				System.out.println(Arrays.toString(s));
				s[1]="put";
				System.out.println(Arrays.toString(s));
				s[2]="what";
				System.out.println(Arrays.toString(s));
				for(int i=0; i<=3; i++)
				{
					System.out.println(s[i]);
				}
				for(int i=3; i>=0;i--)
				{
					System.out.println(s[i]);
				}
				for(String k:s)
				{
					System.out.println( k);
				}
		}

	

}
