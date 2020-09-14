package com.test.java;

public class Calculator {
	//필드
	private int result;
	//생성자
	public Calculator(int value) {
		this.result = value;
	}
	//메소드  누적된 값 덧셈 합계
	public int add(int value) {
		return this.result += value;
	}
	//메소드 누적된 값 빼기  합계
	public int subtract(int value) {
		return this.result -= value;
	}
	//메소드 누적된 값 곱하기 
	public int multiply(int value) {
		return this.result *= value;
	}
	//메소드 누적된 값 나누기
	public int divide(int value) {
		return this.result /= value;
	}
	
	public int getResult() {
		return this.result;
	}
}
