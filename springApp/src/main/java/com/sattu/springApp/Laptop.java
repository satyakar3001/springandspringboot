package com.sattu.springApp;

public class Laptop implements Computer {
	public void laptopCompiler() {
		System.out.println("Compiling from Laptop");
	}
	
	public Laptop() {
		System.out.println("Constructor :: Compiling from Laptop");
	}
	
	
}
