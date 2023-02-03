package org.userdefine;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DefineExample {

	public static void main(String[] args) {
		List<EmployeeSample> li= new ArrayList<EmployeeSample>();
		EmployeeSample e1=new EmployeeSample(001, "Diya", 1234125689);
		EmployeeSample e2=new EmployeeSample(002, "sanju", 125489632);
		EmployeeSample e3=new EmployeeSample(003, "dhanya", 125896345);
		li.add(e1);
		li.add(e2);
		li.add(e3);
		System.out.println("********User defined List Examples********");
		System.out.println("********Employee 1 details *********");
		System.out.println(li.get(0).getEmpid());
		System.out.println(li.get(0).getName());
		System.out.println(li.get(0).getPhone());
		System.out.println("********Employee 2 details *********");
		System.out.println(li.get(1).getEmpid());
		System.out.println(li.get(1).getName());
		System.out.println(li.get(1).getPhone());
		System.out.println("********Employee 3 details *********");
		System.out.println(li.get(2).getEmpid());
		System.out.println(li.get(2).getName());
		System.out.println(li.get(2).getPhone());
		
		System.out.println("***********For each**********");
		
		for (EmployeeSample employeeSample : li) {
			
			System.out.println(employeeSample.getEmpid());
			System.out.println(employeeSample.getName());
			System.out.println(employeeSample.getPhone());
			
		}
		
		System.out.println("Userdefined SET example");
		
		Set<EmployeeSample> se=new LinkedHashSet<>();
		
		EmployeeSample se1=new EmployeeSample(004, "Nathiya", 1234125689);
		EmployeeSample se2=new EmployeeSample(005, "Thaniga", 125489632);
		EmployeeSample se3=new EmployeeSample(006, "Diya", 125896345);
		se.add(se1);
		se.add(se2);
		se.add(se3);
		
		System.out.println("****print all values");
		for (EmployeeSample employeeSample : se) {
			System.out.println(employeeSample.getEmpid());
			System.out.println(employeeSample.getName());
			System.out.println(employeeSample.getPhone());
			
		}
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
		System.out.println("Hi thanigasalam");
		System.out.println("******user defined AMP examples************");
		
		Map<Integer, EmployeeSample> m=new LinkedHashMap<Integer, EmployeeSample>();
		EmployeeSample m1=new EmployeeSample(10, "xxx", 124578963);
		EmployeeSample m2=new EmployeeSample(11, "yyy", 752845666);
		EmployeeSample m3=new EmployeeSample(10, "xxx", 457821585);
		System.out.println("Hello world");
		m.put(1, m1);
		m.put(2, m2);
		m.put(3, m3);
		
		//System.out.println("Print  MAP entry values");
		Set<Entry<Integer, EmployeeSample>> entrySet = m.entrySet();
		for (Entry<Integer, EmployeeSample> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue().getEmpid());
			System.out.println(entry.getValue().getName());
			System.out.println(entry.getValue().getPhone());
		}
		

	}

}
