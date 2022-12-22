package demoMaven;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
	
	ArrayList<String> al;
	
	@Test
	public void newTest() {
		al = new ArrayList<String>();
		
		al.add("Ankur");
		al.add("Ankur");
		al.add("Sankar");
		al.add("Suman");
	 
		Set<String> hs = new HashSet<String>(al);

		
		Assert.assertEquals(hs.size(), al.size(),"Error on comparing size");
		//Assert.as
		
			
	}
	
	
	
	
	

}
