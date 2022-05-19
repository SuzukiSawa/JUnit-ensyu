package junit.tutorial.ex01.e05;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ItemStockTest {

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
	@DisplayName("初期状態で、getNumで０を取得するテスト")
	void testPower() {
		System.out.println("初期状態で、getNumで０を取得するテストが呼ばれました");
		ItemStock itemstock = new ItemStock();
		Item item = new Item(null, 0);
		int result = itemstock.getNum(item);
		assertEquals(0, result, "getNumで０の取得が失敗");
	}

	@Test
	@DisplayName("初期状態で、Itemを追加するとgetNumで１を取得するテスト")
	void testPower2() {
		System.out.println("初期状態で、Itemを追加するとgetNumで１を取得するテストが呼ばれました");
		ItemStock itemstock = new ItemStock();
		Item item = new Item(null, 0);

		itemstock.add(item);
		
		int result = itemstock.getNum(item);

		assertEquals(1, result, "getNumで１の取得が失敗");
	}
	@Test
	@DisplayName("Itemが1つ追加されている状態でgetNumで１を取得するテスト")
	void testPower3() {
		System.out.println("Itemが1つ追加されている状態でgetNumで１を取得するテストが呼ばれました");
		ItemStock itemstock = new ItemStock();
		Item item = new Item("book",1000);
		itemstock.add(item);
		int result = itemstock.getNum(item);
		assertEquals(1, result, "getNumで１の取得が失敗");
	}
	@Test
	@DisplayName("Itemが１つ追加されている状態で、addで同じItemオブジェクトを追加するとgetNumで２を取得するテスト")
	void testPower4() {
		System.out.println("Itemが１つ追加されている状態で、addで同じItemオブジェクトを追加するとgetNumで２が取得できるテストが呼ばれました");
		ItemStock itemstock = new ItemStock();
		Item item = new Item("book",1000);
		itemstock.add(item);
		Item item2 = new Item("book",1000);
		itemstock.add(item2);
		int result = itemstock.getNum(item2);
		assertEquals(2, result, "getNumで２の取得が失敗");
	
	}

	@Test
	@DisplayName("Itemが１つ追加されている状態で、addで異なるItemオブジェクトを追加するとgetNumで１を取得するテスト")
	void testPower5() {
		System.out.println("Itemが１つ追加されている状態で、addで同じItemオブジェクトを追加するとgetNumで２が取得できるテストが呼ばれました");
		ItemStock itemstock = new ItemStock();
		Item item = new Item("book",1000);
		itemstock.add(item);
		Item item2 = new Item("CD",2000);
		itemstock.add(item2);
		int result = itemstock.getNum(item2);
		assertEquals(1, result, "getNumで1の取得が失敗");

}
}