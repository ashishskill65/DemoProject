package simpleJavaPrograms;

import java.util.Arrays;

public class Arry4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer k[]= {12,23,21,24,24};
		{
			System.out.println(Arrays.toString(k));
			System.out.println(k.length);
			System.out.println(k[0]);
			k[0]=22;
			System.out.println(Arrays.toString(k));
			System.out.println(k[1]);
			for(int i=0;i<=3;i++)
			{
				System.out.println( k[i]);
			}
			for(Integer l:k)
			{
				System.out.println(l);
			}
			System.out.println(Arrays.toString(k));
			System.out.println(k[1]);
			k[0]=29;
			System.out.println(Arrays.toString(k));
		}
		

	}

}
