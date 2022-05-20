package junit.tutorial.ex02.e06;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FrameworksTest {

	private static final ApplicationServer GlassFish = null;

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

	// GlassFishの時、データベースのすべての組み合わせでサポートをtrueで返すテスト
	@ParameterizedTest
	@DisplayName("GlassFishの時、すべてのデータベースの組み合わせでサポートをtrueで返すテスト")
	@CsvSource({ "GlassFish,Oracle", "GlassFish,DB2", "GlassFish,PostgreSQL", "GlassFish,MySQL" })
	void test(ApplicationServer appServer, Database db) {
		Frameworks frameworks = new Frameworks();
		boolean result = frameworks.isSupport(appServer, db);

		assertTrue(result);
	}

	// Tomcatの時、Oracle, DB2, PostgreSQLそれぞれでサポートをfalseで返すテスト
	@ParameterizedTest
	@DisplayName("Tomcatの時、Oracle, DB2, PostgreSQLそれぞれサポートをfalseで返すテスト")
	@CsvSource({ "Tomcat,Oracle", "Tomcat,DB2", "Tomcat,PostgreSQL" })
	void test2(ApplicationServer appServer, Database db) {
		Frameworks frameworks = new Frameworks();
		boolean result = frameworks.isSupport(appServer, db);

		assertFalse(result);
	}

	// Tomcatの時、MySQLとの組み合わせでサポートをtrueで返すテスト
	@ParameterizedTest
	@DisplayName("Tomcatの時、MySQLとの組み合わせでサポートをtrueで返すテスト")
	@CsvSource({ "Tomcat,MySQL" })
	void test3(ApplicationServer appServer, Database db) {
		Frameworks frameworks = new Frameworks();
		boolean result = frameworks.isSupport(appServer, db);

		assertTrue(result);

	}

	// JBossの時、DB2とPostgreSQLとの組み合わせでサポートをtrueで返すテスト
	@ParameterizedTest
	@DisplayName("JBossの時、DB2とPostgreSQLとの組み合わせでサポートをtrueで返すテスト")
	@CsvSource({ "JBoss,DB2", "JBoss,PostgreSQL" })
	void test4(ApplicationServer appServer, Database db) {
		Frameworks frameworks = new Frameworks();
		boolean result = frameworks.isSupport(appServer, db);

		assertTrue(result);

	}

	// JBossの時、OracleとMySQLとの組み合わせでサポートをfalseで返すテスト
	@ParameterizedTest
	@DisplayName("JBossの時、OracleとPostgreSQLとの組み合わせでサポートをfalseで返すテスト")
	@CsvSource({ "Tomcat,Oracle", "Tomcat,DB2", "Tomcat,PostgreSQL" })
	void test5(ApplicationServer appServer, Database db) {
		Frameworks frameworks = new Frameworks();
		boolean result = frameworks.isSupport(appServer, db);

	}
}