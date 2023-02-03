package org.userdefine;

import java.util.ArrayList;
import java.util.List;

public class DemoEx {

	public static void main(String[] args) {
		List<EmployeeSample> li=new ArrayList<EmployeeSample>();
		EmployeeSample e=new EmployeeSample(101, "Diya", 258369147);
		EmployeeSample e1=new EmployeeSample(102, "Sanju", 214563987);
		EmployeeSample e2=new EmployeeSample(103, "Thani", 89745621);
		
		li.add(e);
		li.add(e1);
		li.add(e2);
		
		for (EmployeeSample employeeSample : li) {
			System.out.println(employeeSample.getEmpid());
			System.out.println(employeeSample.getName());
			System.out.println(employeeSample.getPhone());
		}
		System.out.println("Hello world");
		System.out.println(li.get(0).getEmpid());
		System.out.println(li.get(0).getName());
		System.out.println(li.get(0).getPhone());
		System.out.println(li.get(0).getPhone());
		
		

	}

}
