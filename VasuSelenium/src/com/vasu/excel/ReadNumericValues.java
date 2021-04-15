package com.vasu.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadNumericValues 
{

	public static void main(String[] args) throws IOException
	{
		
 File srcFile=new File("C:\\Users\\vasu\\Desktop\\Sample.xlsx");
		
		FileInputStream fis=new FileInputStream(srcFile);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		int rcnt=ws.getLastRowNum();
		
		for (int i = 0; i <=rcnt; i++) 
		{
			String celldata="";
			
			if(ws.getRow(i).getCell(0).getCellType()==CellType.NUMERIC)
			{
				int data=(int)ws.getRow(i).getCell(0).getNumericCellValue();
				
				celldata=String.valueOf(data);
			}else
			{
				celldata=ws.getRow(i).getCell(0).getStringCellValue();
			}
			
			System.out.println(celldata);
		}
	}

}
