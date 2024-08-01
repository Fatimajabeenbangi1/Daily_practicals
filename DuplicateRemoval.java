package com.practise.problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class DuplicateRemoval {

	public static void main(String[] args) {

		ArrayList list=new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(20);
		list.add(40);
		list.add(20);
		list.add(10);
		list.add(50);
		list.add(30);
		list.add(60);
		
		System.out.println(".............................");
		System.out.println("Before Duplicate Removal");
		System.out.println(list);
		
		LinkedHashSet hs=new LinkedHashSet(list);
		
		System.out.println(".............................");
		System.out.println("After Duplicate Removal");
		System.out.println(hs);
		
		System.out.println("Array List");
		ArrayList list2=new ArrayList(hs);
		System.out.println(list2);
	}

}
