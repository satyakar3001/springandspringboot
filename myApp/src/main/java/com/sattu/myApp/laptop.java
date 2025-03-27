package com.sattu.myApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class laptop implements Computer {

	@Override
	public void compile() {
		System.out.println("Compiled Laptop class");
	}
}
