package com.test.java;

public class Calculator {
	//�ʵ�
	private int result;
	//������
	public Calculator(int value) {
		this.result = value;
	}
	//�޼ҵ�  ������ �� ���� �հ�
	public int add(int value) {
		return this.result += value;
	}
	//�޼ҵ� ������ �� ����  �հ�
	public int subtract(int value) {
		return this.result -= value;
	}
	//�޼ҵ� ������ �� ���ϱ� 
	public int multiply(int value) {
		return this.result *= value;
	}
	//�޼ҵ� ������ �� ������
	public int divide(int value) {
		return this.result /= value;
	}
	
	public int getResult() {
		return this.result;
	}
}
