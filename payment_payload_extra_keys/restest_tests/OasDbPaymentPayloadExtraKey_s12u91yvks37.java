package PaymentPayloadExtraKey;

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
public class OasDbPaymentPayloadExtraKey_s12u91yvks37 {

	private static final String OAI_JSON_URL = "/Users/alexbrahastoll/Projects/mestrado/oas_db/restest_experiment/experiment_run_1640926129/payment_payload_extra_keys/samples/payment_payload_extra_keys.json";
	private static final StatusCode5XXFilter statusCode5XXFilter = new StatusCode5XXFilter();
	private static final NominalOrFaultyTestCaseFilter nominalOrFaultyTestCaseFilter = new NominalOrFaultyTestCaseFilter();
	private static final ResponseValidationFilter validationFilter = new ResponseValidationFilter(OAI_JSON_URL);
	private static final AllureRestAssured allureFilter = new AllureRestAssured();
	private static final String APIName = "PaymentPayloadExtraKey";
	private static final String testId = "s12u91yvks37";
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
	public void test_sl3gqjhno3mu_createcharge() {
		String testResultId = "test_sl3gqjhno3mu_createcharge";

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
				.body("{\"amount\":1,\"currency\":null}")
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
	public void test_vbk6tpuynu43_createcharge() {
		String testResultId = "test_vbk6tpuynu43_createcharge";

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
				.body("{\"credit_card_id\":9223372036854775808}")
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
	public void test_1hr8ot7qtdsgx_createcharge() {
		String testResultId = "test_1hr8ot7qtdsgx_createcharge";

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
				.body("{\"credit_card_id\":1,\"currency\":\",@&w)p*[I1og0$\"}")
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
	public void test_rhr59x0arj37_createcharge() {
		String testResultId = "test_rhr59x0arj37_createcharge";

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
				.body("{\"credit_card_id\":-1}")
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
	public void test_vb6ady310e3n_readcharge() {
		String testResultId = "test_vb6ady310e3n_readcharge";

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
	public void test_1jelhtoyqre40_readcharge() {
		String testResultId = "test_1jelhtoyqre40_readcharge";

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
	public void test_1jicse94ycwmo_readcharge() {
		String testResultId = "test_1jicse94ycwmo_readcharge";

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
				.pathParam("charge_id", ":&T1m+^ScTC")
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
	public void test_qhq4nw2uy59u_readcharge() {
		String testResultId = "test_qhq4nw2uy59u_readcharge";

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
				.get("/charges/{charge_id}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_sl8xxoph81td_updatecharge() {
		String testResultId = "test_sl8xxoph81td_updatecharge";

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
				.pathParam("charge_id", "dDu`\"'|WA4baXqG:a")
				.contentType("application/json")
				.body("{\"credit_card_id\":0}")
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
	public void test_1hr5w6rca4jed_updatecharge() {
		String testResultId = "test_1hr5w6rca4jed_updatecharge";

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
				.pathParam("charge_id", "\\0")
				.contentType("application/json")
				.body("{\"credit_card_id\":9223372036854775808,\"currency\":\"one space\"}")
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
	public void test_s0x957vvlans_updatecharge() {
		String testResultId = "test_s0x957vvlans_updatecharge";

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
				.pathParam("charge_id", "9223372036854775808")
				.contentType("application/json")
				.body("{\"amount\":1,\"credit_card_id\":-2147483648}")
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
	public void test_rl2twd0tzbqu_updatecharge() {
		String testResultId = "test_rl2twd0tzbqu_updatecharge";

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
				.pathParam("charge_id", "Mz'b)M[-XJ\"C7(20.BRI")
				.contentType("application/json")
				.body("{\"currency\":\"`)Ta_uj@iui0$W?JPq\"}")
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
	public void test_1hravxn47f395_deletecharge() {
		String testResultId = "test_1hravxn47f395_deletecharge";

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
	public void test_urmvj2jppvty_deletecharge() {
		String testResultId = "test_urmvj2jppvty_deletecharge";

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
				.pathParam("charge_id", "'Gd?ZKOTLYkT[A(JW~%c")
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
	public void test_1hr8nn8ekvgol_deletecharge() {
		String testResultId = "test_1hr8nn8ekvgol_deletecharge";

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
				.pathParam("charge_id", "2147483648")
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
	public void test_r1fn0mwsqa7o_deletecharge() {
		String testResultId = "test_r1fn0mwsqa7o_deletecharge";

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
				.pathParam("charge_id", "18446744073709551616")
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
