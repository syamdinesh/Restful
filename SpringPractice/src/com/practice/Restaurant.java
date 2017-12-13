package com.practice;


public class Restaurant {
	
	private static String ename;
	
	public static void setName(String ename){
		Restaurant.ename=ename;
	}
	public void man(){
		System.out.println(ename+" from Restaurant class");
	}
}
