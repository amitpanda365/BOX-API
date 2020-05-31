package com.box.app;

import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;

@SpringBootApplication
public class BoxApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoxApiApplication.class, args);
		createFolder();

	}

	public static void getFolderDetails() {
		HttpHeaders headers = new HttpHeaders();
		headers.setBearerAuth("hEt9WUJzpK0QRO8PNCfDd5kcClwv7BOU");
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<Object> reqEnt = new HttpEntity<>(headers);

		RestTemplate rt = new RestTemplate();
		ResponseEntity<String> re = rt.exchange("https://api.box.com/2.0/folders/114424599541", HttpMethod.GET, reqEnt,
				String.class);

		HttpStatus status = re.getStatusCode();
		System.out.println(status);

		String body = re.getBody();
		System.out.println(body);
	}

	public static void createFolder() {
		HttpHeaders headers = new HttpHeaders();
		headers.setBearerAuth("oDEb4VRWL6sqraos9RiWqmVEwYC14Nvw");
		headers.setContentType(MediaType.APPLICATION_JSON);

		String source = "{ \"name\": \"Spring Boot 7\", \"parent\": { \"id\": \"114477301130\" } }";

		// JSONObject jo = new JSONObject(source);
		HttpEntity<Object> reqEnt = new HttpEntity<>(source, headers);

		RestTemplate rt = new RestTemplate();
		ResponseEntity<String> re = rt.exchange("https://api.box.com/2.0/folders", HttpMethod.POST, reqEnt,
				String.class);

		HttpStatus status = re.getStatusCode();
		System.out.println(status);

		String resBody = re.getBody();
		System.out.println(resBody);
		
		Gson g = new Gson();
		
		Folder2 fd = g.fromJson(resBody, Folder2.class);
		System.out.println(fd);
		uploadFile(fd.getId());
	}

	public static void uploadFile(String folerID) {
		HttpHeaders headers = new HttpHeaders();
		headers.setBearerAuth("oDEb4VRWL6sqraos9RiWqmVEwYC14Nvw");
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setContentType(MediaType.MULTIPART_FORM_DATA);
		
		String jsonBodyData = "{\"name\":\"test\", \"parent\":{\"id\":\""
				+ folerID
				+ "\"}}";
		
		System.out.println(jsonBodyData);

		MultiValueMap<String, Object> body = new LinkedMultiValueMap<>();
		body.add("file", getFile());
		body.add("attributes", jsonBodyData);

		HttpEntity<Object> reqEnt = new HttpEntity<>(body, headers);

		RestTemplate rt = new RestTemplate();
		ResponseEntity<String> re = rt.exchange("https://upload.box.com/api/2.0/files/content", HttpMethod.POST, reqEnt,
				String.class);

		HttpStatus status = re.getStatusCode();
		System.out.println(status);

		String resBody = re.getBody();
		System.out.println(resBody);
	}

	private static FileSystemResource getFile() {
		File file = new File("D:/test 2.txt");
		return new FileSystemResource(file);
	}

}
