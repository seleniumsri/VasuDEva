package com.vasu.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingTest 
{

	public static void main(String[] args) throws IOException
	{
		File srcFile=new File("C:\\Users\\vasu\\Desktop\\Sample.xlsx");
		
		FileInputStream fis=new FileInputStream(srcFile);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		//Reading single set of data
		/*String data1=ws.getRow(0).getCell(0).getStringCellValue();
		
		String data2=ws.getRow(0).getCell(1).getStringCellValue();
		
		System.out.println(data1+"------"+data2);*/
		
		//reading multiple set of data
		//row count
		
		int rcnt=ws.getLastRowNum();
		
		for (int i = 1; i <=rcnt; i++)
		{
			String data1=ws.getRow(i).getCell(0).getStringCellValue();
			
			String data2=ws.getRow(i).getCell(1).getStringCellValue();
			
			System.out.println(data1+"------"+data2);
		}

	}

}
