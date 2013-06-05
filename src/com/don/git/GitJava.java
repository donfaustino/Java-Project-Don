package com.don.git;

import static org.junit.Assert.assertTrue;

import com.test.Main;

public class GitJava {
	public String printHelloWorld() {
		return "Hello World edited test";
		
	}
	public String printHelloWorld1() {
		return "Hello World edited test";
		
	}
	
	public void test() {
		Main differentHello = new Main();
		assertTrue("hello world".equals(differentHello.helloWorld()));
	}
	
}
