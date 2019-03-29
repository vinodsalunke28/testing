package testing_webapp;

import java.util.ArrayList;
import java.util.Iterator;

public class array_last {
	public static void main(String arfs [])
	{
		ArrayList li=new ArrayList();
		
		li.add("B");
		li.add(90);
		li.add(29.8);
		li.add("fg");
		
		Iterator itr=li.iterator();
		
		while(itr.hasNext())
		{
			Object value=itr.next();
			System.out.println(value);
		}
		
	}

}
