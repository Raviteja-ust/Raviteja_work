package com.ust.collection;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<String>();
		l.add("Indu");
		l.add("RamaKanth");
		l.add("Harika");
		l.add("Ravi");
		l.add("sravani");
		l.add("siri");
		l.add("sai");
		l.add("Sharath");
		for (String str : l) {
			if (str. startsWith("s")||str. startsWith("S")) {
				System.out.println(str);
			}

		}

	}

}