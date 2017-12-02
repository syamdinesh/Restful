package com.java.service;

import java.io.ByteArrayInputStream;
import java.util.Iterator;
import java.util.LinkedList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.java.model_entity.Employee;

/**
 * @author syam
 *
 */
public class GetExcelData {
	
	LinkedList<Employee> addExcelDataToList=new LinkedList<Employee>();

	public LinkedList<Employee> gettingDataFromExcelSheet(ByteArrayInputStream byteArray){
		// TODO Auto-generated method stub
		try{
		   
			//Get the work instance for XLSX file
			XSSFWorkbook workbook=new XSSFWorkbook(byteArray);
			
			//Get first sheet from the workbook
			XSSFSheet sheet =workbook.getSheetAt(0);
			
			//Get iterator to all the rows in current sheet
			Iterator<Row> rowIterator =sheet.iterator();
			
			/*int a=10,b=0;
	    	System.out.println(a/b);*/
			
			while(rowIterator.hasNext()){
				
				Row row=rowIterator.next();
				int i=0,j=0;
				
				//For each row,iterate through each columns
				Iterator<Cell> cellIterator =row.cellIterator();
				Employee empObject=new Employee();
				
				while(cellIterator.hasNext()){
					
					Cell cell=cellIterator.next();
					
					switch(cell.getCellType()){
					
					/*case Cell.CELL_TYPE_BOOLEAN: System.out.println(cell.getBooleanCellValue());
					break;*/
					
					case Cell.CELL_TYPE_NUMERIC:
					        if(i==0){
					        	empObject.seteNo((int)(cell.getNumericCellValue()));
					        	++i;
					        }	
					        else if(i==1){
					        	empObject.seteMobileNo((long)(cell.getNumericCellValue()));
					        	++i;
					        }
					        else{
					        	empObject.seteSal((int)(cell.getNumericCellValue()));
					        }
					        
					break;
					case Cell.CELL_TYPE_STRING:
					        if(j==0){
					        	empObject.seteName((cell.getStringCellValue()));
					        	++j;
					        }
					        else{
					        	empObject.setEmail(cell.getStringCellValue());
					        }
					break;
					}
				}
				if(i!=0)
					addExcelDataToList.add(empObject);
			}
			
			//file.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println(addExcelDataToList);
		return addExcelDataToList;
	}
}