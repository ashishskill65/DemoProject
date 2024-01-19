package simpleJavaPrograms;

import java.util.ArrayList;

public class Arlist3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> obj=new ArrayList<String>();
		obj.add("by");
		obj.add("so");
		obj.add("do");
		obj.add("No");
		System.out.println(obj);//help to print all the values in console
		System.out.println(obj.size());//helps to calculate the length of array
		System.out.println(obj.get(0));//helps to get the specific value
		System.out.println(obj.remove(0));//remove the specific element
		System.out.println(obj);//remove the specific element
		obj.add(0, "by");//it add the element at specific place as per index
		System.out.println(obj);
		obj.set(1, "No");//helps in replace a element with the specific element
		System.out.println(obj);
		System.out.println(obj.contains("you"));//it check whether the specific element present in the array or not 
		obj.clear();//it removes all the elements from the array.
		System.out.println(obj);
		

	}

}
