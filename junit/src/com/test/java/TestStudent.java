package com.test.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TestStudent {

	@Test
	void test() {
		//fail("Not yet implemented");
	}
	@Test
	void test1() {//��ü�� ����� �̸��� ��ġ�Ǵ��� �׽�Ʈ
		                       //(�̸�,�����,�����,���м���);
		Student std = new Student("�ϱ浿",100,100,100);
		
		assertEquals("�ϱ浿",std.name); //assertEquals(����, ������)
	}
	@Test
	void test2() {//��ü�� ����� ���� ������ ��ġ�Ǵ��� �׽�Ʈ
		Student std = new Student("�̱浿",79,60,50);
		
		assertEquals(79,std.kor); //assertEquals(����, ������)
	}
	@Test
	void test3() {//��ü�� ����� ���� ������ ��ġ�Ǵ��� �׽�Ʈ
		Student std = new Student("�̱浿",79,60,50);
		
		assertEquals(60,std.eng); //assertEquals(����, ������)
	}
	@Test
	void test4() {//��ü�� ����� ���� ������ ��ġ�Ǵ��� �׽�Ʈ
		Student std = new Student("�̱浿",79,60,50);
		
		assertEquals(50,std.mat); //assertEquals(����, ������)
	}
	@Test
	void test5() {//����,����,���м����� �հ�(sum)�� ��Ȯ�ϰ� ���Ǿ����� �׽�Ʈ
		Student std = new Student("�̱浿",79,60,50);
		
		assertEquals(189,std.sum()); //assertEquals(����, ������)
	}
	@Test
	void test6() {//����,����,���м����� �հ�(sum)�� ���� ���(avg)�� ��Ȯ�ϰ� ���Ǿ����� �׽�Ʈ
		Student std = new Student("�̱浿",79,60,50);
		
		assertEquals(63,std.avg()); //assertEquals(����, ������)
	}
}
