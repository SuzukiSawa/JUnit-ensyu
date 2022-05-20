package junit.tutorial.ex02.e02;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.InputStream;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class EmployeeTest {

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
	@DisplayName("テキストファイルを指定し、名前、名字、メールアドレスが反映されたEmployeeオブジェクトのリストを取得するテスト")
	void test() {
		InputStream InputStream = Employee.class.getResourceAsStream("Employee.txt");
		List<Employee> answerList =Employee.load(InputStream);
		
		
		assertAll("person",
				() -> assertEquals("Ichiro", answerList.get(0).getFirstName()),
				() -> assertEquals("Tanaka", answerList.get(0).getLastName()),
				() -> assertEquals("ichiro@example.com", answerList.get(0).getEmail())
			);
	}
}
