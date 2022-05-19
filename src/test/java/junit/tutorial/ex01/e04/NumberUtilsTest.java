package junit.tutorial.ex01.e04;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NumberUtilsTest {

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
	@DisplayName("１０を与えると、trueを返すテスト")
	void testPower() {
		System.out.println("１０を与えると、trueを返すテストが呼ばれました");
		boolean result = NumberUtils.isEven(10);
		
		assertEquals(true, result, "trueを返すが失敗");	

	}

	@Test
	@DisplayName("７を与えると、falseを返すテスト")
	void testPower2() {
		System.out.println("7を与えると、falseを返すテストが呼ばれました");
		boolean result = NumberUtils.isEven(7);
		
		assertEquals(false, result, "falseを返すが失敗");	

	}

}
