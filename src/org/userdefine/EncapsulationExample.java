package org.userdefine;

public class EncapsulationExample {
	
	
	private String name;
	
		
	public String getName() {
		return "emp name is:"+name;
	}
	public void setName(String name) {
		if(name.startsWith("n")) {
			this.name = name;	
		}
		else {
			System.out.println("Please chech the name you entered");
		}
	}
	
	public static void main(String[] args) {
		EncapsulationExample e=new EncapsulationExample();
		e.setName("nathiya");
		System.out.println(e.getName());
		EncapsulationExample e1=new EncapsulationExample();
		e1.setName("Thanigasalam");
		System.out.println(e1.getName());
		
	}
	 

}
