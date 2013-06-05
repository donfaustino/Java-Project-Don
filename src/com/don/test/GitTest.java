package com.don.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.don.git.GitJava;

public class GitTest {

	@Test
	public void test() {
		GitJava gitJava = new GitJava();
		String message = gitJava.printHelloWorld();
		System.out.println(message);
		assertEquals("Hello World",message);
	}

}
