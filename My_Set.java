package com.practise.problems;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class MyComparator implements Comparator
{

	@Override
	public int compare(Object obj1, Object obj2) {
		
		Employee emp1=(Employee)obj1;
		Employee emp2=(Employee)obj2;
		
		String s1=emp1.getName();
		String s2=emp2.getName();
		return s2.compareTo(s1);
	}
	
}
public class My_Set {

	public static void main(String[] args) {

		Employee employee1=new Employee();
		employee1.setId(101);
		employee1.setName("Gayatri");
		employee1.setSalary(50000);
		
		Employee employee2=new Employee(202,"Rakshita",40000);
		Employee employee3=new Employee(303,"Aiman",30000);
		
		Student student1=new Student(111, "Roshan", 70);
		Student student2=new Student(222, "Sujeet", 80);
		
		TreeSet ts=new TreeSet(new MyComparator());
		ts.add(employee1);
		ts.add(employee2);
		ts.add(employee3);
		
		Iterator itr=ts.iterator();
		while(itr.hasNext())
		{
			Object obj=itr.next();
			System.out.println(obj);
		}
	}

}
