package junit.tutorial.ex01.e03;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CounterTest {

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
	@DisplayName("初期状態で、incrementメソッドを実行し１を取得するテスト")
	void testPower() {
		System.out.println("incrementメソッドを実行し１を取得するテストが呼ばれました");
		Counter counter = new Counter();
		int result = counter.increment();
		assertEquals(1, result, "1の取得が失敗");
	}

	@Test
	@DisplayName("incrementメソッドを２回実行し2を取得するテスト")
	void testPower2() {
		System.out.println("incrementメソッドを実行し2を取得するテストが呼ばれました");
		Counter counter = new Counter();
		int result = counter.increment();
		int result2 = counter.increment();
		assertEquals(2, result2, "2の取得が失敗");
	}

	@Test
	@DisplayName("incrementメソッドを50回実行→incrementメソッドを５１を取得するテスト")
	void testPower3() {
		System.out.println("incrementメソッドを50回実行→incrementメソッドを５１を取得するテストが呼ばれました");
		Counter counter = new Counter();

		int total = 0;
		for (int i = 0; i < 51; i++) {
			total = counter.increment();
		}
		assertEquals(51, total, "５１の取得が失敗");
	}
}
