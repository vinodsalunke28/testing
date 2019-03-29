package testing_webapp;

import java.util.ArrayList;
import java.util.Iterator;

public class array {
	public static void main(String arga[])
	{
		ArrayList obj= new ArrayList();
		obj.add(78);
		obj.add('m');
		obj.add("vinod");
		
		Iterator itr=obj.iterator();
		
		while(itr.hasNext())
		{
			Object value=itr.next();
			System.out.println(value);
			
		}
	}

}
