package PaymentPayloadWrongDataType;

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
public class OasDbPaymentPayloadWrongDataType_1iyi9997lw5km {

	private static final String OAI_JSON_URL = "/Users/alexbrahastoll/Projects/mestrado/oas_db/restest_experiment/experiment_run_1640926129/payment_payload_wrong_data_types/samples/payment_payload_wrong_data_types.json";
	private static final StatusCode5XXFilter statusCode5XXFilter = new StatusCode5XXFilter();
	private static final NominalOrFaultyTestCaseFilter nominalOrFaultyTestCaseFilter = new NominalOrFaultyTestCaseFilter();
	private static final ResponseValidationFilter validationFilter = new ResponseValidationFilter(OAI_JSON_URL);
	private static final AllureRestAssured allureFilter = new AllureRestAssured();
	private static final String APIName = "PaymentPayloadWrongDataType";
	private static final String testId = "1iyi9997lw5km";
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
	public void test_tol5k8ynexr9_createcharge() {
		String testResultId = "test_tol5k8ynexr9_createcharge";

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
				.body("{\"credit_card_id\":\"\"}")
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
	public void test_1jyda9o0m7vq9_createcharge() {
		String testResultId = "test_1jyda9o0m7vq9_createcharge";

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
				.body("{\"amount\":0,\"credit_card_id\":-9223372036854775808,\"currency\":null}")
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
	public void test_vf3pasabc57m_createcharge() {
		String testResultId = "test_vf3pasabc57m_createcharge";

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
				.body("{\"amount\":-179769313486231570000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000.000001}")
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
	public void test_r1a46icupap1_createcharge() {
		String testResultId = "test_r1a46icupap1_createcharge";

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
				.body("{\"amount\":-179769313486231570000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000.000001,\"credit_card_id\":\"\\\\0\"}")
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
	public void test_qe1letqsexd0_readcharge() {
		String testResultId = "test_qe1letqsexd0_readcharge";

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
				.pathParam("charge_id", "0")
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
	public void test_1jyd7xlapf12u_readcharge() {
		String testResultId = "test_1jyd7xlapf12u_readcharge";

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
				.pathParam("charge_id", "randomString")
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
	public void test_rhrodcz34bw8_readcharge() {
		String testResultId = "test_rhrodcz34bw8_readcharge";

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
				.pathParam("charge_id", "cqDnhH7E/'i%qO%l")
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
	public void test_s1jgideq2gyr_readcharge() {
		String testResultId = "test_s1jgideq2gyr_readcharge";

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
				.pathParam("charge_id", "0uId+OTr7B\"A;")
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
	public void test_urv6gx43t3cg_updatecharge() {
		String testResultId = "test_urv6gx43t3cg_updatecharge";

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
	public void test_s4sdo4go0v94_updatecharge() {
		String testResultId = "test_s4sdo4go0v94_updatecharge";

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
				.pathParam("charge_id", "'U#?H9..E!-_uLV2(G")
				.contentType("application/json")
				.body("{\"credit_card_id\":2147483648}")
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
	public void test_qdysgyxjwje8_updatecharge() {
		String testResultId = "test_qdysgyxjwje8_updatecharge";

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
				.contentType("application/json")
				.body("{\"amount\":\"\\\\0\",\"credit_card_id\":-2147483648}")
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
	public void test_s1b4q44g3zhe_updatecharge() {
		String testResultId = "test_s1b4q44g3zhe_updatecharge";

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
				.pathParam("charge_id", "0")
				.contentType("application/json")
				.body("{\"amount\":18446744073709551616,\"credit_card_id\":\"\\\\0\",\"currency\":null}")
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
	public void test_1jeo97jnrsvg7_deletecharge() {
		String testResultId = "test_1jeo97jnrsvg7_deletecharge";

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
				.pathParam("charge_id", " 4S|K^mp1.k~RF")
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
	public void test_rhug328xlpo3_deletecharge() {
		String testResultId = "test_rhug328xlpo3_deletecharge";

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
				.pathParam("charge_id", "%&=O&v_e]'g")
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
	public void test_uvjqhve1ewj9_deletecharge() {
		String testResultId = "test_uvjqhve1ewj9_deletecharge";

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
				.pathParam("charge_id", "QD3Z,'rRMC]W((!PL")
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
	public void test_ts572krrfodz_deletecharge() {
		String testResultId = "test_ts572krrfodz_deletecharge";

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
				.pathParam("charge_id", "randomString")
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
