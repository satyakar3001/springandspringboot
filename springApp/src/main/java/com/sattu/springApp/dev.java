package com.sattu.springApp;

public class dev {
	int age; 
	Computer laptop;
	
//	public dev(int age) {
//		this.age = age;
//	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	public dev(Computer laptop) {
		this.laptop = laptop;
		System.out.println("Constrector Called from Dev for lap");
		
	}
//	
//	public void setLaptop(Laptop lap) {
//		this.laptop = lap;
//	}
//	
//	public void getLaptop() {
//		laptop.laptopCompiler();
//	}	
	
	public void compile() {
		System.out.println("Compiled Dev");
	}
}
