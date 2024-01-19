package simpleJavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class Arlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> obj=new ArrayList<Integer>();
		
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);
		obj.add(30);
		System.out.println(obj);
		System.out.println(obj.size()); //to calculate length
		System.out.println(obj.get(1));//to get the specific element
		System.out.println(obj.remove(0));//to remove the element
	
		System.out.println(obj);
		obj.add(10);//normal add we will get the value in the last
		System.out.println(obj);
		obj.add(0, 10);//we can have the added value as per our requirement
		System.out.println(obj);
		obj.set(1, 29);
		System.out.println(obj);
		
		
		

	}

}
