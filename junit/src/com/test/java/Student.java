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
		 * 평균이 저장된 avg 필드 값이 90.0이상일 때 'A'
		 * 80.0이상 90.0미만일 때 'B'
		 * 70.0이상 90.0미만일 때 'C'
		 * 60.0이상 90.0미만일 때 'D'
		 * 60.0미만일 때 'F'으로 CHAR 타입으로 리턴
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
