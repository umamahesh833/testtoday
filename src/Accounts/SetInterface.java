package Accounts;

import java.util.HashSet;
import java.util.Set;

public class SetInterface {

	public static void main(String[] args) {
		
		
		Set ObjSet = new HashSet();
		
		ObjSet.add("Water");
		ObjSet.add("Sodium metal");
		ObjSet.add("Helium");
		ObjSet.add("Lithium");
		ObjSet.add("Berilium");
		ObjSet.add("Boron");
		ObjSet.add("Carbon");
		ObjSet.add(12);
		ObjSet.add(true);
		ObjSet.add("Berilium");
		ObjSet.add("Helium");
		ObjSet.add("Sodium");
		
		
		System.out.println(ObjSet);
		
		
		ObjSet.remove("Boron");
		
		System.out.println(ObjSet);
		
		

	}

}
