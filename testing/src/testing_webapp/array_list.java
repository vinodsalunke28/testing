package testing_webapp;

import java.util.ArrayList;
import java.util.Iterator;

public class array_list {
	
	public static void main(String args[])
	{
		ArrayList ob=new ArrayList();
		
		ob.add("vinod");
		ob.add("kashinath");
		ob.add("salunke");
		
		Iterator itr=ob.iterator();
		
		while(itr.hasNext())
		{
			Object value=itr.next();
			
			System.out.println(value);
		}
	}

}
