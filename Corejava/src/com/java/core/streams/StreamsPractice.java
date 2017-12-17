package com.java.core.streams;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class StreamsPractice {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);al.add(2);al.add(3);al.add(4);al.add(5);al.add(6);
		
		ArrayList<Integer> al1=(ArrayList<Integer>)al.stream().filter(i->i%2==0).collect(Collectors.toList());
		
		System.out.println(al+"\n"+al1);
	}
}
