package com.practise.problems;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {

		Employee employee1=new Employee();
		employee1.setId(101);
		employee1.setName("Gayatri");
		employee1.setSalary(30000);
		
		Employee employee2=new Employee(202,"Rakshita",40000);
		Employee employee3=new Employee(202,"Aiman",50000);
		
		Student student1=new Student(111, "Roshan", 70);
		Student student2=new Student(222, "Sujeet", 80);
		
		
		ArrayList list=new ArrayList();
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		list.add(student1);
		list.add(student2);
		
		
	   Iterator itr=list.iterator();
	   while(itr.hasNext())
	   {
		   Object ob=itr.next();
		   if(ob.getClass()==Student.class)
		   {
			   System.out.println(ob);
		   }
	   }
		
		
		
		
		
		
	}

}
