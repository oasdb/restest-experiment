package ProjectManagementInvalidExample;

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
public class OasDbProjectManagementInvalidExample_1hv2pl9t91vld {

	private static final String OAI_JSON_URL = "/Users/alexbrahastoll/Projects/mestrado/oas_db/restest_experiment/experiment_run_1640926129/project_management_invalid_examples/samples/project_management_invalid_examples.json";
	private static final StatusCode5XXFilter statusCode5XXFilter = new StatusCode5XXFilter();
	private static final NominalOrFaultyTestCaseFilter nominalOrFaultyTestCaseFilter = new NominalOrFaultyTestCaseFilter();
	private static final ResponseValidationFilter validationFilter = new ResponseValidationFilter(OAI_JSON_URL);
	private static final AllureRestAssured allureFilter = new AllureRestAssured();
	private static final String APIName = "ProjectManagementInvalidExample";
	private static final String testId = "1hv2pl9t91vld";
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
	public void test_qy4edi0hfo12_createproject() {
		String testResultId = "test_qy4edi0hfo12_createproject";

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
				.body("{\"name\":\"\"}")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.post("/projects");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hv5ixfzrds1f_createproject() {
		String testResultId = "test_1hv5ixfzrds1f_createproject";

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
				.body("{\"description\":\"\\\\0\",\"name\":\"EI#]m9!{@yeCE\"}")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.post("/projects");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1k1x9wja2alb7_createproject() {
		String testResultId = "test_1k1x9wja2alb7_createproject";

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
				.body("{\"name\":\"vCF6LB|h[W[F}\"}")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.post("/projects");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_u8dzw9zskrw8_createproject() {
		String testResultId = "test_u8dzw9zskrw8_createproject";

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
				.body("{\"description\":\"randomString\"}")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.post("/projects");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_too0x71hwkl3_readproject() {
		String testResultId = "test_too0x71hwkl3_readproject";

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
				.pathParam("project_id", "0")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/projects/{project_id}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_urp68e75i3i0_readproject() {
		String testResultId = "test_urp68e75i3i0_readproject";

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
				.pathParam("project_id", "18446744073709551616")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/projects/{project_id}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hv0gljhcochc_readproject() {
		String testResultId = "test_1hv0gljhcochc_readproject";

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
				.pathParam("project_id", "EUN9}4>},.qBN6MNHZ")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/projects/{project_id}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jei984m5b338_readproject() {
		String testResultId = "test_1jei984m5b338_readproject";

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
				.pathParam("project_id", "-1")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/projects/{project_id}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_sl0n03xirqsi_updateproject() {
		String testResultId = "test_sl0n03xirqsi_updateproject";

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
				.pathParam("project_id", "randomString")
				.contentType("application/json")
				.body("{}")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.put("/projects/{project_id}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iemoc5aymv5h_updateproject() {
		String testResultId = "test_1iemoc5aymv5h_updateproject";

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
				.pathParam("project_id", "m+wP&m|Y[l2mDskF")
				.contentType("application/json")
				.body("{}")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.put("/projects/{project_id}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_trtkvhke5b37_updateproject() {
		String testResultId = "test_trtkvhke5b37_updateproject";

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
				.pathParam("project_id", "@@|A7fYSA||<XTfah")
				.contentType("application/json")
				.body("{}")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.put("/projects/{project_id}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_r1ivy32afdyc_updateproject() {
		String testResultId = "test_r1ivy32afdyc_updateproject";

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
				.pathParam("project_id", "=n&%qm?Dsy")
				.contentType("application/json")
				.body("{\"name\":\"$_]f[\\\\%oc^^J1A@]11o~\"}")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.put("/projects/{project_id}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1k1rpyuhk1wz5_deleteproject() {
		String testResultId = "test_1k1rpyuhk1wz5_deleteproject";

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
				.pathParam("project_id", "~\\aW'~^n5xx]gNvB")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.delete("/projects/{project_id}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jidb637u5um0_deleteproject() {
		String testResultId = "test_1jidb637u5um0_deleteproject";

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
				.pathParam("project_id", "9223372036854775808")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.delete("/projects/{project_id}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_s4xcyag85lbn_deleteproject() {
		String testResultId = "test_s4xcyag85lbn_deleteproject";

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
				.pathParam("project_id", "null")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.delete("/projects/{project_id}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t8445m5uu8fm_deleteproject() {
		String testResultId = "test_t8445m5uu8fm_deleteproject";

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
				.pathParam("project_id", ".C/ek`[$,kkobv8ou(")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.delete("/projects/{project_id}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

}
