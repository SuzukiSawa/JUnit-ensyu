package junit.tutorial.ex01.e02;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {

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
	@DisplayName("IllegalArgumentExceptionを発生させるテスト")
	void test() {
		System.out.println("IllegalArgumentExceptionを発生させるテストが呼ばれました");
		
		Calculator target = new Calculator();
			assertThrows(IllegalArgumentException.class, () -> target.divide(0,0));
	}
}
