package PaymentInvalidExample;

import org.junit.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.FixMethodOrder;
import static org.junit.Assert.fail;
import com.fasterxml.jackson.databind.ObjectMapper;
import static org.junit.Assert.assertTrue;
import org.junit.runners.MethodSorters;
import io.qameta.allure.restassured.AllureRestAssured;
import es.us.isa.restest.testcases.restassured.filters.StatusCode5XXFilter;
import es.us.isa.restest.testcases.restassured.filters.NominalOrFaultyTestCaseFilter;
import es.us.isa.restest.testcases.restassured.filters.StatefulFilter;
import java.io.File;
import es.us.isa.restest.testcases.restassured.filters.ResponseValidationFilter;
import es.us.isa.restest.testcases.restassured.filters.CSVFilter;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OasDbPaymentInvalidExample_urhcdjwrvk9y {

	private static final String OAI_JSON_URL = "/Users/alexbrahastoll/Projects/mestrado/oas_db/restest_experiment/experiment_run_1640926129/payment_invalid_examples/samples/payment_invalid_examples.json";
	private static final StatusCode5XXFilter statusCode5XXFilter = new StatusCode5XXFilter();
	private static final NominalOrFaultyTestCaseFilter nominalOrFaultyTestCaseFilter = new NominalOrFaultyTestCaseFilter();
	private static final ResponseValidationFilter validationFilter = new ResponseValidationFilter(OAI_JSON_URL);
	private static final AllureRestAssured allureFilter = new AllureRestAssured();
	private static final String APIName = "PaymentInvalidExample";
	private static final String testId = "urhcdjwrvk9y";
	private static final CSVFilter csvFilter = new CSVFilter(APIName, testId);

	@BeforeClass
	public static void setUp() {
		RestAssured.baseURI = "http://localhost:3000";

		statusCode5XXFilter.setAPIName(APIName);
		statusCode5XXFilter.setTestId(testId);
		nominalOrFaultyTestCaseFilter.setAPIName(APIName);
		nominalOrFaultyTestCaseFilter.setTestId(testId);
		validationFilter.setAPIName(APIName);
		validationFilter.setTestId(testId);
	}

	@Test
	public void test_sopq7dhhbbs4_createcharge() {
		String testResultId = "test_sopq7dhhbbs4_createcharge";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, false, "null");
		statusCode5XXFilter.updateFaultyData(false, false, "null");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.contentType("application/json")
				.body("{\"amount\":-9223372036854775808,\"credit_card_id\":\"randomString\"}")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.post("/charges");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_soejj7e94qia_createcharge() {
		String testResultId = "test_soejj7e94qia_createcharge";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, false, "null");
		statusCode5XXFilter.updateFaultyData(false, false, "null");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.contentType("application/json")
				.body("{\"currency\":\"\\\\0\"}")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.post("/charges");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_vb9mfbkrtgmc_createcharge() {
		String testResultId = "test_vb9mfbkrtgmc_createcharge";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, false, "null");
		statusCode5XXFilter.updateFaultyData(false, false, "null");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.contentType("application/json")
				.body("{\"amount\":-9223372036854775808}")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.post("/charges");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hrutge5de88o_createcharge() {
		String testResultId = "test_1hrutge5de88o_createcharge";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, false, "null");
		statusCode5XXFilter.updateFaultyData(false, false, "null");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.contentType("application/json")
				.body("{}")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.post("/charges");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1ib0yt2g0gig3_readcharge() {
		String testResultId = "test_1ib0yt2g0gig3_readcharge";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, false, "null");
		statusCode5XXFilter.updateFaultyData(false, false, "null");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.pathParam("charge_id", "F,yys8WzU3;G4P")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/charges/{charge_id}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_us085mlesta1_readcharge() {
		String testResultId = "test_us085mlesta1_readcharge";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, false, "null");
		statusCode5XXFilter.updateFaultyData(false, false, "null");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.pathParam("charge_id", "QaEOHp/kixgc%:*(6`R2")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/charges/{charge_id}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1ibh3imv2qywk_readcharge() {
		String testResultId = "test_1ibh3imv2qywk_readcharge";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, false, "null");
		statusCode5XXFilter.updateFaultyData(false, false, "null");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.pathParam("charge_id", "Soo~~N8;W~Cz")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/charges/{charge_id}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_r1albxg82zhz_readcharge() {
		String testResultId = "test_r1albxg82zhz_readcharge";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, false, "null");
		statusCode5XXFilter.updateFaultyData(false, false, "null");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.pathParam("charge_id", "4294967296")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/charges/{charge_id}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1huxp5dxkzynn_updatecharge() {
		String testResultId = "test_1huxp5dxkzynn_updatecharge";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, false, "null");
		statusCode5XXFilter.updateFaultyData(false, false, "null");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.pathParam("charge_id", "~`?mUw}/9xtJ^fZJa&[")
				.contentType("application/json")
				.body("{\"amount\":1,\"currency\":\"one space\"}")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.put("/charges/{charge_id}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_vbmylnb9ti01_updatecharge() {
		String testResultId = "test_vbmylnb9ti01_updatecharge";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, false, "null");
		statusCode5XXFilter.updateFaultyData(false, false, "null");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.pathParam("charge_id", "!;N5E#d/-wIN")
				.contentType("application/json")
				.body("{\"amount\":18446744073709551616,\"credit_card_id\":18446744073709551616,\"currency\":\"\\\\0\"}")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.put("/charges/{charge_id}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_u82fbvlhdf8j_updatecharge() {
		String testResultId = "test_u82fbvlhdf8j_updatecharge";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, false, "null");
		statusCode5XXFilter.updateFaultyData(false, false, "null");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.pathParam("charge_id", "1.1")
				.contentType("application/json")
				.body("{\"amount\":-9223372036854775808,\"currency\":\"\"}")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.put("/charges/{charge_id}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_vbpoezqniu04_updatecharge() {
		String testResultId = "test_vbpoezqniu04_updatecharge";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, false, "null");
		statusCode5XXFilter.updateFaultyData(false, false, "null");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.pathParam("charge_id", "e.?z2\\*);2")
				.contentType("application/json")
				.body("{}")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.put("/charges/{charge_id}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1ibbjl9ik4mr9_deletecharge() {
		String testResultId = "test_1ibbjl9ik4mr9_deletecharge";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, false, "null");
		statusCode5XXFilter.updateFaultyData(false, false, "null");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.pathParam("charge_id", "atY19A<RS]]>>`P")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.delete("/charges/{charge_id}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_uvgwdutvs46s_deletecharge() {
		String testResultId = "test_uvgwdutvs46s_deletecharge";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, false, "null");
		statusCode5XXFilter.updateFaultyData(false, false, "null");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.pathParam("charge_id", "null")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.delete("/charges/{charge_id}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_us30bh66qcme_deletecharge() {
		String testResultId = "test_us30bh66qcme_deletecharge";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, false, "null");
		statusCode5XXFilter.updateFaultyData(false, false, "null");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.pathParam("charge_id", "1")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.delete("/charges/{charge_id}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_s102gy9tcrxg_deletecharge() {
		String testResultId = "test_s102gy9tcrxg_deletecharge";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, false, "null");
		statusCode5XXFilter.updateFaultyData(false, false, "null");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.pathParam("charge_id", "null")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.delete("/charges/{charge_id}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

}
