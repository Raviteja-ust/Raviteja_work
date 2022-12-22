package com.ust.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class SupplierExample {

	public static void main(String[] args) {
		
		ArrayList<String>list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		
		//Supplier<String> collect = (Supplier<String>) list.stream().collect(ArrayList::new, ArrayList::add,
             //   ArrayList::addAll)
		//collect.get();
		
		//List<String> collect2 = list.stream().collect(Collectors.toList());
       //  collect2.forEach(a->System.out.println(a));
         
         Supplier<List<String>> supplier= ()-> list.stream().collect(Collectors.toList());
         System.out.println(supplier.get());
         
	}

}
