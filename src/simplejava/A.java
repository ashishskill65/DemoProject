package simplejava;

import java.util.HashSet;

public class A {

	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<Integer>();
				hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		hs.add(50);
		System.out.println(hs);
		hs.remove(20);
		System.out.println(hs);
		System.out.println(hs.contains(50));
		System.out.println(hs.size());
		for(Integer j:hs)
		{
			System.out.println(j);
		}

	}

}
