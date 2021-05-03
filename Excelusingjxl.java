package harsha;


import java.io.FileInputStream;

import jxl.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import org.apache.poi.xssf.usermodel.XSSFCell;

import org.apache.poi.xssf.usermodel.XSSFRow;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;




public class Excelusingjxl {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		FileInputStream f = new FileInputStream("C:\\Users\\HarshaVardhanGanguru\\Downloads\\Book 2.xlsx");
		XSSFWorkbook w = new XSSFWorkbook(f);
		XSSFSheet s= w.getSheet("Sheet1");
		System.out.println(s.getSheetName());
		
		
		XSSFCell cell = s.getRow(3).getCell(2);
		cell.setCellValue("VIPER");
		f.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
