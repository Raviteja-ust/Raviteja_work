package com.ust.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;


public class HashMapExample {

	public static void main(String[] args) {
	
		/*
		 * Map<Integer,String> map=new HashMap<Integer,String>(); Employee e1=new
		 * Employee("Ravi"); Employee e2=new Employee("Teja"); Employee e3=new
		 * Employee("Sri"); map.put(101, "Ravi"); map.put(102, "Teja"); map.put(103,
		 * "Sri");
		 * 
		// * map.entrySet().stream().filter(f->f.getValue().toUpperCase().startsWith("S").
		 * collect(Collectors.toMap(map.getValue())));
		 * 
		 * for(Map.Entry<Integer,Employee> m : map.entrySet()){ int key=m.getKey();
		 * Employee e=m.getValue(); if(e.name.startsWith("S"))
		 * System.out.println(key+" "+m.getValue()); }
		 * 
		 */
		Map<Integer, String> hmap = new HashMap<Integer, String>();
	      hmap.put(11, "Apple");
	      hmap.put(22, "Orange");
	      hmap.put(33, "Kiwi");
	      hmap.put(44, "Banana");

	      Map<Integer, String> result = hmap.entrySet()
	      .stream()
	      .filter(map -> map.getValue().startsWith("O"))
	      .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));

	      System.out.println("Result: " + result);
		

	}

}
