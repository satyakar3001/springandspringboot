package com.sattu.myApp;

import org.springframework.stereotype.Component;

@Component
public class desktop implements Computer {

	@Override
	public void compile() {
		System.out.println("Compiled Desktop class");
	}
}
