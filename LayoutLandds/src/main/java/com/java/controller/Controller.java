package com.java.controller;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.java.dao.Dao;
import com.java.model_entity.Employee;
import com.java.service.GetExcelData;


@org.springframework.stereotype.Controller
public class Controller {
	@RequestMapping("AdminL")
	public String Initialprocessing(@RequestParam("adminUserName") String name,@RequestParam("adminPassword") String pass){
		System.out.println("hello");
		return "welcome/updloadedExcelSheet";
	}
	
	@RequestMapping(value="uploadFileToController", method=RequestMethod.POST)
	public String InsertExcelData(@RequestParam("excelFile") MultipartFile file){
		
		try {
			
			byte[] ExcelSheetbyte=file.getBytes();
			
			ByteArrayInputStream convertByteArrayToStream=new ByteArrayInputStream(ExcelSheetbyte);
			
			/*ModelAndView model=new ModelAndView();
			model.addObject("excelStreamDataIntoModelObject", convertByteArrayToStream);*/
			
			//For getting the data from excel sheet, so calling the service layer
			GetExcelData excelDataList=new GetExcelData();
			LinkedList<Employee> listOfExcelData= excelDataList.gettingDataFromExcelSheet(convertByteArrayToStream);
			
			//for saving the excel data into DB for that calling dao class
			Dao insertExcelData=new Dao();
			insertExcelData.insertExcelData(listOfExcelData);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "welcome/updloadedExcelSheet";
		
	}
	
	@RequestMapping("/home")	
	public String listingTheDataFromDb(Model model){
		
		Dao dao=new Dao();
		List<Employee> listOfRecordsFromDB=dao.gettingDetails();
		
		model.addAttribute("listofRecordsAttribute", listOfRecordsFromDB);
		
		return "welcome/ListOfAllRecordsFromDB";
	}
	/*@RequestMapping("requestingForLogin") 
	public String controllingForAdminLogin(){
		Dao dao=new Dao();
		
	}*/
}
