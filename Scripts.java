package pom_framework;

import pom_framework.Functions;
import static org.testng.Assert.assertTrue;




public class Scripts {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Functions ff = new Functions();
		
		
		
		ff.openapplication();
		
		ff.mouseover();
		ff.dropdown();
		ff.checkbox();
		ff.excel();  
		ff.excelwrite();
	
		
		
	}

}
