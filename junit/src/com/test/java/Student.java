package com.test.java;

public class Student {
	String name;
	int kor;
	int eng;
	int mat;
	int sum;
	double avg;
	char grade;
	
	public Student() {
		
	}
	
	public Student(String name, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		
	}
	
	public int sum() {
		sum = kor + eng + mat;
		return sum;
	}
	
	public double avg() {
		double avg = sum() /3.0f;
		return avg;
	}
		
	public char grade() {
		char grade='F';
		/*
		 * ����� ����� avg �ʵ� ���� 90.0�̻��� �� 'A'
		 * 80.0�̻� 90.0�̸��� �� 'B'
		 * 70.0�̻� 90.0�̸��� �� 'C'
		 * 60.0�̻� 90.0�̸��� �� 'D'
		 * 60.0�̸��� �� 'F'���� CHAR Ÿ������ ����
		 * 
		 */
		
		switch((int)avg/10){ 
        case  10: 
        case   9: 
        		  grade = 'A';
                  break;
        case   8: 
                  grade = 'B'; 
                  break;
        case   7: grade = 'C'; 
        		  break;
        case   6: grade = 'D';
        		  break;
        default:  grade = 'F';
        }
		
		return grade;
	}
}
