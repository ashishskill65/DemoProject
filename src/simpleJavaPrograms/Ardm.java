package simpleJavaPrograms;

import java.util.Arrays;

public class Ardm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[]= {"ashish","assf","asas"};
		System.out.println(a.length);
		System.out.println(a[0]);
		System.out.println(Arrays.toString(a));
		a[0]="jojo";
		System.out.println(Arrays.toString(a));
		for(int i=0;i<3;i++)
		{
			System.out.println(a[i]);
		}

	}

}
