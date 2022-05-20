package junit.tutorial.ex02.e05;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ConsumptionTaxTest {

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

	@ParameterizedTest
	@DisplayName("金額を引数に与えると消費税込み(税率５％）の金額を返すメソッドのテスト")
	@CsvSource({ "100,105", "3000,3150", "50,52" })
	void test(int price,int price2) {
		ConsumptionTax consumptionTax = new ConsumptionTax(5);
		int result =consumptionTax.apply(price);
		System.out.println(result);
		assertEquals(price2,result);
	}
	@ParameterizedTest
	@DisplayName("金額を引数に与えると消費税込み(税率１０％）の金額を返すメソッドのテスト")
	@CsvSource({ "50,55" })
	void test2(int price,int price2) {
		ConsumptionTax consumptionTax = new ConsumptionTax(10);
		int result =consumptionTax.apply(price);
		System.out.println(result);
		assertEquals(price2,result);
	}
	@ParameterizedTest
	@DisplayName("金額を引数に与えると消費税込み(税率3％）の金額を返すメソッドのテスト")
	@CsvSource({ "50,51" })
	void test3(int price,int price2) {
		ConsumptionTax consumptionTax = new ConsumptionTax(3);
		int result =consumptionTax.apply(price);
		System.out.println(result);
		assertEquals(price2,result);
	}


}






//金額を引数に与えると消費税込みの金額を返すメソッドのテストを作成せよ。
// なお、消費税はコンストラクタで指定し、税額は小数点以下を切り捨てとする
//消費税を表すConsumptionTaxクラスを作成し、金額を引数に与えると
// 消費税込みの金額を返すメソッドのテストを作成せよ。
// なお、消費税はコンストラクタで指定し、税額は小数点以下を切り捨てとする
