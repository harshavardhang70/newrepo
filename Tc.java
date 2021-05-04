package utility;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

public class Tc {

	//public static void main(String[] args) {
	
	// TODO Auto-generated method stub

	
	@Test
	public void tc1() throws Exception {
	
	DOMConfigurator.configure("log4j.xml");
	General o = new General();
	o.openapplication();
	o.mouseover();
	o.dropdown();
	o.checkbox();
	
	
	
}
	
	
	
	
	
	
	
	//}

}
