package apipoc;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com/users/";
		RequestSpecification currentRequest=RestAssured.given();
		Response currentResponse= currentRequest.get().thenReturn();
		System.out.print(currentResponse.asString());
		System.out.print(currentResponse.getStatusCode());
		System.out.print(currentResponse.getTime());
		System.out.print(currentResponse.contentType());

	}

}
