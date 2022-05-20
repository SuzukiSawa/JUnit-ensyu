package junit.tutorial.ex01.e01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DisplayName("aaaと取得するテスト")
	void test() {
		System.out.println("aaaと取得するテストが呼ばれました");
		String result=StringUtils.toSnakeCase("aaa");
		assertEquals("aaa", result, "aaaの取得が失敗");
	}
	@Test
	@DisplayName("hello_worldと取得するテスト")
	void test2() {
		System.out.println("hello_worldと取得するテストが呼ばれました");
		String result=StringUtils.toSnakeCase("HelloWorld");
		assertEquals("hello_world", result, "hello_worldの取得が失敗");
	}
	@Test
	@DisplayName("practice_junitと取得するテスト")
	void test3() {
		System.out.println("practice_junitと取得するテストが呼ばれました");
		String result=StringUtils.toSnakeCase("practiceJunit");
		assertEquals("practice_junit", result, "practice_junitの取得が失敗");
	}
}
