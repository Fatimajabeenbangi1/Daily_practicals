package com.list.arraylist;

import java.util.ArrayList;

public class Demo1 {

	public static void main(String[] args) {
     ArrayList list = new ArrayList();
     list.add(10);
     list.add(20);
     list.add(30);
     list.add(40);
     list.add(10);
     list.add("A");
     list.add("b");
     list.add(null);
     
     System.out.println(list);
     System.out.println(list.get(5));
     System.out.println(list.remove(4));
     System.out.println(list);
     System.out.println(list.indexOf(10));
     System.out.println(list.lastIndexOf("b"));
	}

}
