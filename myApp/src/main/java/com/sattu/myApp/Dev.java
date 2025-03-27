package com.sattu.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Dev {
	
//	@Autowired -- Feild Injection
//	private laptop lap;
	
//	@Autowired -- Setter Injection
//	private laptop lap;
//	public void setBuilder(laptop Lapi) {
//		this.lap = Lapi;
//	}
	
	@Autowired
	@Qualifier("desktop")
	private Computer lap;
	public Dev(Computer lap) {
		this.lap = lap;
	}
	
	
	public void build() {
		System.out.println("Hello World !"); 
		lap.compile();
		return ;
	}
}
