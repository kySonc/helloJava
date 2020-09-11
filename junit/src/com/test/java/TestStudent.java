package com.test.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TestStudent {

	@Test
	void test() {
		//fail("Not yet implemented");
	}
	@Test
	void test1() {//객체에 저장된 이름이 일치되는지 테스트
		                       //(이름,국어성적,영어성적,수학성적);
		Student std = new Student("일길동",100,100,100);
		
		assertEquals("일길동",std.name); //assertEquals(예상값, 실제값)
	}
	@Test
	void test2() {//객체에 저장된 국어 성적이 일치되는지 테스트
		Student std = new Student("이길동",79,60,50);
		
		assertEquals(79,std.kor); //assertEquals(예상값, 실제값)
	}
	@Test
	void test3() {//객체에 저장된 영어 성적이 일치되는지 테스트
		Student std = new Student("이길동",79,60,50);
		
		assertEquals(60,std.eng); //assertEquals(예상값, 실제값)
	}
	@Test
	void test4() {//객체에 저장된 수학 성적이 일치되는지 테스트
		Student std = new Student("이길동",79,60,50);
		
		assertEquals(50,std.mat); //assertEquals(예상값, 실제값)
	}
	@Test
	void test5() {//국어,영어,수학성적의 합계(sum)가 정확하게 계산되었는지 테스트
		Student std = new Student("이길동",79,60,50);
		
		assertEquals(189,std.sum()); //assertEquals(예상값, 실제값)
	}
	@Test
	void test6() {//국어,영어,수학성적의 합계(sum)에 대한 평균(avg)가 정확하게 계산되었는지 테스트
		Student std = new Student("이길동",79,60,50);
		
		assertEquals(63,std.avg()); //assertEquals(예상값, 실제값)
	}
}
