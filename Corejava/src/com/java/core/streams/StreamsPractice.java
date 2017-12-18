package com.java.core.streams;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamsPractice {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);al.add(2);al.add(3);al.add(4);al.add(5);al.add(6);
		
		ArrayList<Integer> al1=(ArrayList<Integer>)al.stream().filter(i->i%2==0).collect(Collectors.toList());
		
		System.out.println(al+"\n"+al1);
		List<staff> li=Arrays.asList(new staff("Syam", 24,new BigDecimal(8000)),new staff("Dinesh", 24, new BigDecimal(9000)),new staff("SD", 24, new BigDecimal(10000)));
		List<String> al2=li.stream().map(i->i.getName()).collect(Collectors.toList());
		
		System.out.println(al2);
	}
}

class staff{
	private String name;
	private int age;
	private BigDecimal salary;

	public staff(String name, int age, BigDecimal salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
}
