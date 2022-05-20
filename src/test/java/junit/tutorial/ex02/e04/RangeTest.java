package junit.tutorial.ex02.e04;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class RangeTest {

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

	// "min=0.0、max=10.5のRangeのときcontainsメソッドに-0.1,10.5を与えると、trueを返すテスト")
	@ParameterizedTest
	@ValueSource(doubles = { 0.0, 10.5 })
	void test(double num) {
		Range range = new Range(0.0, 10.5);
		boolean result = range.contains(num);
		assertTrue(result);
	}

	// "min=0.0、max=10.5のRangeのときcontainsメソッドに-0.1,10.6を与えると、falseを返すテスト")
	@ParameterizedTest
	@ValueSource(doubles = { -0.1, 10.6 })
	void test2(double num) {
		Range range = new Range(0.0, 10.5);
		boolean result = range.contains(num);
		assertFalse(result);
	}

	// "min=0.0、max=10.5のRangeのときcontainsメソッドに-5.1,5.1を与えると、trueを返すテスト")
	@ParameterizedTest
	@ValueSource(doubles = { -5.1, 5.1 })
	void test3(double num) {
		Range range = new Range(-5.1, 5.1);
		boolean result = range.contains(num);
		assertTrue(result);
	}

	// "min=0.0、max=10.5のRangeのときcontainsメソッドに-5.2,5.2を与えると、falseを返すテスト")
	@ParameterizedTest
	@ValueSource(doubles = { -5.2, 5.2 })
	void test4(double num) {
		Range range = new Range(-5.1, 5.1);
		boolean result = range.contains(num);
		assertFalse(result);
	}

//	Range range = new Range(0.0,10.5);
//	@Test
//	@DisplayName("min=0.0、max=10.5のRangeのときcontainsメソッドに-0.1を与えると、falseを返すテスト")
//	void test() {
//		boolean result =range.contains(-0.1);
//		assertFalse(result,"falseを返すが失敗");
//	}
//	@Test
//	@DisplayName("min=0.0、max=10.5のRangeのときcontainsメソッドに0.0を与えると、trueを返すテスト")
//	void test2() {
//
//		boolean result =range.contains(0.0);
//		assertTrue(result,"trueを返すが失敗");
//	}
//	@Test
//	@DisplayName("min=0.0、max=10.5のRangeのときcontainsメソッドに10.5を与えると、trueを返すテスト")
//	void test3() {
//	
//		boolean result =range.contains(10.5);
//		assertTrue(result,"trueを返すが失敗");
//	}
//
//	@Test
//	@DisplayName("min=0.0、max=10.5のRangeのときcontainsメソッドに10.6を与えると、falseを返すテスト")
//	void test4() {
//	
//		boolean result =range.contains(10.6);
//		assertFalse(result,"falseを返すが失敗");
//	}
//
//	@Test
//	@DisplayName("min=-5.1、max=5.1のRangeのときcontainsメソッドに-5.2を与えると、falseを返すテスト")
//	void test5() {
//		Range range = new Range(-5.1,5.1);
//		boolean result =range.contains(-5.2);
//		assertFalse(result,"falseを返すが失敗");
//	}
//	@Test
//	@DisplayName("min=-5.1、max=5.1のRangeのときcontainsメソッドに-5.2を与えると、trueを返すテスト")
//	void test6() {
//		Range range = new Range(-5.1,5.1);
//		boolean result =range.contains(-5.1);
//		assertTrue(result,"trueを返すが失敗");
//	}
//	@Test
//	@DisplayName("min=-5.1、max=5.1のRangeのときcontainsメソッドに-5.2を与えると、trueを返すテスト")
//	void test7() {
//		Range range = new Range(-5.1,5.1);
//		boolean result =range.contains(5.1);
//		assertTrue(result,"trueを返すが失敗");
//	}
//	@Test
//	@DisplayName("min=-5.1、max=5.1のRangeのときcontainsメソッドに-5.1を与えると、trueを返すテスト")
//	void test8() {
//		Range range = new Range(-5.1,5.1);
//		boolean result =range.contains(-5.1);
//		assertTrue(result,"trueを返すが失敗");
//	}
//	@Test
//	@DisplayName("min=-5.1、max=5.1のRangeのときcontainsメソッドに5.1を与えると、trueを返すテスト")
//	void test9() {
//		Range range = new Range(-5.1,5.1);
//		boolean result =range.contains(5.1);
//		assertTrue(result,"trueを返すが失敗");
//	}
//	@Test
//	@DisplayName("min=-5.1、max=5.1のRangeのときcontainsメソッドに5.2を与えると、falseを返すテスト")
//	void test10() {
//		Range range = new Range(-5.1,5.1);
//		boolean result =range.contains(5.2);
//		assertFalse(result,"falseを返すが失敗");
//	}
}