package com.dustmq.sample;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SimpleTest {

	/**
	 * ��ü �׽�Ʈ ���̽��� ���۵Ǳ� ���� �ѹ��� ����˴ϴ�.
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass ����");
	}

	/**
	 * ��ü �׽�Ʈ ���̽��� ���� �� �ѹ��� ����˴ϴ�.
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass ����");
	}

	/**
	 * �׽�Ʈ ���̽��� ������ ������ �������� ����˴ϴ�.
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		System.out.println("setUp ����");
	}

	/**
	 * �׽�Ʈ ���̽��� ������ ���� ���� �� ����˴ϴ�.
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		System.out.println("tearDown ����");
	}

	/**
	 * �׽�Ʈ ���̽��� �����մϴ�.
	 */
	@Test
	public void test() {
		System.out.println("test ����");
		//fail("Not yet implemented");
		String test = "SimpleTest";
		assertEquals("SimpleTest", test);
	}
}
