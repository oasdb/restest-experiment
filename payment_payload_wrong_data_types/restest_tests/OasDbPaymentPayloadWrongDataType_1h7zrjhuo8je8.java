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
public class OasDbPaymentPayloadWrongDataType_1h7zrjhuo8je8 {

	private static final String OAI_JSON_URL = "/Users/alexbrahastoll/Projects/mestrado/oas_db/restest_experiment/experiment_run_1640926129/payment_payload_wrong_data_types/samples/payment_payload_wrong_data_types.json";
	private static final StatusCode5XXFilter statusCode5XXFilter = new StatusCode5XXFilter();
	private static final NominalOrFaultyTestCaseFilter nominalOrFaultyTestCaseFilter = new NominalOrFaultyTestCaseFilter();
	private static final ResponseValidationFilter validationFilter = new ResponseValidationFilter(OAI_JSON_URL);
	private static final AllureRestAssured allureFilter = new AllureRestAssured();
	private static final String APIName = "PaymentPayloadWrongDataType";
	private static final String testId = "1h7zrjhuo8je8";
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
	public void test_1ji7qdflfmng6_createcharge() {
		String testResultId = "test_1ji7qdflfmng6_createcharge";

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
	public void test_1jeadveshuuzo_createcharge() {
		String testResultId = "test_1jeadveshuuzo_createcharge";

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
				.body("{\"credit_card_id\":4294967296,\"currency\":\")qZ,JF:W9,\"}")
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
	public void test_s4p1pbmtnsdi_createcharge() {
		String testResultId = "test_s4p1pbmtnsdi_createcharge";

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
	public void test_qdvidcry6cl0_createcharge() {
		String testResultId = "test_qdvidcry6cl0_createcharge";

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
				.body("{\"amount\":9223372036854775808,\"credit_card_id\":2147483648}")
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
	public void test_urumnp2dx5wz_readcharge() {
		String testResultId = "test_urumnp2dx5wz_readcharge";

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
				.pathParam("charge_id", "U.xhJ4XwZ[gy;LtT")
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
	public void test_tofpldmhu9gi_readcharge() {
		String testResultId = "test_tofpldmhu9gi_readcharge";

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
				.pathParam("charge_id", "EbX!F L+K}W")
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
	public void test_ublw6b5yvi3l_readcharge() {
		String testResultId = "test_ublw6b5yvi3l_readcharge";

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
				.pathParam("charge_id", "acN~7B+XUa#hM")
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
	public void test_vf46dqkqihbr_readcharge() {
		String testResultId = "test_vf46dqkqihbr_readcharge";

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
				.pathParam("charge_id", ": T(}LGf$:)?l7\"ErNl0")
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
	public void test_u7rtrpuuqfdv_updatecharge() {
		String testResultId = "test_u7rtrpuuqfdv_updatecharge";

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
				.contentType("application/json")
				.body("{\"amount\":1.100000023841858,\"credit_card_id\":\"randomString\"}")
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
	public void test_qxtba4akrlth_updatecharge() {
		String testResultId = "test_qxtba4akrlth_updatecharge";

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
				.body("{\"credit_card_id\":9223372036854775808,\"currency\":\"\\\\0\"}")
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
	public void test_vf6zbfj5k75f_updatecharge() {
		String testResultId = "test_vf6zbfj5k75f_updatecharge";

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
				.pathParam("charge_id", "T\\dDO,_Z!k1%Y:[e")
				.contentType("application/json")
				.body("{\"amount\":0}")
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
	public void test_ts1yj9cjiv5c_updatecharge() {
		String testResultId = "test_ts1yj9cjiv5c_updatecharge";

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
				.pathParam("charge_id", "D^[3r$AWWR")
				.contentType("application/json")
				.body("{\"credit_card_id\":18446744073709551616,\"currency\":\"one space\"}")
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
	public void test_t8a58hgenzua_deletecharge() {
		String testResultId = "test_t8a58hgenzua_deletecharge";

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
				.pathParam("charge_id", "zSq^C6CDb~4l[]F")
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
	public void test_1iykibrq9n3he_deletecharge() {
		String testResultId = "test_1iykibrq9n3he_deletecharge";

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
				.pathParam("charge_id", "-9223372036854775808")
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
	public void test_1iuyrbb2m9lra_deletecharge() {
		String testResultId = "test_1iuyrbb2m9lra_deletecharge";

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
	public void test_qxl1ifdrq6ox_deletecharge() {
		String testResultId = "test_qxl1ifdrq6ox_deletecharge";

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
				.pathParam("charge_id", "3qZ>HkNYNDm_7Nt")
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
