package simpleJavaPrograms;

import java.util.ArrayList;

public class Arlist5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> obj=new ArrayList<Integer>();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);
		obj.add(50);
		System.out.println(obj);
		System.out.println(obj.size());
		System.out.println(obj.get(0));
		obj.remove(0);
		System.out.println(obj);
		obj.add(10);
		System.out.println(obj);
		obj.add(0, 10);
		System.out.println(obj);
		obj.set(0, 11);
		System.out.println(obj);
		System.out.println(obj.contains(50));
		
		
		for(int i=0; i<obj.size(); i++)
		{
			System.out.println(obj.get(i));
		}
		

	}

}
