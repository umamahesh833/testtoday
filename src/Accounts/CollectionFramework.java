package Accounts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class CollectionFramework {

	public static void main(String[] args) {
		
		//Create a list object
		
		List ObjLi = new ArrayList();
		
		ObjLi.add("Automation");
		ObjLi.add("Selenium");
		ObjLi.add("ManualTesting");
		ObjLi.add("APItesting");
		ObjLi.add("DataBaseTesting");
		ObjLi.add("ETLTesting");
		ObjLi.add(234);
		ObjLi.add(true);
		ObjLi.add("ManualTesting");
		
		
		ObjLi.contains("Selenium");
		
		System.out.println(ObjLi);
		System.out.println("No of values present in List object is - "+ObjLi.size());
		
		for(int i=0; i<ObjLi.size();i++) {
			
			System.out.println(ObjLi.get(i));
			
		}
		
		
		ObjLi.remove("ETLTesting");
		System.out.println(ObjLi);

	}

}
