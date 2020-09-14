package com.test.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCalculator {
	Calculator cal;
	
	@BeforeEach //각각의 @Test 메소드를 테스트를 하기전에 실행 초기값이 항상 같게 만든다 
	public void setUp() throws Exception{
		this.cal = new Calculator(10);
		System.out.println("BeforeEach : "+cal.getResult());
	}
	@Test
	public void testCal() { //@BeforeEach cal.result(10)
		Calculator cal = new Calculator(100);
		
	}
	@Test
	public void testAdd() { //@BeforeEach cal.result(10)
		assertEquals(20,cal.add(10));
		System.out.println("cal.add(10) : "+cal.getResult());
	}
	@Test
	public void testSubtract() { //@BeforeEach cal.result(10)
		assertEquals(0,cal.subtract(10));
		System.out.println("cal.subtract(10) : "+cal.getResult());
	}
	@Test
	public void testMultiply() {//@BeforeEach cal.result(10)
		assertEquals(100,cal.multiply(10));
	}
	@Test
	public void testDibide() {//@BeforeEach cal.result(10)
		assertEquals(1,cal.divide(10));
	}
	@Test
	public void testGetResult() {//@BeforeEach cal.result(10)
		assertEquals(10,cal.getResult());
	}

}
