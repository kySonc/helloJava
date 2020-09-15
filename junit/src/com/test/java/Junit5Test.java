package com.test.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Junit5Test {
	@BeforeEach // Test를 실행 전에 실행
	public void setup() {
		System.out.println("@Before");
	}
	
	@AfterEach // Test를 실행 한 이후에 실행
	public void setFinal() {
		System.out.println("@AfterEach");
	}
	
	@Test
	void testCase1() {
		String st1 = "이순신";
		String st2 = "홍길동";
		//assertSame(object1,object2);
		assertSame(st1,st2);
		System.out.println("TestCase1");
		
	}
	
	@Test
	void testCase2() {
		System.out.println("TestCase2");
	}

}
